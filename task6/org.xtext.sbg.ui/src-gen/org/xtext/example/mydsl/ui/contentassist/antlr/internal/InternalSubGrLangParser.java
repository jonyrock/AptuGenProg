package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SubGrLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSubGrLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'follow'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSubGrLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSubGrLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSubGrLangParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g"; }


     
     	private SubGrLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SubGrLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:61:1: ( ruleModel EOF )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:69:1: ruleModel : ( ( rule__Model__PersonsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:73:2: ( ( ( rule__Model__PersonsAssignment )* ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:74:1: ( ( rule__Model__PersonsAssignment )* )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:74:1: ( ( rule__Model__PersonsAssignment )* )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:75:1: ( rule__Model__PersonsAssignment )*
            {
             before(grammarAccess.getModelAccess().getPersonsAssignment()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:76:1: ( rule__Model__PersonsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:76:2: rule__Model__PersonsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__PersonsAssignment_in_ruleModel94);
            	    rule__Model__PersonsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPersonsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:88:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:89:1: ( rulePerson EOF )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:90:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson122);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:97:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:101:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:102:1: ( ( rule__Person__Group__0 ) )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:102:1: ( ( rule__Person__Group__0 ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:103:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:104:1: ( rule__Person__Group__0 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:104:2: rule__Person__Group__0
            {
            pushFollow(FOLLOW_rule__Person__Group__0_in_rulePerson155);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleFollowRecord"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:116:1: entryRuleFollowRecord : ruleFollowRecord EOF ;
    public final void entryRuleFollowRecord() throws RecognitionException {
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:117:1: ( ruleFollowRecord EOF )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:118:1: ruleFollowRecord EOF
            {
             before(grammarAccess.getFollowRecordRule()); 
            pushFollow(FOLLOW_ruleFollowRecord_in_entryRuleFollowRecord182);
            ruleFollowRecord();

            state._fsp--;

             after(grammarAccess.getFollowRecordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowRecord189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFollowRecord"


    // $ANTLR start "ruleFollowRecord"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:125:1: ruleFollowRecord : ( ( rule__FollowRecord__Group__0 ) ) ;
    public final void ruleFollowRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:129:2: ( ( ( rule__FollowRecord__Group__0 ) ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:130:1: ( ( rule__FollowRecord__Group__0 ) )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:130:1: ( ( rule__FollowRecord__Group__0 ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:131:1: ( rule__FollowRecord__Group__0 )
            {
             before(grammarAccess.getFollowRecordAccess().getGroup()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:132:1: ( rule__FollowRecord__Group__0 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:132:2: rule__FollowRecord__Group__0
            {
            pushFollow(FOLLOW_rule__FollowRecord__Group__0_in_ruleFollowRecord215);
            rule__FollowRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowRecordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowRecord"


    // $ANTLR start "rule__Person__Group__0"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:146:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:150:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:151:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0249);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0252);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:158:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:162:1: ( ( 'Person' ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:163:1: ( 'Person' )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:163:1: ( 'Person' )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:164:1: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Person__Group__0__Impl280); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:177:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:181:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:182:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1311);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1314);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:189:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:193:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:194:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:194:1: ( ( rule__Person__NameAssignment_1 ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:195:1: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:196:1: ( rule__Person__NameAssignment_1 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:196:2: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl341);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:206:1: rule__Person__Group__2 : rule__Person__Group__2__Impl ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:210:1: ( rule__Person__Group__2__Impl )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:211:2: rule__Person__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2371);
            rule__Person__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:217:1: rule__Person__Group__2__Impl : ( ( rule__Person__FollowingAssignment_2 )* ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:221:1: ( ( ( rule__Person__FollowingAssignment_2 )* ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:222:1: ( ( rule__Person__FollowingAssignment_2 )* )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:222:1: ( ( rule__Person__FollowingAssignment_2 )* )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:223:1: ( rule__Person__FollowingAssignment_2 )*
            {
             before(grammarAccess.getPersonAccess().getFollowingAssignment_2()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:224:1: ( rule__Person__FollowingAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:224:2: rule__Person__FollowingAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Person__FollowingAssignment_2_in_rule__Person__Group__2__Impl398);
            	    rule__Person__FollowingAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getFollowingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__FollowRecord__Group__0"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:240:1: rule__FollowRecord__Group__0 : rule__FollowRecord__Group__0__Impl rule__FollowRecord__Group__1 ;
    public final void rule__FollowRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:244:1: ( rule__FollowRecord__Group__0__Impl rule__FollowRecord__Group__1 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:245:2: rule__FollowRecord__Group__0__Impl rule__FollowRecord__Group__1
            {
            pushFollow(FOLLOW_rule__FollowRecord__Group__0__Impl_in_rule__FollowRecord__Group__0435);
            rule__FollowRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowRecord__Group__1_in_rule__FollowRecord__Group__0438);
            rule__FollowRecord__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRecord__Group__0"


    // $ANTLR start "rule__FollowRecord__Group__0__Impl"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:252:1: rule__FollowRecord__Group__0__Impl : ( 'follow' ) ;
    public final void rule__FollowRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:256:1: ( ( 'follow' ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:257:1: ( 'follow' )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:257:1: ( 'follow' )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:258:1: 'follow'
            {
             before(grammarAccess.getFollowRecordAccess().getFollowKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__FollowRecord__Group__0__Impl466); 
             after(grammarAccess.getFollowRecordAccess().getFollowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRecord__Group__0__Impl"


    // $ANTLR start "rule__FollowRecord__Group__1"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:271:1: rule__FollowRecord__Group__1 : rule__FollowRecord__Group__1__Impl ;
    public final void rule__FollowRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:275:1: ( rule__FollowRecord__Group__1__Impl )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:276:2: rule__FollowRecord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FollowRecord__Group__1__Impl_in_rule__FollowRecord__Group__1497);
            rule__FollowRecord__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRecord__Group__1"


    // $ANTLR start "rule__FollowRecord__Group__1__Impl"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:282:1: rule__FollowRecord__Group__1__Impl : ( ( rule__FollowRecord__PersonAssignment_1 ) ) ;
    public final void rule__FollowRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:286:1: ( ( ( rule__FollowRecord__PersonAssignment_1 ) ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:287:1: ( ( rule__FollowRecord__PersonAssignment_1 ) )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:287:1: ( ( rule__FollowRecord__PersonAssignment_1 ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:288:1: ( rule__FollowRecord__PersonAssignment_1 )
            {
             before(grammarAccess.getFollowRecordAccess().getPersonAssignment_1()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:289:1: ( rule__FollowRecord__PersonAssignment_1 )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:289:2: rule__FollowRecord__PersonAssignment_1
            {
            pushFollow(FOLLOW_rule__FollowRecord__PersonAssignment_1_in_rule__FollowRecord__Group__1__Impl524);
            rule__FollowRecord__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowRecordAccess().getPersonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRecord__Group__1__Impl"


    // $ANTLR start "rule__Model__PersonsAssignment"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:304:1: rule__Model__PersonsAssignment : ( rulePerson ) ;
    public final void rule__Model__PersonsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:308:1: ( ( rulePerson ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:309:1: ( rulePerson )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:309:1: ( rulePerson )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:310:1: rulePerson
            {
             before(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePerson_in_rule__Model__PersonsAssignment563);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PersonsAssignment"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:319:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:323:1: ( ( RULE_ID ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:324:1: ( RULE_ID )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:324:1: ( RULE_ID )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:325:1: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Person__NameAssignment_1594); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__FollowingAssignment_2"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:334:1: rule__Person__FollowingAssignment_2 : ( ruleFollowRecord ) ;
    public final void rule__Person__FollowingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:338:1: ( ( ruleFollowRecord ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:339:1: ( ruleFollowRecord )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:339:1: ( ruleFollowRecord )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:340:1: ruleFollowRecord
            {
             before(grammarAccess.getPersonAccess().getFollowingFollowRecordParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFollowRecord_in_rule__Person__FollowingAssignment_2625);
            ruleFollowRecord();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getFollowingFollowRecordParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__FollowingAssignment_2"


    // $ANTLR start "rule__FollowRecord__PersonAssignment_1"
    // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:349:1: rule__FollowRecord__PersonAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FollowRecord__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:353:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:354:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:354:1: ( ( RULE_ID ) )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:355:1: ( RULE_ID )
            {
             before(grammarAccess.getFollowRecordAccess().getPersonPersonCrossReference_1_0()); 
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:356:1: ( RULE_ID )
            // ../org.xtext.sbg.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSubGrLang.g:357:1: RULE_ID
            {
             before(grammarAccess.getFollowRecordAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FollowRecord__PersonAssignment_1660); 
             after(grammarAccess.getFollowRecordAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFollowRecordAccess().getPersonPersonCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRecord__PersonAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PersonsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowRecord_in_entryRuleFollowRecord182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowRecord189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowRecord__Group__0_in_ruleFollowRecord215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Person__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__FollowingAssignment_2_in_rule__Person__Group__2__Impl398 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__FollowRecord__Group__0__Impl_in_rule__FollowRecord__Group__0435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FollowRecord__Group__1_in_rule__FollowRecord__Group__0438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FollowRecord__Group__0__Impl466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowRecord__Group__1__Impl_in_rule__FollowRecord__Group__1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowRecord__PersonAssignment_1_in_rule__FollowRecord__Group__1__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_rule__Model__PersonsAssignment563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Person__NameAssignment_1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowRecord_in_rule__Person__FollowingAssignment_2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FollowRecord__PersonAssignment_1660 = new BitSet(new long[]{0x0000000000000002L});

}