package ru.aptu;

import ru.aptu.xml.ASTTree;
import ru.aptu.xml.ast.AstInner;
import ru.aptu.xml.ast.AstInput;
import ru.aptu.xml.ast.AstTag;
import ru.aptu.xml.ast.AstTagText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void printHelp() {
        System.out.println("Please enter path to *.xml file.");
    }

    public static void printAstTag(AstTag tree, int offset) {

        for (int i = 0; i <= offset; i++)
            System.out.print(" ");
        System.out.println("<" + tree.getName() + ">");
        List<AstInner> inner = tree.getInner();
        boolean prevWasTag = true;
        for (AstInner e : inner) {
            if (e.getElem() != null) {
                System.out.println();
                printAstTag(e.getElem(), offset + 2);
                prevWasTag = true;
            } else {
                if (prevWasTag) {
                    for (int i = 0; i <= offset + 1; i++)
                        System.out.print(" ");
                    prevWasTag = false;
                }
                System.out.print(" " + e.getElem2().getText());
            }
        }
        for (int i = 0; i <= offset; i++)
            System.out.print(' ');
        System.out.println("</" + tree.getName() + ">");

    }

    public static void main(String[] args) {
        if (args.length < 1) {
            printHelp();
            System.exit(1);
        }
        BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader(args[0]));
        } catch (IOException e) {
            System.out.println("Error: can't open the file.");
            System.exit(2);
        }
        char[] buf = new char[10000];
        int len = 0;
        try {
            len = r.read(buf, 0, 10000);
        } catch (IOException e) {
            System.out.println("Error: can't read the file.");
            System.exit(3);
        }
        
        ASTTree<AstInput> tree = ASTTree.parse(new ASTTree.TextSource(args[0], Arrays.copyOf(buf, len), 1));

        for (ASTTree.ASTProblem e : tree.getErrors()) {
            System.out.println(e.getMessage() +
                    ". Column " + tree.getSource().columnForOffset(e.getOffset()));
        }

        if (tree.getErrors().isEmpty())
            printAstTag(tree.getRoot().getRts(), 0);
        else
            System.exit(10);

    }
}
