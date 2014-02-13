package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SubGrLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSubGrLangParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g"; }



     	private SubGrLangGrammarAccess grammarAccess;
     	
        public InternalSubGrLangParser(TokenStream input, SubGrLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SubGrLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:76:1: ruleModel returns [EObject current=null] : ( (lv_persons_0_0= rulePerson ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_persons_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:79:28: ( ( (lv_persons_0_0= rulePerson ) )* )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:80:1: ( (lv_persons_0_0= rulePerson ) )*
            {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:80:1: ( (lv_persons_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:81:1: (lv_persons_0_0= rulePerson )
            	    {
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:81:1: (lv_persons_0_0= rulePerson )
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:82:3: lv_persons_0_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePerson_in_ruleModel130);
            	    lv_persons_0_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persons",
            	            		lv_persons_0_0, 
            	            		"Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:106:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:107:2: (iv_rulePerson= rulePerson EOF )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:108:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson166);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:115:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ( (lv_following_2_0= ruleFollowRecord ) )* ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_following_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:118:28: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ( (lv_following_2_0= ruleFollowRecord ) )* ) )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:119:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ( (lv_following_2_0= ruleFollowRecord ) )* )
            {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:119:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ( (lv_following_2_0= ruleFollowRecord ) )* )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:119:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ( (lv_following_2_0= ruleFollowRecord ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePerson213); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
                
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:141:2: ( (lv_following_2_0= ruleFollowRecord ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:142:1: (lv_following_2_0= ruleFollowRecord )
            	    {
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:142:1: (lv_following_2_0= ruleFollowRecord )
            	    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:143:3: lv_following_2_0= ruleFollowRecord
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersonAccess().getFollowingFollowRecordParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFollowRecord_in_rulePerson256);
            	    lv_following_2_0=ruleFollowRecord();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"following",
            	            		lv_following_2_0, 
            	            		"FollowRecord");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleFollowRecord"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:167:1: entryRuleFollowRecord returns [EObject current=null] : iv_ruleFollowRecord= ruleFollowRecord EOF ;
    public final EObject entryRuleFollowRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowRecord = null;


        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:168:2: (iv_ruleFollowRecord= ruleFollowRecord EOF )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:169:2: iv_ruleFollowRecord= ruleFollowRecord EOF
            {
             newCompositeNode(grammarAccess.getFollowRecordRule()); 
            pushFollow(FOLLOW_ruleFollowRecord_in_entryRuleFollowRecord293);
            iv_ruleFollowRecord=ruleFollowRecord();

            state._fsp--;

             current =iv_ruleFollowRecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowRecord303); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFollowRecord"


    // $ANTLR start "ruleFollowRecord"
    // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:176:1: ruleFollowRecord returns [EObject current=null] : (otherlv_0= 'follow' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFollowRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:179:28: ( (otherlv_0= 'follow' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:180:1: (otherlv_0= 'follow' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:180:1: (otherlv_0= 'follow' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:180:3: otherlv_0= 'follow' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleFollowRecord340); 

                	newLeafNode(otherlv_0, grammarAccess.getFollowRecordAccess().getFollowKeyword_0());
                
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:184:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:185:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:185:1: (otherlv_1= RULE_ID )
            // ../org.xtext.sbg/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.g:186:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFollowRecordRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFollowRecord360); 

            		newLeafNode(otherlv_1, grammarAccess.getFollowRecordAccess().getPersonPersonCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFollowRecord"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePerson213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson230 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleFollowRecord_in_rulePerson256 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleFollowRecord_in_entryRuleFollowRecord293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowRecord303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFollowRecord340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFollowRecord360 = new BitSet(new long[]{0x0000000000000002L});

}