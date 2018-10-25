package de.darmstadt.tu.crossing.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCryptSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SPEC'", "'[]'", "'<'", "'>'", "'OBJECTS'", "'FORBIDDEN'", "'EVENTS'", "'ORDER'", "'CONSTRAINTS'", "'REQUIRES'", "'ENSURES'", "'NEGATES'", "';'", "'=>'", "'('", "','", "')'", "'.'", "':'", "'='", "');'", "'_'", "':='", "'|'", "'+'", "'?'", "'*'", "'||'", "'&&'", "'<='", "'>='", "'-'", "'/'", "'neverTypeOf'", "'noCallTo'", "'callTo'", "'length'", "'^'", "'!'", "'=='", "'!='", "'in'", "'{'", "'}'", "'elements('", "'part('", "'...'", "'['", "']'", "'after'", "'this'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCryptSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCryptSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCryptSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCryptSL.g"; }



     	private CryptSLGrammarAccess grammarAccess;

        public InternalCryptSLParser(TokenStream input, CryptSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected CryptSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalCryptSL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalCryptSL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalCryptSL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalCryptSL.g:71:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_usage_7_0 = null;

        EObject lv_forbEvent_9_0 = null;

        EObject lv_req_events_11_0 = null;

        EObject lv_order_13_0 = null;

        EObject lv_reqConstraints_15_0 = null;

        EObject lv_require_17_0 = null;

        EObject lv_ensure_19_0 = null;

        EObject lv_destroy_21_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:77:2: ( (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? ) )
            // InternalCryptSL.g:78:2: (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? )
            {
            // InternalCryptSL.g:78:2: (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? )
            // InternalCryptSL.g:79:3: otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getSPECKeyword_0());
              		
            }
            // InternalCryptSL.g:83:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:84:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:84:4: ( ruleQualifiedName )
            // InternalCryptSL.g:85:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDomainmodelRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getJavaTypeJvmTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:99:3: ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            switch (alt1) {
                case 1 :
                    // InternalCryptSL.g:100:4: ( (lv_array_2_0= '[]' ) )
                    {
                    // InternalCryptSL.g:100:4: ( (lv_array_2_0= '[]' ) )
                    // InternalCryptSL.g:101:5: (lv_array_2_0= '[]' )
                    {
                    // InternalCryptSL.g:101:5: (lv_array_2_0= '[]' )
                    // InternalCryptSL.g:102:6: lv_array_2_0= '[]'
                    {
                    lv_array_2_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_array_2_0, grammarAccess.getDomainmodelAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDomainmodelRule());
                      						}
                      						setWithLastConsumed(current, "array", lv_array_2_0, "[]");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:115:4: (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' )
                    {
                    // InternalCryptSL.g:115:4: (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' )
                    // InternalCryptSL.g:116:5: otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDomainmodelAccess().getLessThanSignKeyword_2_1_0());
                      				
                    }
                    // InternalCryptSL.g:120:5: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:121:6: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:121:6: ( ruleQualifiedName )
                    // InternalCryptSL.g:122:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDomainmodelRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDomainmodelAccess().getCollectionJvmGenericTypeCrossReference_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDomainmodelAccess().getGreaterThanSignKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDomainmodelAccess().getOBJECTSKeyword_3());
              		
            }
            // InternalCryptSL.g:146:3: ( (lv_usage_7_0= ruleUseBlock ) )
            // InternalCryptSL.g:147:4: (lv_usage_7_0= ruleUseBlock )
            {
            // InternalCryptSL.g:147:4: (lv_usage_7_0= ruleUseBlock )
            // InternalCryptSL.g:148:5: lv_usage_7_0= ruleUseBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getUsageUseBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_usage_7_0=ruleUseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
              					}
              					set(
              						current,
              						"usage",
              						lv_usage_7_0,
              						"de.darmstadt.tu.crossing.CryptSL.UseBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:165:3: (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCryptSL.g:166:4: otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDomainmodelAccess().getFORBIDDENKeyword_5_0());
                      			
                    }
                    // InternalCryptSL.g:170:4: ( (lv_forbEvent_9_0= ruleForbiddenBlock ) )
                    // InternalCryptSL.g:171:5: (lv_forbEvent_9_0= ruleForbiddenBlock )
                    {
                    // InternalCryptSL.g:171:5: (lv_forbEvent_9_0= ruleForbiddenBlock )
                    // InternalCryptSL.g:172:6: lv_forbEvent_9_0= ruleForbiddenBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getForbEventForbiddenBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_forbEvent_9_0=ruleForbiddenBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                      						}
                      						set(
                      							current,
                      							"forbEvent",
                      							lv_forbEvent_9_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ForbiddenBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDomainmodelAccess().getEVENTSKeyword_6());
              		
            }
            // InternalCryptSL.g:194:3: ( (lv_req_events_11_0= ruleRequiredBlock ) )
            // InternalCryptSL.g:195:4: (lv_req_events_11_0= ruleRequiredBlock )
            {
            // InternalCryptSL.g:195:4: (lv_req_events_11_0= ruleRequiredBlock )
            // InternalCryptSL.g:196:5: lv_req_events_11_0= ruleRequiredBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getReq_eventsRequiredBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_req_events_11_0=ruleRequiredBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
              					}
              					set(
              						current,
              						"req_events",
              						lv_req_events_11_0,
              						"de.darmstadt.tu.crossing.CryptSL.RequiredBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getDomainmodelAccess().getORDERKeyword_8());
              		
            }
            // InternalCryptSL.g:217:3: ( (lv_order_13_0= ruleOrder ) )
            // InternalCryptSL.g:218:4: (lv_order_13_0= ruleOrder )
            {
            // InternalCryptSL.g:218:4: (lv_order_13_0= ruleOrder )
            // InternalCryptSL.g:219:5: lv_order_13_0= ruleOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getOrderOrderParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_order_13_0=ruleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
              					}
              					set(
              						current,
              						"order",
              						lv_order_13_0,
              						"de.darmstadt.tu.crossing.CryptSL.Order");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:236:3: (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCryptSL.g:237:4: otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDomainmodelAccess().getCONSTRAINTSKeyword_10_0());
                      			
                    }
                    // InternalCryptSL.g:241:4: ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) )
                    // InternalCryptSL.g:242:5: (lv_reqConstraints_15_0= ruleEnforceConsBlock )
                    {
                    // InternalCryptSL.g:242:5: (lv_reqConstraints_15_0= ruleEnforceConsBlock )
                    // InternalCryptSL.g:243:6: lv_reqConstraints_15_0= ruleEnforceConsBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getReqConstraintsEnforceConsBlockParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_reqConstraints_15_0=ruleEnforceConsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                      						}
                      						set(
                      							current,
                      							"reqConstraints",
                      							lv_reqConstraints_15_0,
                      							"de.darmstadt.tu.crossing.CryptSL.EnforceConsBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:261:3: (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCryptSL.g:262:4: otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) )
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDomainmodelAccess().getREQUIRESKeyword_11_0());
                      			
                    }
                    // InternalCryptSL.g:266:4: ( (lv_require_17_0= ruleRequiresBlock ) )
                    // InternalCryptSL.g:267:5: (lv_require_17_0= ruleRequiresBlock )
                    {
                    // InternalCryptSL.g:267:5: (lv_require_17_0= ruleRequiresBlock )
                    // InternalCryptSL.g:268:6: lv_require_17_0= ruleRequiresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getRequireRequiresBlockParserRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_require_17_0=ruleRequiresBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                      						}
                      						set(
                      							current,
                      							"require",
                      							lv_require_17_0,
                      							"de.darmstadt.tu.crossing.CryptSL.RequiresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:286:3: (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCryptSL.g:287:4: otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) )
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getDomainmodelAccess().getENSURESKeyword_12_0());
                      			
                    }
                    // InternalCryptSL.g:291:4: ( (lv_ensure_19_0= ruleEnsuresBlock ) )
                    // InternalCryptSL.g:292:5: (lv_ensure_19_0= ruleEnsuresBlock )
                    {
                    // InternalCryptSL.g:292:5: (lv_ensure_19_0= ruleEnsuresBlock )
                    // InternalCryptSL.g:293:6: lv_ensure_19_0= ruleEnsuresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getEnsureEnsuresBlockParserRuleCall_12_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_ensure_19_0=ruleEnsuresBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                      						}
                      						set(
                      							current,
                      							"ensure",
                      							lv_ensure_19_0,
                      							"de.darmstadt.tu.crossing.CryptSL.EnsuresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:311:3: (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCryptSL.g:312:4: otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) )
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getDomainmodelAccess().getNEGATESKeyword_13_0());
                      			
                    }
                    // InternalCryptSL.g:316:4: ( (lv_destroy_21_0= ruleDestroysBlock ) )
                    // InternalCryptSL.g:317:5: (lv_destroy_21_0= ruleDestroysBlock )
                    {
                    // InternalCryptSL.g:317:5: (lv_destroy_21_0= ruleDestroysBlock )
                    // InternalCryptSL.g:318:6: lv_destroy_21_0= ruleDestroysBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getDestroyDestroysBlockParserRuleCall_13_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_destroy_21_0=ruleDestroysBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                      						}
                      						set(
                      							current,
                      							"destroy",
                      							lv_destroy_21_0,
                      							"de.darmstadt.tu.crossing.CryptSL.DestroysBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleUseBlock"
    // InternalCryptSL.g:340:1: entryRuleUseBlock returns [EObject current=null] : iv_ruleUseBlock= ruleUseBlock EOF ;
    public final EObject entryRuleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseBlock = null;


        try {
            // InternalCryptSL.g:340:49: (iv_ruleUseBlock= ruleUseBlock EOF )
            // InternalCryptSL.g:341:2: iv_ruleUseBlock= ruleUseBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUseBlock=ruleUseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUseBlock"


    // $ANTLR start "ruleUseBlock"
    // InternalCryptSL.g:347:1: ruleUseBlock returns [EObject current=null] : ( (lv_objects_0_0= ruleObjectDecl ) )+ ;
    public final EObject ruleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:353:2: ( ( (lv_objects_0_0= ruleObjectDecl ) )+ )
            // InternalCryptSL.g:354:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            {
            // InternalCryptSL.g:354:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCryptSL.g:355:3: (lv_objects_0_0= ruleObjectDecl )
            	    {
            	    // InternalCryptSL.g:355:3: (lv_objects_0_0= ruleObjectDecl )
            	    // InternalCryptSL.g:356:4: lv_objects_0_0= ruleObjectDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getUseBlockAccess().getObjectsObjectDeclParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_objects_0_0=ruleObjectDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getUseBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"objects",
            	      					lv_objects_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.ObjectDecl");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUseBlock"


    // $ANTLR start "entryRuleForbiddenBlock"
    // InternalCryptSL.g:376:1: entryRuleForbiddenBlock returns [EObject current=null] : iv_ruleForbiddenBlock= ruleForbiddenBlock EOF ;
    public final EObject entryRuleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenBlock = null;


        try {
            // InternalCryptSL.g:376:55: (iv_ruleForbiddenBlock= ruleForbiddenBlock EOF )
            // InternalCryptSL.g:377:2: iv_ruleForbiddenBlock= ruleForbiddenBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForbiddenBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForbiddenBlock=ruleForbiddenBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForbiddenBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForbiddenBlock"


    // $ANTLR start "ruleForbiddenBlock"
    // InternalCryptSL.g:383:1: ruleForbiddenBlock returns [EObject current=null] : ( (lv_forb_methods_0_0= ruleForbMethod ) )+ ;
    public final EObject ruleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_forb_methods_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:389:2: ( ( (lv_forb_methods_0_0= ruleForbMethod ) )+ )
            // InternalCryptSL.g:390:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
            {
            // InternalCryptSL.g:390:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCryptSL.g:391:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    {
            	    // InternalCryptSL.g:391:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    // InternalCryptSL.g:392:4: lv_forb_methods_0_0= ruleForbMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getForbiddenBlockAccess().getForb_methodsForbMethodParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_forb_methods_0_0=ruleForbMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getForbiddenBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"forb_methods",
            	      					lv_forb_methods_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.ForbMethod");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForbiddenBlock"


    // $ANTLR start "entryRuleRequiredBlock"
    // InternalCryptSL.g:412:1: entryRuleRequiredBlock returns [EObject current=null] : iv_ruleRequiredBlock= ruleRequiredBlock EOF ;
    public final EObject entryRuleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBlock = null;


        try {
            // InternalCryptSL.g:412:54: (iv_ruleRequiredBlock= ruleRequiredBlock EOF )
            // InternalCryptSL.g:413:2: iv_ruleRequiredBlock= ruleRequiredBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiredBlock=ruleRequiredBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiredBlock"


    // $ANTLR start "ruleRequiredBlock"
    // InternalCryptSL.g:419:1: ruleRequiredBlock returns [EObject current=null] : ( (lv_req_event_0_0= ruleEvent ) )+ ;
    public final EObject ruleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_req_event_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:425:2: ( ( (lv_req_event_0_0= ruleEvent ) )+ )
            // InternalCryptSL.g:426:2: ( (lv_req_event_0_0= ruleEvent ) )+
            {
            // InternalCryptSL.g:426:2: ( (lv_req_event_0_0= ruleEvent ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCryptSL.g:427:3: (lv_req_event_0_0= ruleEvent )
            	    {
            	    // InternalCryptSL.g:427:3: (lv_req_event_0_0= ruleEvent )
            	    // InternalCryptSL.g:428:4: lv_req_event_0_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRequiredBlockAccess().getReq_eventEventParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_req_event_0_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getRequiredBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"req_event",
            	      					lv_req_event_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.Event");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiredBlock"


    // $ANTLR start "entryRuleEnforceConsBlock"
    // InternalCryptSL.g:448:1: entryRuleEnforceConsBlock returns [EObject current=null] : iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF ;
    public final EObject entryRuleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforceConsBlock = null;


        try {
            // InternalCryptSL.g:448:57: (iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF )
            // InternalCryptSL.g:449:2: iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnforceConsBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnforceConsBlock=ruleEnforceConsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnforceConsBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnforceConsBlock"


    // $ANTLR start "ruleEnforceConsBlock"
    // InternalCryptSL.g:455:1: ruleEnforceConsBlock returns [EObject current=null] : ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_req_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:461:2: ( ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:462:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:462:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==25||(LA10_0>=44 && LA10_0<=47)||LA10_0==49||(LA10_0>=55 && LA10_0<=56)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCryptSL.g:463:3: ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:463:3: ( (lv_req_0_0= ruleConstraint ) )
            	    // InternalCryptSL.g:464:4: (lv_req_0_0= ruleConstraint )
            	    {
            	    // InternalCryptSL.g:464:4: (lv_req_0_0= ruleConstraint )
            	    // InternalCryptSL.g:465:5: lv_req_0_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnforceConsBlockAccess().getReqConstraintParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_req_0_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnforceConsBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"req",
            	      						lv_req_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getEnforceConsBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnforceConsBlock"


    // $ANTLR start "entryRuleRequiresBlock"
    // InternalCryptSL.g:490:1: entryRuleRequiresBlock returns [EObject current=null] : iv_ruleRequiresBlock= ruleRequiresBlock EOF ;
    public final EObject entryRuleRequiresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiresBlock = null;


        try {
            // InternalCryptSL.g:490:54: (iv_ruleRequiresBlock= ruleRequiresBlock EOF )
            // InternalCryptSL.g:491:2: iv_ruleRequiresBlock= ruleRequiresBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiresBlock=ruleRequiresBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiresBlock"


    // $ANTLR start "ruleRequiresBlock"
    // InternalCryptSL.g:497:1: ruleRequiresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleRequiresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:503:2: ( ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:504:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:504:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==25||(LA11_0>=44 && LA11_0<=47)||LA11_0==49||(LA11_0>=55 && LA11_0<=56)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCryptSL.g:505:3: ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:505:3: ( (lv_pred_0_0= ruleReqPred ) )
            	    // InternalCryptSL.g:506:4: (lv_pred_0_0= ruleReqPred )
            	    {
            	    // InternalCryptSL.g:506:4: (lv_pred_0_0= ruleReqPred )
            	    // InternalCryptSL.g:507:5: lv_pred_0_0= ruleReqPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRequiresBlockAccess().getPredReqPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_pred_0_0=ruleReqPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRequiresBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.ReqPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getRequiresBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiresBlock"


    // $ANTLR start "entryRuleEnsuresBlock"
    // InternalCryptSL.g:532:1: entryRuleEnsuresBlock returns [EObject current=null] : iv_ruleEnsuresBlock= ruleEnsuresBlock EOF ;
    public final EObject entryRuleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsuresBlock = null;


        try {
            // InternalCryptSL.g:532:53: (iv_ruleEnsuresBlock= ruleEnsuresBlock EOF )
            // InternalCryptSL.g:533:2: iv_ruleEnsuresBlock= ruleEnsuresBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsuresBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnsuresBlock=ruleEnsuresBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsuresBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnsuresBlock"


    // $ANTLR start "ruleEnsuresBlock"
    // InternalCryptSL.g:539:1: ruleEnsuresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:545:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:546:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:546:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCryptSL.g:547:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:547:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCryptSL.g:548:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCryptSL.g:548:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCryptSL.g:549:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnsuresBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_pred_0_0=ruleEnsPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnsuresBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getEnsuresBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnsuresBlock"


    // $ANTLR start "entryRuleDestroysBlock"
    // InternalCryptSL.g:574:1: entryRuleDestroysBlock returns [EObject current=null] : iv_ruleDestroysBlock= ruleDestroysBlock EOF ;
    public final EObject entryRuleDestroysBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroysBlock = null;


        try {
            // InternalCryptSL.g:574:54: (iv_ruleDestroysBlock= ruleDestroysBlock EOF )
            // InternalCryptSL.g:575:2: iv_ruleDestroysBlock= ruleDestroysBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestroysBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDestroysBlock=ruleDestroysBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestroysBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDestroysBlock"


    // $ANTLR start "ruleDestroysBlock"
    // InternalCryptSL.g:581:1: ruleDestroysBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleDestroysBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:587:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:588:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:588:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCryptSL.g:589:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:589:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCryptSL.g:590:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCryptSL.g:590:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCryptSL.g:591:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDestroysBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_pred_0_0=ruleEnsPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDestroysBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getDestroysBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDestroysBlock"


    // $ANTLR start "entryRuleObjectDecl"
    // InternalCryptSL.g:616:1: entryRuleObjectDecl returns [EObject current=null] : iv_ruleObjectDecl= ruleObjectDecl EOF ;
    public final EObject entryRuleObjectDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDecl = null;


        try {
            // InternalCryptSL.g:616:51: (iv_ruleObjectDecl= ruleObjectDecl EOF )
            // InternalCryptSL.g:617:2: iv_ruleObjectDecl= ruleObjectDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectDecl=ruleObjectDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectDecl"


    // $ANTLR start "ruleObjectDecl"
    // InternalCryptSL.g:623:1: ruleObjectDecl returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) ;
    public final EObject ruleObjectDecl() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_objectName_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:629:2: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) )
            // InternalCryptSL.g:630:2: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
            {
            // InternalCryptSL.g:630:2: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
            // InternalCryptSL.g:631:3: ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';'
            {
            // InternalCryptSL.g:631:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:632:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:632:4: ( ruleQualifiedName )
            // InternalCryptSL.g:633:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectDeclRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:647:3: ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==13) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalCryptSL.g:648:4: ( (lv_array_1_0= '[]' ) )
                    {
                    // InternalCryptSL.g:648:4: ( (lv_array_1_0= '[]' ) )
                    // InternalCryptSL.g:649:5: (lv_array_1_0= '[]' )
                    {
                    // InternalCryptSL.g:649:5: (lv_array_1_0= '[]' )
                    // InternalCryptSL.g:650:6: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_array_1_0, grammarAccess.getObjectDeclAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getObjectDeclRule());
                      						}
                      						setWithLastConsumed(current, "array", lv_array_1_0, "[]");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:663:4: (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
                    {
                    // InternalCryptSL.g:663:4: (otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
                    // InternalCryptSL.g:664:5: otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getObjectDeclAccess().getLessThanSignKeyword_1_1_0());
                      				
                    }
                    // InternalCryptSL.g:668:5: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:669:6: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:669:6: ( ruleQualifiedName )
                    // InternalCryptSL.g:670:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getObjectDeclRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getObjectDeclAccess().getCollectionJvmGenericTypeCrossReference_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getObjectDeclAccess().getGreaterThanSignKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCryptSL.g:690:3: ( (lv_objectName_5_0= ruleObject ) )
            // InternalCryptSL.g:691:4: (lv_objectName_5_0= ruleObject )
            {
            // InternalCryptSL.g:691:4: (lv_objectName_5_0= ruleObject )
            // InternalCryptSL.g:692:5: lv_objectName_5_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectNameObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_objectName_5_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectDeclRule());
              					}
              					set(
              						current,
              						"objectName",
              						lv_objectName_5_0,
              						"de.darmstadt.tu.crossing.CryptSL.Object");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getObjectDeclAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObjectDecl"


    // $ANTLR start "entryRuleForbMethod"
    // InternalCryptSL.g:717:1: entryRuleForbMethod returns [EObject current=null] : iv_ruleForbMethod= ruleForbMethod EOF ;
    public final EObject entryRuleForbMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbMethod = null;


        try {
            // InternalCryptSL.g:717:51: (iv_ruleForbMethod= ruleForbMethod EOF )
            // InternalCryptSL.g:718:2: iv_ruleForbMethod= ruleForbMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForbMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForbMethod=ruleForbMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForbMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForbMethod"


    // $ANTLR start "ruleForbMethod"
    // InternalCryptSL.g:724:1: ruleForbMethod returns [EObject current=null] : ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) ;
    public final EObject ruleForbMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCryptSL.g:730:2: ( ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) )
            // InternalCryptSL.g:731:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            {
            // InternalCryptSL.g:731:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            // InternalCryptSL.g:732:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';'
            {
            // InternalCryptSL.g:732:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCryptSL.g:733:4: ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalCryptSL.g:733:4: ( ( ruleFQN ) )
            // InternalCryptSL.g:734:5: ( ruleFQN )
            {
            // InternalCryptSL.g:734:5: ( ruleFQN )
            // InternalCryptSL.g:735:6: ruleFQN
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getForbMethodRule());
              						}
              					
            }
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getForbMethodAccess().getJavaMethJvmExecutableCrossReference_0_0_0());
              					
            }
            pushFollow(FOLLOW_20);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCryptSL.g:749:4: (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCryptSL.g:750:5: otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getForbMethodAccess().getEqualsSignGreaterThanSignKeyword_0_1_0());
                      				
                    }
                    // InternalCryptSL.g:754:5: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:755:6: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:755:6: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:756:7: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getForbMethodRule());
                      							}
                      						
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getForbMethodAccess().getRepEventCrossReference_0_1_1_0());
                      						
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForbMethodAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForbMethod"


    // $ANTLR start "entryRuleFQN"
    // InternalCryptSL.g:777:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCryptSL.g:777:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCryptSL.g:778:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCryptSL.g:784:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QN_0 = null;

        AntlrDatatypeRuleToken this_QN_2 = null;

        AntlrDatatypeRuleToken this_QN_4 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:790:2: ( (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) )
            // InternalCryptSL.g:791:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            {
            // InternalCryptSL.g:791:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            // InternalCryptSL.g:792:3: this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_QN_0=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QN_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCryptSL.g:807:3: (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCryptSL.g:808:4: this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_QN_2=ruleQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_QN_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:818:4: (kw= ',' this_QN_4= ruleQN )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==26) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCryptSL.g:819:5: kw= ',' this_QN_4= ruleQN
                    	    {
                    	    kw=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getFQNAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    this_QN_4=ruleQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_QN_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFQNAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleQN"
    // InternalCryptSL.g:845:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalCryptSL.g:845:42: (iv_ruleQN= ruleQN EOF )
            // InternalCryptSL.g:846:2: iv_ruleQN= ruleQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalCryptSL.g:852:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:858:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) )
            // InternalCryptSL.g:859:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            {
            // InternalCryptSL.g:859:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            // InternalCryptSL.g:860:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCryptSL.g:867:3: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCryptSL.g:868:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalCryptSL.g:881:3: (kw= '[]' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCryptSL.g:882:4: kw= '[]'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQNAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleEvent"
    // InternalCryptSL.g:892:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalCryptSL.g:892:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalCryptSL.g:893:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalCryptSL.g:899:1: ruleEvent returns [EObject current=null] : (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_LabelMethodCall_0 = null;

        EObject this_Aggregate_1 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:905:2: ( (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate ) )
            // InternalCryptSL.g:906:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate )
            {
            // InternalCryptSL.g:906:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==29) ) {
                    alt20=1;
                }
                else if ( (LA20_1==33) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCryptSL.g:907:3: this_LabelMethodCall_0= ruleLabelMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEventAccess().getLabelMethodCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LabelMethodCall_0=ruleLabelMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LabelMethodCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:916:3: this_Aggregate_1= ruleAggregate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEventAccess().getAggregateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Aggregate_1=ruleAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Aggregate_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleLabelMethodCall"
    // InternalCryptSL.g:928:1: entryRuleLabelMethodCall returns [EObject current=null] : iv_ruleLabelMethodCall= ruleLabelMethodCall EOF ;
    public final EObject entryRuleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMethodCall = null;


        try {
            // InternalCryptSL.g:928:56: (iv_ruleLabelMethodCall= ruleLabelMethodCall EOF )
            // InternalCryptSL.g:929:2: iv_ruleLabelMethodCall= ruleLabelMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabelMethodCall=ruleLabelMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabelMethodCall"


    // $ANTLR start "ruleLabelMethodCall"
    // InternalCryptSL.g:935:1: ruleLabelMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) ;
    public final EObject ruleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_meth_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:941:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) )
            // InternalCryptSL.g:942:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            {
            // InternalCryptSL.g:942:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            // InternalCryptSL.g:943:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) )
            {
            // InternalCryptSL.g:943:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCryptSL.g:944:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCryptSL.g:944:4: (lv_name_0_0= RULE_ID )
            // InternalCryptSL.g:945:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getLabelMethodCallAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLabelMethodCallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLabelMethodCallAccess().getColonKeyword_1());
              		
            }
            // InternalCryptSL.g:965:3: ( (lv_meth_2_0= ruleMethod ) )
            // InternalCryptSL.g:966:4: (lv_meth_2_0= ruleMethod )
            {
            // InternalCryptSL.g:966:4: (lv_meth_2_0= ruleMethod )
            // InternalCryptSL.g:967:5: lv_meth_2_0= ruleMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabelMethodCallAccess().getMethMethodParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_meth_2_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabelMethodCallRule());
              					}
              					set(
              						current,
              						"meth",
              						lv_meth_2_0,
              						"de.darmstadt.tu.crossing.CryptSL.Method");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLabelMethodCall"


    // $ANTLR start "entryRuleMethod"
    // InternalCryptSL.g:988:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCryptSL.g:988:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCryptSL.g:989:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalCryptSL.g:995:1: ruleMethod returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parList_4_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1001:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) )
            // InternalCryptSL.g:1002:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            {
            // InternalCryptSL.g:1002:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            // InternalCryptSL.g:1003:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');'
            {
            // InternalCryptSL.g:1003:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==30) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalCryptSL.g:1004:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // InternalCryptSL.g:1004:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCryptSL.g:1005:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCryptSL.g:1005:5: (otherlv_0= RULE_ID )
                    // InternalCryptSL.g:1006:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getLeftSideObjectCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCryptSL.g:1022:3: ( (otherlv_2= RULE_ID ) )
            // InternalCryptSL.g:1023:4: (otherlv_2= RULE_ID )
            {
            // InternalCryptSL.g:1023:4: (otherlv_2= RULE_ID )
            // InternalCryptSL.g:1024:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getMethNameJvmExecutableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalCryptSL.g:1039:3: ( (lv_parList_4_0= ruleParList ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCryptSL.g:1040:4: (lv_parList_4_0= ruleParList )
                    {
                    // InternalCryptSL.g:1040:4: (lv_parList_4_0= ruleParList )
                    // InternalCryptSL.g:1041:5: lv_parList_4_0= ruleParList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getParListParListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_parList_4_0=ruleParList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"parList",
                      						lv_parList_4_0,
                      						"de.darmstadt.tu.crossing.CryptSL.ParList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParList"
    // InternalCryptSL.g:1066:1: entryRuleParList returns [EObject current=null] : iv_ruleParList= ruleParList EOF ;
    public final EObject entryRuleParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParList = null;


        try {
            // InternalCryptSL.g:1066:48: (iv_ruleParList= ruleParList EOF )
            // InternalCryptSL.g:1067:2: iv_ruleParList= ruleParList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParList=ruleParList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParList"


    // $ANTLR start "ruleParList"
    // InternalCryptSL.g:1073:1: ruleParList returns [EObject current=null] : ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) ;
    public final EObject ruleParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1079:2: ( ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) )
            // InternalCryptSL.g:1080:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            {
            // InternalCryptSL.g:1080:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            // InternalCryptSL.g:1081:3: ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            {
            // InternalCryptSL.g:1081:3: ( (lv_parameters_0_0= rulePar ) )
            // InternalCryptSL.g:1082:4: (lv_parameters_0_0= rulePar )
            {
            // InternalCryptSL.g:1082:4: (lv_parameters_0_0= rulePar )
            // InternalCryptSL.g:1083:5: lv_parameters_0_0= rulePar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_parameters_0_0=rulePar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.Par");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:1100:3: (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCryptSL.g:1101:4: otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:1105:4: ( (lv_parameters_2_0= rulePar ) )
            	    // InternalCryptSL.g:1106:5: (lv_parameters_2_0= rulePar )
            	    {
            	    // InternalCryptSL.g:1106:5: (lv_parameters_2_0= rulePar )
            	    // InternalCryptSL.g:1107:6: lv_parameters_2_0= rulePar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_parameters_2_0=rulePar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.Par");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParList"


    // $ANTLR start "entryRulePar"
    // InternalCryptSL.g:1129:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalCryptSL.g:1129:44: (iv_rulePar= rulePar EOF )
            // InternalCryptSL.g:1130:2: iv_rulePar= rulePar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePar=rulePar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePar"


    // $ANTLR start "rulePar"
    // InternalCryptSL.g:1136:1: rulePar returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1142:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) )
            // InternalCryptSL.g:1143:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            {
            // InternalCryptSL.g:1143:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            // InternalCryptSL.g:1144:3: () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            {
            // InternalCryptSL.g:1144:3: ()
            // InternalCryptSL.g:1145:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParAccess().getParAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:1151:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCryptSL.g:1152:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCryptSL.g:1152:4: ( (otherlv_1= RULE_ID ) )
                    // InternalCryptSL.g:1153:5: (otherlv_1= RULE_ID )
                    {
                    // InternalCryptSL.g:1153:5: (otherlv_1= RULE_ID )
                    // InternalCryptSL.g:1154:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getParAccess().getValObjectCrossReference_1_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1166:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParAccess().get_Keyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePar"


    // $ANTLR start "entryRuleAggregate"
    // InternalCryptSL.g:1175:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalCryptSL.g:1175:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalCryptSL.g:1176:2: iv_ruleAggregate= ruleAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalCryptSL.g:1182:1: ruleAggregate returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1188:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) )
            // InternalCryptSL.g:1189:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            {
            // InternalCryptSL.g:1189:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            // InternalCryptSL.g:1190:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            {
            // InternalCryptSL.g:1190:3: ()
            // InternalCryptSL.g:1191:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAggregateAccess().getAggregateAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:1197:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            // InternalCryptSL.g:1198:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';'
            {
            // InternalCryptSL.g:1198:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalCryptSL.g:1199:5: (lv_name_1_0= RULE_ID )
            {
            // InternalCryptSL.g:1199:5: (lv_name_1_0= RULE_ID )
            // InternalCryptSL.g:1200:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_name_1_0, grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_1_0_0());
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getAggregateRule());
              						}
              						setWithLastConsumed(
              							current,
              							"name",
              							lv_name_1_0,
              							"org.eclipse.xtext.xbase.Xtype.ID");
              					
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getColonEqualsSignKeyword_1_1());
              			
            }
            // InternalCryptSL.g:1220:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalCryptSL.g:1221:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalCryptSL.g:1221:5: ( (otherlv_3= RULE_ID ) )
            // InternalCryptSL.g:1222:6: (otherlv_3= RULE_ID )
            {
            // InternalCryptSL.g:1222:6: (otherlv_3= RULE_ID )
            // InternalCryptSL.g:1223:7: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getAggregateRule());
              							}
              						
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_0_0());
              						
            }

            }


            }

            // InternalCryptSL.g:1234:5: (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCryptSL.g:1235:6: otherlv_4= '|' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getVerticalLineKeyword_1_2_1_0());
            	      					
            	    }
            	    // InternalCryptSL.g:1239:6: ( (otherlv_5= RULE_ID ) )
            	    // InternalCryptSL.g:1240:7: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCryptSL.g:1240:7: (otherlv_5= RULE_ID )
            	    // InternalCryptSL.g:1241:8: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getAggregateRule());
            	      								}
            	      							
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_1_1_0());
            	      							
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getAggregateAccess().getSemicolonKeyword_1_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleOrder"
    // InternalCryptSL.g:1263:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalCryptSL.g:1263:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalCryptSL.g:1264:2: iv_ruleOrder= ruleOrder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrder; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalCryptSL.g:1270:1: ruleOrder returns [EObject current=null] : (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        EObject this_SimpleOrder_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1276:2: ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) )
            // InternalCryptSL.g:1277:2: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
            {
            // InternalCryptSL.g:1277:2: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
            // InternalCryptSL.g:1278:3: this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrderAccess().getSimpleOrderParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_SimpleOrder_0=ruleSimpleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleOrder_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1286:3: ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCryptSL.g:1287:4: () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) )
            	    {
            	    // InternalCryptSL.g:1287:4: ()
            	    // InternalCryptSL.g:1288:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrderAccess().getOrderLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1294:4: ( (lv_orderop_2_0= ',' ) )
            	    // InternalCryptSL.g:1295:5: (lv_orderop_2_0= ',' )
            	    {
            	    // InternalCryptSL.g:1295:5: (lv_orderop_2_0= ',' )
            	    // InternalCryptSL.g:1296:6: lv_orderop_2_0= ','
            	    {
            	    lv_orderop_2_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_orderop_2_0, grammarAccess.getOrderAccess().getOrderopCommaKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrderRule());
            	      						}
            	      						setWithLastConsumed(current, "orderop", lv_orderop_2_0, ",");
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1308:4: ( (lv_right_3_0= ruleSimpleOrder ) )
            	    // InternalCryptSL.g:1309:5: (lv_right_3_0= ruleSimpleOrder )
            	    {
            	    // InternalCryptSL.g:1309:5: (lv_right_3_0= ruleSimpleOrder )
            	    // InternalCryptSL.g:1310:6: lv_right_3_0= ruleSimpleOrder
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrderAccess().getRightSimpleOrderParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleSimpleOrder();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrderRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.SimpleOrder");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleSimpleOrder"
    // InternalCryptSL.g:1332:1: entryRuleSimpleOrder returns [EObject current=null] : iv_ruleSimpleOrder= ruleSimpleOrder EOF ;
    public final EObject entryRuleSimpleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrder = null;


        try {
            // InternalCryptSL.g:1332:52: (iv_ruleSimpleOrder= ruleSimpleOrder EOF )
            // InternalCryptSL.g:1333:2: iv_ruleSimpleOrder= ruleSimpleOrder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOrder=ruleSimpleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrder; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleOrder"


    // $ANTLR start "ruleSimpleOrder"
    // InternalCryptSL.g:1339:1: ruleSimpleOrder returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleSimpleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1345:2: ( (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalCryptSL.g:1346:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalCryptSL.g:1346:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalCryptSL.g:1347:3: this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleOrderAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1355:3: ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCryptSL.g:1356:4: () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalCryptSL.g:1356:4: ()
            	    // InternalCryptSL.g:1357:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSimpleOrderAccess().getSimpleOrderLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1363:4: ( (lv_orderop_2_0= '|' ) )
            	    // InternalCryptSL.g:1364:5: (lv_orderop_2_0= '|' )
            	    {
            	    // InternalCryptSL.g:1364:5: (lv_orderop_2_0= '|' )
            	    // InternalCryptSL.g:1365:6: lv_orderop_2_0= '|'
            	    {
            	    lv_orderop_2_0=(Token)match(input,34,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_orderop_2_0, grammarAccess.getSimpleOrderAccess().getOrderopVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSimpleOrderRule());
            	      						}
            	      						setWithLastConsumed(current, "orderop", lv_orderop_2_0, "|");
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1377:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalCryptSL.g:1378:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalCryptSL.g:1378:5: (lv_right_3_0= rulePrimary )
            	    // InternalCryptSL.g:1379:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimpleOrderAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimpleOrderRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleOrder"


    // $ANTLR start "entryRulePrimary"
    // InternalCryptSL.g:1401:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCryptSL.g:1401:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCryptSL.g:1402:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCryptSL.g:1408:1: rulePrimary returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementop_1_1=null;
        Token lv_elementop_1_2=null;
        Token lv_elementop_1_3=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_elementop_5_1=null;
        Token lv_elementop_5_2=null;
        Token lv_elementop_5_3=null;
        EObject this_Order_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1414:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) )
            // InternalCryptSL.g:1415:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            {
            // InternalCryptSL.g:1415:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==25) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCryptSL.g:1416:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    {
                    // InternalCryptSL.g:1416:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    // InternalCryptSL.g:1417:4: ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    {
                    // InternalCryptSL.g:1417:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCryptSL.g:1418:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCryptSL.g:1418:5: (otherlv_0= RULE_ID )
                    // InternalCryptSL.g:1419:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getOrderEvEventCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:1430:4: ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=35 && LA29_0<=37)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalCryptSL.g:1431:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            {
                            // InternalCryptSL.g:1431:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            // InternalCryptSL.g:1432:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            {
                            // InternalCryptSL.g:1432:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            int alt28=3;
                            switch ( input.LA(1) ) {
                            case 35:
                                {
                                alt28=1;
                                }
                                break;
                            case 36:
                                {
                                alt28=2;
                                }
                                break;
                            case 37:
                                {
                                alt28=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;
                            }

                            switch (alt28) {
                                case 1 :
                                    // InternalCryptSL.g:1433:7: lv_elementop_1_1= '+'
                                    {
                                    lv_elementop_1_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_1, grammarAccess.getPrimaryAccess().getElementopPlusSignKeyword_0_1_0_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_1, null);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalCryptSL.g:1444:7: lv_elementop_1_2= '?'
                                    {
                                    lv_elementop_1_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_2, grammarAccess.getPrimaryAccess().getElementopQuestionMarkKeyword_0_1_0_1());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_2, null);
                                      						
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalCryptSL.g:1455:7: lv_elementop_1_3= '*'
                                    {
                                    lv_elementop_1_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_3, grammarAccess.getPrimaryAccess().getElementopAsteriskKeyword_0_1_0_2());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_3, null);
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1470:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    {
                    // InternalCryptSL.g:1470:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    // InternalCryptSL.g:1471:4: otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getOrderParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_Order_3=ruleOrder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Order_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,27,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    // InternalCryptSL.g:1487:4: ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=35 && LA31_0<=37)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalCryptSL.g:1488:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            {
                            // InternalCryptSL.g:1488:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            // InternalCryptSL.g:1489:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            {
                            // InternalCryptSL.g:1489:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            int alt30=3;
                            switch ( input.LA(1) ) {
                            case 35:
                                {
                                alt30=1;
                                }
                                break;
                            case 36:
                                {
                                alt30=2;
                                }
                                break;
                            case 37:
                                {
                                alt30=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }

                            switch (alt30) {
                                case 1 :
                                    // InternalCryptSL.g:1490:7: lv_elementop_5_1= '+'
                                    {
                                    lv_elementop_5_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_1, grammarAccess.getPrimaryAccess().getElementopPlusSignKeyword_1_3_0_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_1, null);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalCryptSL.g:1501:7: lv_elementop_5_2= '?'
                                    {
                                    lv_elementop_5_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_2, grammarAccess.getPrimaryAccess().getElementopQuestionMarkKeyword_1_3_0_1());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_2, null);
                                      						
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalCryptSL.g:1512:7: lv_elementop_5_3= '*'
                                    {
                                    lv_elementop_5_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_3, grammarAccess.getPrimaryAccess().getElementopAsteriskKeyword_1_3_0_2());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_3, null);
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleConstraint"
    // InternalCryptSL.g:1530:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCryptSL.g:1530:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCryptSL.g:1531:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCryptSL.g:1537:1: ruleConstraint returns [EObject current=null] : this_LogicalImplyExpression_0= ruleLogicalImplyExpression ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalImplyExpression_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1543:2: (this_LogicalImplyExpression_0= ruleLogicalImplyExpression )
            // InternalCryptSL.g:1544:2: this_LogicalImplyExpression_0= ruleLogicalImplyExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getConstraintAccess().getLogicalImplyExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_LogicalImplyExpression_0=ruleLogicalImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LogicalImplyExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLogicalImplyExpression"
    // InternalCryptSL.g:1555:1: entryRuleLogicalImplyExpression returns [EObject current=null] : iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF ;
    public final EObject entryRuleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImplyExpression = null;


        try {
            // InternalCryptSL.g:1555:63: (iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF )
            // InternalCryptSL.g:1556:2: iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalImplyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalImplyExpression=ruleLogicalImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalImplyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalImplyExpression"


    // $ANTLR start "ruleLogicalImplyExpression"
    // InternalCryptSL.g:1562:1: ruleLogicalImplyExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1568:2: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) )
            // InternalCryptSL.g:1569:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            {
            // InternalCryptSL.g:1569:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            // InternalCryptSL.g:1570:3: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getLogicalOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1578:3: ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24) ) {
                    switch ( input.LA(2) ) {
                    case 49:
                        {
                        int LA33_3 = input.LA(3);

                        if ( (LA33_3==RULE_ID) ) {
                            int LA33_6 = input.LA(4);

                            if ( (LA33_6==EOF||(LA33_6>=13 && LA33_6<=14)||(LA33_6>=23 && LA33_6<=24)||(LA33_6>=27 && LA33_6<=28)||LA33_6==35||(LA33_6>=38 && LA33_6<=42)||(LA33_6>=50 && LA33_6<=52)) ) {
                                alt33=1;
                            }


                        }
                        else if ( ((LA33_3>=RULE_STRING && LA33_3<=RULE_INT)||LA33_3==25||(LA33_3>=44 && LA33_3<=47)||(LA33_3>=55 && LA33_3<=56)) ) {
                            alt33=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case 25:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 55:
                    case 56:
                        {
                        alt33=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA33_5 = input.LA(3);

                        if ( (LA33_5==EOF||(LA33_5>=13 && LA33_5<=14)||(LA33_5>=23 && LA33_5<=24)||(LA33_5>=27 && LA33_5<=28)||LA33_5==35||(LA33_5>=37 && LA33_5<=43)||(LA33_5>=50 && LA33_5<=52)) ) {
                            alt33=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt33) {
            	case 1 :
            	    // InternalCryptSL.g:1579:4: () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    {
            	    // InternalCryptSL.g:1579:4: ()
            	    // InternalCryptSL.g:1580:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalImplyExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1586:4: ( (lv_operator_2_0= ruleLogicalImply ) )
            	    // InternalCryptSL.g:1587:5: (lv_operator_2_0= ruleLogicalImply )
            	    {
            	    // InternalCryptSL.g:1587:5: (lv_operator_2_0= ruleLogicalImply )
            	    // InternalCryptSL.g:1588:6: lv_operator_2_0= ruleLogicalImply
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getOperatorLogicalImplyParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleLogicalImply();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalImplyExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalImply");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1605:4: ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    // InternalCryptSL.g:1606:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    {
            	    // InternalCryptSL.g:1606:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    // InternalCryptSL.g:1607:6: lv_rightExpression_3_0= ruleLogicalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getRightExpressionLogicalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_rightExpression_3_0=ruleLogicalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalImplyExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalImplyExpression"


    // $ANTLR start "entryRuleLogicalImply"
    // InternalCryptSL.g:1629:1: entryRuleLogicalImply returns [EObject current=null] : iv_ruleLogicalImply= ruleLogicalImply EOF ;
    public final EObject entryRuleLogicalImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImply = null;


        try {
            // InternalCryptSL.g:1629:53: (iv_ruleLogicalImply= ruleLogicalImply EOF )
            // InternalCryptSL.g:1630:2: iv_ruleLogicalImply= ruleLogicalImply EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalImplyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalImply=ruleLogicalImply();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalImply; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalImply"


    // $ANTLR start "ruleLogicalImply"
    // InternalCryptSL.g:1636:1: ruleLogicalImply returns [EObject current=null] : ( (lv_IMPLIES_0_0= '=>' ) ) ;
    public final EObject ruleLogicalImply() throws RecognitionException {
        EObject current = null;

        Token lv_IMPLIES_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1642:2: ( ( (lv_IMPLIES_0_0= '=>' ) ) )
            // InternalCryptSL.g:1643:2: ( (lv_IMPLIES_0_0= '=>' ) )
            {
            // InternalCryptSL.g:1643:2: ( (lv_IMPLIES_0_0= '=>' ) )
            // InternalCryptSL.g:1644:3: (lv_IMPLIES_0_0= '=>' )
            {
            // InternalCryptSL.g:1644:3: (lv_IMPLIES_0_0= '=>' )
            // InternalCryptSL.g:1645:4: lv_IMPLIES_0_0= '=>'
            {
            lv_IMPLIES_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_IMPLIES_0_0, grammarAccess.getLogicalImplyAccess().getIMPLIESEqualsSignGreaterThanSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalImplyRule());
              				}
              				setWithLastConsumed(current, "IMPLIES", lv_IMPLIES_0_0, "=>");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalImply"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalCryptSL.g:1660:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalCryptSL.g:1660:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalCryptSL.g:1661:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalCryptSL.g:1667:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1673:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalCryptSL.g:1674:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalCryptSL.g:1674:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalCryptSL.g:1675:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1683:3: ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCryptSL.g:1684:4: () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalCryptSL.g:1684:4: ()
            	    // InternalCryptSL.g:1685:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalOrExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1691:4: ( (lv_operator_2_0= ruleLogicalOr ) )
            	    // InternalCryptSL.g:1692:5: (lv_operator_2_0= ruleLogicalOr )
            	    {
            	    // InternalCryptSL.g:1692:5: (lv_operator_2_0= ruleLogicalOr )
            	    // InternalCryptSL.g:1693:6: lv_operator_2_0= ruleLogicalOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleLogicalOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1710:4: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // InternalCryptSL.g:1711:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalCryptSL.g:1711:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // InternalCryptSL.g:1712:6: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalOr"
    // InternalCryptSL.g:1734:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // InternalCryptSL.g:1734:50: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // InternalCryptSL.g:1735:2: iv_ruleLogicalOr= ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOr=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // InternalCryptSL.g:1741:1: ruleLogicalOr returns [EObject current=null] : ( (lv_OR_0_0= '||' ) ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        Token lv_OR_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1747:2: ( ( (lv_OR_0_0= '||' ) ) )
            // InternalCryptSL.g:1748:2: ( (lv_OR_0_0= '||' ) )
            {
            // InternalCryptSL.g:1748:2: ( (lv_OR_0_0= '||' ) )
            // InternalCryptSL.g:1749:3: (lv_OR_0_0= '||' )
            {
            // InternalCryptSL.g:1749:3: (lv_OR_0_0= '||' )
            // InternalCryptSL.g:1750:4: lv_OR_0_0= '||'
            {
            lv_OR_0_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_OR_0_0, grammarAccess.getLogicalOrAccess().getORVerticalLineVerticalLineKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalOrRule());
              				}
              				setWithLastConsumed(current, "OR", lv_OR_0_0, "||");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalCryptSL.g:1765:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalCryptSL.g:1765:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalCryptSL.g:1766:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalCryptSL.g:1772:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1778:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalCryptSL.g:1779:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalCryptSL.g:1779:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // InternalCryptSL.g:1780:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1788:3: ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCryptSL.g:1789:4: () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalCryptSL.g:1789:4: ()
            	    // InternalCryptSL.g:1790:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalAndExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1796:4: ( (lv_operator_2_0= ruleLogicalAnd ) )
            	    // InternalCryptSL.g:1797:5: (lv_operator_2_0= ruleLogicalAnd )
            	    {
            	    // InternalCryptSL.g:1797:5: (lv_operator_2_0= ruleLogicalAnd )
            	    // InternalCryptSL.g:1798:6: lv_operator_2_0= ruleLogicalAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1815:4: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // InternalCryptSL.g:1816:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // InternalCryptSL.g:1816:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // InternalCryptSL.g:1817:6: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalAnd"
    // InternalCryptSL.g:1839:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // InternalCryptSL.g:1839:51: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // InternalCryptSL.g:1840:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAnd=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // InternalCryptSL.g:1846:1: ruleLogicalAnd returns [EObject current=null] : ( (lv_AND_0_0= '&&' ) ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        Token lv_AND_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1852:2: ( ( (lv_AND_0_0= '&&' ) ) )
            // InternalCryptSL.g:1853:2: ( (lv_AND_0_0= '&&' ) )
            {
            // InternalCryptSL.g:1853:2: ( (lv_AND_0_0= '&&' ) )
            // InternalCryptSL.g:1854:3: (lv_AND_0_0= '&&' )
            {
            // InternalCryptSL.g:1854:3: (lv_AND_0_0= '&&' )
            // InternalCryptSL.g:1855:4: lv_AND_0_0= '&&'
            {
            lv_AND_0_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_AND_0_0, grammarAccess.getLogicalAndAccess().getANDAmpersandAmpersandKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalAndRule());
              				}
              				setWithLastConsumed(current, "AND", lv_AND_0_0, "&&");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalAnd"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalCryptSL.g:1870:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalCryptSL.g:1870:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalCryptSL.g:1871:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalCryptSL.g:1877:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1883:2: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // InternalCryptSL.g:1884:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // InternalCryptSL.g:1884:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // InternalCryptSL.g:1885:3: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonHigherOpExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1893:3: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=50 && LA36_0<=51)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCryptSL.g:1894:4: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // InternalCryptSL.g:1894:4: ()
                    // InternalCryptSL.g:1895:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCryptSL.g:1901:4: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // InternalCryptSL.g:1902:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // InternalCryptSL.g:1902:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // InternalCryptSL.g:1903:6: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparingEQNEQOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:1920:4: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // InternalCryptSL.g:1921:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // InternalCryptSL.g:1921:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // InternalCryptSL.g:1922:6: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightExpression",
                      							lv_rightExpression_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparisonHigherOpExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalCryptSL.g:1944:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // InternalCryptSL.g:1944:69: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // InternalCryptSL.g:1945:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonHigherOpExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // InternalCryptSL.g:1951:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1957:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalCryptSL.g:1958:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalCryptSL.g:1958:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // InternalCryptSL.g:1959:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithmeticExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1967:3: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=13 && LA37_0<=14)||(LA37_0>=40 && LA37_0<=41)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCryptSL.g:1968:4: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalCryptSL.g:1968:4: ()
                    // InternalCryptSL.g:1969:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCryptSL.g:1975:4: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // InternalCryptSL.g:1976:5: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // InternalCryptSL.g:1976:5: (lv_operator_2_0= ruleComparingRelOperator )
                    // InternalCryptSL.g:1977:6: lv_operator_2_0= ruleComparingRelOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparingRelOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:1994:4: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // InternalCryptSL.g:1995:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // InternalCryptSL.g:1995:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // InternalCryptSL.g:1996:6: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightExpression",
                      							lv_rightExpression_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleComparingRelOperator"
    // InternalCryptSL.g:2018:1: entryRuleComparingRelOperator returns [EObject current=null] : iv_ruleComparingRelOperator= ruleComparingRelOperator EOF ;
    public final EObject entryRuleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingRelOperator = null;


        try {
            // InternalCryptSL.g:2018:61: (iv_ruleComparingRelOperator= ruleComparingRelOperator EOF )
            // InternalCryptSL.g:2019:2: iv_ruleComparingRelOperator= ruleComparingRelOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparingRelOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparingRelOperator=ruleComparingRelOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparingRelOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparingRelOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalCryptSL.g:2025:1: ruleComparingRelOperator returns [EObject current=null] : ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) ;
    public final EObject ruleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        Token lv_LESS_0_0=null;
        Token lv_LESS_OR_EQUAL_1_0=null;
        Token lv_GREATER_OR_EQUAL_2_0=null;
        Token lv_GREATER_3_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2031:2: ( ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) )
            // InternalCryptSL.g:2032:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            {
            // InternalCryptSL.g:2032:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case 41:
                {
                alt38=3;
                }
                break;
            case 14:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalCryptSL.g:2033:3: ( (lv_LESS_0_0= '<' ) )
                    {
                    // InternalCryptSL.g:2033:3: ( (lv_LESS_0_0= '<' ) )
                    // InternalCryptSL.g:2034:4: (lv_LESS_0_0= '<' )
                    {
                    // InternalCryptSL.g:2034:4: (lv_LESS_0_0= '<' )
                    // InternalCryptSL.g:2035:5: lv_LESS_0_0= '<'
                    {
                    lv_LESS_0_0=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_LESS_0_0, grammarAccess.getComparingRelOperatorAccess().getLESSLessThanSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "LESS", lv_LESS_0_0, "<");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2048:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    {
                    // InternalCryptSL.g:2048:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    // InternalCryptSL.g:2049:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    {
                    // InternalCryptSL.g:2049:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    // InternalCryptSL.g:2050:5: lv_LESS_OR_EQUAL_1_0= '<='
                    {
                    lv_LESS_OR_EQUAL_1_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_LESS_OR_EQUAL_1_0, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALLessThanSignEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "LESS_OR_EQUAL", lv_LESS_OR_EQUAL_1_0, "<=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:2063:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    {
                    // InternalCryptSL.g:2063:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    // InternalCryptSL.g:2064:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    {
                    // InternalCryptSL.g:2064:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    // InternalCryptSL.g:2065:5: lv_GREATER_OR_EQUAL_2_0= '>='
                    {
                    lv_GREATER_OR_EQUAL_2_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_GREATER_OR_EQUAL_2_0, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALGreaterThanSignEqualsSignKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "GREATER_OR_EQUAL", lv_GREATER_OR_EQUAL_2_0, ">=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCryptSL.g:2078:3: ( (lv_GREATER_3_0= '>' ) )
                    {
                    // InternalCryptSL.g:2078:3: ( (lv_GREATER_3_0= '>' ) )
                    // InternalCryptSL.g:2079:4: (lv_GREATER_3_0= '>' )
                    {
                    // InternalCryptSL.g:2079:4: (lv_GREATER_3_0= '>' )
                    // InternalCryptSL.g:2080:5: lv_GREATER_3_0= '>'
                    {
                    lv_GREATER_3_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_GREATER_3_0, grammarAccess.getComparingRelOperatorAccess().getGREATERGreaterThanSignKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "GREATER", lv_GREATER_3_0, ">");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalCryptSL.g:2096:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalCryptSL.g:2096:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalCryptSL.g:2097:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalCryptSL.g:2103:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2109:2: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalCryptSL.g:2110:2: this_AdditionExpression_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AdditionExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalCryptSL.g:2121:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalCryptSL.g:2121:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalCryptSL.g:2122:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalCryptSL.g:2128:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2134:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalCryptSL.g:2135:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalCryptSL.g:2135:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalCryptSL.g:2136:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2144:3: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35||LA39_0==42) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCryptSL.g:2145:4: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalCryptSL.g:2145:4: ()
            	    // InternalCryptSL.g:2146:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2152:4: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalCryptSL.g:2153:5: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalCryptSL.g:2153:5: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalCryptSL.g:2154:6: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.AdditionOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2171:4: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // InternalCryptSL.g:2172:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalCryptSL.g:2172:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // InternalCryptSL.g:2173:6: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.MultiplicationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleAdditionOperator"
    // InternalCryptSL.g:2195:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // InternalCryptSL.g:2195:57: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // InternalCryptSL.g:2196:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditionOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalCryptSL.g:2202:1: ruleAdditionOperator returns [EObject current=null] : ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_PLUS_0_0=null;
        Token lv_MINUS_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2208:2: ( ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) )
            // InternalCryptSL.g:2209:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            {
            // InternalCryptSL.g:2209:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            else if ( (LA40_0==42) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalCryptSL.g:2210:3: ( (lv_PLUS_0_0= '+' ) )
                    {
                    // InternalCryptSL.g:2210:3: ( (lv_PLUS_0_0= '+' ) )
                    // InternalCryptSL.g:2211:4: (lv_PLUS_0_0= '+' )
                    {
                    // InternalCryptSL.g:2211:4: (lv_PLUS_0_0= '+' )
                    // InternalCryptSL.g:2212:5: lv_PLUS_0_0= '+'
                    {
                    lv_PLUS_0_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_PLUS_0_0, grammarAccess.getAdditionOperatorAccess().getPLUSPlusSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAdditionOperatorRule());
                      					}
                      					setWithLastConsumed(current, "PLUS", lv_PLUS_0_0, "+");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2225:3: ( (lv_MINUS_1_0= '-' ) )
                    {
                    // InternalCryptSL.g:2225:3: ( (lv_MINUS_1_0= '-' ) )
                    // InternalCryptSL.g:2226:4: (lv_MINUS_1_0= '-' )
                    {
                    // InternalCryptSL.g:2226:4: (lv_MINUS_1_0= '-' )
                    // InternalCryptSL.g:2227:5: lv_MINUS_1_0= '-'
                    {
                    lv_MINUS_1_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_MINUS_1_0, grammarAccess.getAdditionOperatorAccess().getMINUSHyphenMinusKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAdditionOperatorRule());
                      					}
                      					setWithLastConsumed(current, "MINUS", lv_MINUS_1_0, "-");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalCryptSL.g:2243:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalCryptSL.g:2243:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalCryptSL.g:2244:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalCryptSL.g:2250:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_Operand_1 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2256:2: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) )
            // InternalCryptSL.g:2257:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            {
            // InternalCryptSL.g:2257:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==25||(LA42_0>=44 && LA42_0<=47)||(LA42_0>=55 && LA42_0<=56)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCryptSL.g:2258:3: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryPreExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2267:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    {
                    // InternalCryptSL.g:2267:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    // InternalCryptSL.g:2268:4: this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    this_Operand_1=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Operand_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:2276:4: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==37||LA41_0==43) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalCryptSL.g:2277:5: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    {
                    	    // InternalCryptSL.g:2277:5: ()
                    	    // InternalCryptSL.g:2278:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalCryptSL.g:2284:5: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // InternalCryptSL.g:2285:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // InternalCryptSL.g:2285:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // InternalCryptSL.g:2286:7: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"operator",
                    	      								lv_operator_3_0,
                    	      								"de.darmstadt.tu.crossing.CryptSL.MultiplicationOperator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:2303:5: ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    // InternalCryptSL.g:2304:6: (lv_rightExpression_4_0= ruleOperand )
                    	    {
                    	    // InternalCryptSL.g:2304:6: (lv_rightExpression_4_0= ruleOperand )
                    	    // InternalCryptSL.g:2305:7: lv_rightExpression_4_0= ruleOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_rightExpression_4_0=ruleOperand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"rightExpression",
                    	      								lv_rightExpression_4_0,
                    	      								"de.darmstadt.tu.crossing.CryptSL.Operand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // InternalCryptSL.g:2328:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // InternalCryptSL.g:2328:63: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // InternalCryptSL.g:2329:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalCryptSL.g:2335:1: ruleMultiplicationOperator returns [EObject current=null] : ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token lv_TIMES_0_0=null;
        Token lv_DIVIDE_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2341:2: ( ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) )
            // InternalCryptSL.g:2342:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            {
            // InternalCryptSL.g:2342:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            else if ( (LA43_0==43) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalCryptSL.g:2343:3: ( (lv_TIMES_0_0= '*' ) )
                    {
                    // InternalCryptSL.g:2343:3: ( (lv_TIMES_0_0= '*' ) )
                    // InternalCryptSL.g:2344:4: (lv_TIMES_0_0= '*' )
                    {
                    // InternalCryptSL.g:2344:4: (lv_TIMES_0_0= '*' )
                    // InternalCryptSL.g:2345:5: lv_TIMES_0_0= '*'
                    {
                    lv_TIMES_0_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_TIMES_0_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
                      					}
                      					setWithLastConsumed(current, "TIMES", lv_TIMES_0_0, "*");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2358:3: ( (lv_DIVIDE_1_0= '/' ) )
                    {
                    // InternalCryptSL.g:2358:3: ( (lv_DIVIDE_1_0= '/' ) )
                    // InternalCryptSL.g:2359:4: (lv_DIVIDE_1_0= '/' )
                    {
                    // InternalCryptSL.g:2359:4: (lv_DIVIDE_1_0= '/' )
                    // InternalCryptSL.g:2360:5: lv_DIVIDE_1_0= '/'
                    {
                    lv_DIVIDE_1_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_DIVIDE_1_0, grammarAccess.getMultiplicationOperatorAccess().getDIVIDESolidusKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
                      					}
                      					setWithLastConsumed(current, "DIVIDE", lv_DIVIDE_1_0, "/");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalCryptSL.g:2376:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // InternalCryptSL.g:2376:59: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // InternalCryptSL.g:2377:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPreExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // InternalCryptSL.g:2383:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2389:2: ( ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) )
            // InternalCryptSL.g:2390:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            {
            // InternalCryptSL.g:2390:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // InternalCryptSL.g:2391:3: () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // InternalCryptSL.g:2391:3: ()
            // InternalCryptSL.g:2392:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnaryPreExpressionAccess().getUnaryPreExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:2398:3: ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // InternalCryptSL.g:2399:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // InternalCryptSL.g:2399:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // InternalCryptSL.g:2400:5: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // InternalCryptSL.g:2400:5: (lv_operator_1_0= ruleUnaryPreOperator )
            // InternalCryptSL.g:2401:6: lv_operator_1_0= ruleUnaryPreOperator
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_12);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              						}
              						set(
              							current,
              							"operator",
              							lv_operator_1_0,
              							"de.darmstadt.tu.crossing.CryptSL.UnaryPreOperator");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCryptSL.g:2418:4: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // InternalCryptSL.g:2419:5: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // InternalCryptSL.g:2419:5: (lv_enclosedExpression_2_0= ruleOperand )
            // InternalCryptSL.g:2420:6: lv_enclosedExpression_2_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_2);
            lv_enclosedExpression_2_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              						}
              						set(
              							current,
              							"enclosedExpression",
              							lv_enclosedExpression_2_0,
              							"de.darmstadt.tu.crossing.CryptSL.Operand");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalCryptSL.g:2442:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalCryptSL.g:2442:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalCryptSL.g:2443:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalCryptSL.g:2449:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Constraint_1 = null;

        EObject this_Cons_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2455:2: ( ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) )
            // InternalCryptSL.g:2456:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            {
            // InternalCryptSL.g:2456:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||(LA44_0>=44 && LA44_0<=47)||(LA44_0>=55 && LA44_0<=56)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalCryptSL.g:2457:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    {
                    // InternalCryptSL.g:2457:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    // InternalCryptSL.g:2458:4: otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Constraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2476:3: this_Cons_3= ruleCons
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getConsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Cons_3=ruleCons();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Cons_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalCryptSL.g:2488:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalCryptSL.g:2488:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalCryptSL.g:2489:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalCryptSL.g:2495:1: ruleLiteralExpression returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject this_PreDefinedPredicates_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2501:2: ( ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) )
            // InternalCryptSL.g:2502:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            {
            // InternalCryptSL.g:2502:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                alt45=2;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalCryptSL.g:2503:3: ( (lv_name_0_0= ruleLiteral ) )
                    {
                    // InternalCryptSL.g:2503:3: ( (lv_name_0_0= ruleLiteral ) )
                    // InternalCryptSL.g:2504:4: (lv_name_0_0= ruleLiteral )
                    {
                    // InternalCryptSL.g:2504:4: (lv_name_0_0= ruleLiteral )
                    // InternalCryptSL.g:2505:5: lv_name_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNameLiteralParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"de.darmstadt.tu.crossing.CryptSL.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2523:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    {
                    // InternalCryptSL.g:2523:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    // InternalCryptSL.g:2524:4: (lv_name_1_0= ruleAggregateExpression )
                    {
                    // InternalCryptSL.g:2524:4: (lv_name_1_0= ruleAggregateExpression )
                    // InternalCryptSL.g:2525:5: lv_name_1_0= ruleAggregateExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNameAggregateExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleAggregateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"de.darmstadt.tu.crossing.CryptSL.AggregateExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:2543:3: this_PreDefinedPredicates_2= rulePreDefinedPredicates
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getPreDefinedPredicatesParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PreDefinedPredicates_2=rulePreDefinedPredicates();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreDefinedPredicates_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRulePreDefinedPredicates"
    // InternalCryptSL.g:2555:1: entryRulePreDefinedPredicates returns [EObject current=null] : iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF ;
    public final EObject entryRulePreDefinedPredicates() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedPredicates = null;


        try {
            // InternalCryptSL.g:2555:61: (iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF )
            // InternalCryptSL.g:2556:2: iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreDefinedPredicatesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreDefinedPredicates=rulePreDefinedPredicates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreDefinedPredicates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePreDefinedPredicates"


    // $ANTLR start "rulePreDefinedPredicates"
    // InternalCryptSL.g:2562:1: rulePreDefinedPredicates returns [EObject current=null] : ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) | ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) ) ;
    public final EObject rulePreDefinedPredicates() throws RecognitionException {
        EObject current = null;

        Token lv_predName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_predName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_predName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_predName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2568:2: ( ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) | ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) ) )
            // InternalCryptSL.g:2569:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) | ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) )
            {
            // InternalCryptSL.g:2569:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) | ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt50=1;
                }
                break;
            case 45:
                {
                alt50=2;
                }
                break;
            case 46:
                {
                alt50=3;
                }
                break;
            case 47:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalCryptSL.g:2570:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' )
                    {
                    // InternalCryptSL.g:2570:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')' )
                    // InternalCryptSL.g:2571:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( ruleQualifiedName ) ) otherlv_5= ')'
                    {
                    // InternalCryptSL.g:2571:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==44) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalCryptSL.g:2572:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    {
                    	    // InternalCryptSL.g:2572:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    // InternalCryptSL.g:2573:6: lv_predName_0_0= 'neverTypeOf'
                    	    {
                    	    lv_predName_0_0=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_0_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNeverTypeOfKeyword_0_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_0_0, "neverTypeOf");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPreDefinedPredicatesAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalCryptSL.g:2589:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:2590:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:2590:5: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:2591:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_0_2_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPreDefinedPredicatesAccess().getCommaKeyword_0_3());
                      			
                    }
                    // InternalCryptSL.g:2606:4: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:2607:5: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:2607:5: ( ruleQualifiedName )
                    // InternalCryptSL.g:2608:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreDefinedPredicatesAccess().getTypeJvmTypeCrossReference_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPreDefinedPredicatesAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2628:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    {
                    // InternalCryptSL.g:2628:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    // InternalCryptSL.g:2629:4: ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
                    {
                    // InternalCryptSL.g:2629:4: ( (lv_predName_6_0= 'noCallTo' ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==45) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalCryptSL.g:2630:5: (lv_predName_6_0= 'noCallTo' )
                    	    {
                    	    // InternalCryptSL.g:2630:5: (lv_predName_6_0= 'noCallTo' )
                    	    // InternalCryptSL.g:2631:6: lv_predName_6_0= 'noCallTo'
                    	    {
                    	    lv_predName_6_0=(Token)match(input,45,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_6_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNoCallToKeyword_1_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_6_0, "noCallTo");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPreDefinedPredicatesAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalCryptSL.g:2647:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCryptSL.g:2648:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCryptSL.g:2648:5: (otherlv_8= RULE_ID )
                    // InternalCryptSL.g:2649:6: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPreDefinedPredicatesAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:2666:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )
                    {
                    // InternalCryptSL.g:2666:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )
                    // InternalCryptSL.g:2667:4: ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')'
                    {
                    // InternalCryptSL.g:2667:4: ( (lv_predName_10_0= 'callTo' ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==46) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalCryptSL.g:2668:5: (lv_predName_10_0= 'callTo' )
                    	    {
                    	    // InternalCryptSL.g:2668:5: (lv_predName_10_0= 'callTo' )
                    	    // InternalCryptSL.g:2669:6: lv_predName_10_0= 'callTo'
                    	    {
                    	    lv_predName_10_0=(Token)match(input,46,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_10_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameCallToKeyword_2_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_10_0, "callTo");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPreDefinedPredicatesAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalCryptSL.g:2685:4: ( (otherlv_12= RULE_ID ) )
                    // InternalCryptSL.g:2686:5: (otherlv_12= RULE_ID )
                    {
                    // InternalCryptSL.g:2686:5: (otherlv_12= RULE_ID )
                    // InternalCryptSL.g:2687:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_2_2_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPreDefinedPredicatesAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCryptSL.g:2704:3: ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' )
                    {
                    // InternalCryptSL.g:2704:3: ( ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' )
                    // InternalCryptSL.g:2705:4: ( (lv_predName_14_0= 'length' ) )+ otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')'
                    {
                    // InternalCryptSL.g:2705:4: ( (lv_predName_14_0= 'length' ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==47) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalCryptSL.g:2706:5: (lv_predName_14_0= 'length' )
                    	    {
                    	    // InternalCryptSL.g:2706:5: (lv_predName_14_0= 'length' )
                    	    // InternalCryptSL.g:2707:6: lv_predName_14_0= 'length'
                    	    {
                    	    lv_predName_14_0=(Token)match(input,47,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_14_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameLengthKeyword_3_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_14_0, "length");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getPreDefinedPredicatesAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalCryptSL.g:2723:4: ( (otherlv_16= RULE_ID ) )
                    // InternalCryptSL.g:2724:5: (otherlv_16= RULE_ID )
                    {
                    // InternalCryptSL.g:2724:5: (otherlv_16= RULE_ID )
                    // InternalCryptSL.g:2725:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPreDefinedPredicatesAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePreDefinedPredicates"


    // $ANTLR start "entryRuleAggregateExpression"
    // InternalCryptSL.g:2745:1: entryRuleAggregateExpression returns [EObject current=null] : iv_ruleAggregateExpression= ruleAggregateExpression EOF ;
    public final EObject entryRuleAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateExpression = null;


        try {
            // InternalCryptSL.g:2745:60: (iv_ruleAggregateExpression= ruleAggregateExpression EOF )
            // InternalCryptSL.g:2746:2: iv_ruleAggregateExpression= ruleAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregateExpression=ruleAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregateExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAggregateExpression"


    // $ANTLR start "ruleAggregateExpression"
    // InternalCryptSL.g:2752:1: ruleAggregateExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) ;
    public final EObject ruleAggregateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2758:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) )
            // InternalCryptSL.g:2759:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            {
            // InternalCryptSL.g:2759:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            // InternalCryptSL.g:2760:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )?
            {
            // InternalCryptSL.g:2760:3: ( (otherlv_0= RULE_ID ) )
            // InternalCryptSL.g:2761:4: (otherlv_0= RULE_ID )
            {
            // InternalCryptSL.g:2761:4: (otherlv_0= RULE_ID )
            // InternalCryptSL.g:2762:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAggregateExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAggregateExpressionAccess().getValueSuperTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalCryptSL.g:2773:3: (otherlv_1= '.' this_ID_2= RULE_ID )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCryptSL.g:2774:4: otherlv_1= '.' this_ID_2= RULE_ID
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAggregateExpressionAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getAggregateExpressionAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAggregateExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalCryptSL.g:2787:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalCryptSL.g:2787:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalCryptSL.g:2788:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalCryptSL.g:2794:1: ruleLiteral returns [EObject current=null] : ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_1 = null;

        AntlrDatatypeRuleToken lv_val_1_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2800:2: ( ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) ) ) )
            // InternalCryptSL.g:2801:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) ) )
            {
            // InternalCryptSL.g:2801:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) ) )
            // InternalCryptSL.g:2802:3: () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) )
            {
            // InternalCryptSL.g:2802:3: ()
            // InternalCryptSL.g:2803:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralAccess().getLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:2809:3: ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) ) )
            // InternalCryptSL.g:2810:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) )
            {
            // InternalCryptSL.g:2810:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral ) )
            // InternalCryptSL.g:2811:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral )
            {
            // InternalCryptSL.g:2811:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_INT) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalCryptSL.g:2812:6: lv_val_1_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValStringLiteralParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_1,
                      							"de.darmstadt.tu.crossing.CryptSL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2828:6: lv_val_1_2= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValIntegerLiteralParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_2=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_2,
                      							"de.darmstadt.tu.crossing.CryptSL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalCryptSL.g:2850:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalCryptSL.g:2850:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCryptSL.g:2851:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalCryptSL.g:2857:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2863:2: (this_STRING_0= RULE_STRING )
            // InternalCryptSL.g:2864:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalCryptSL.g:2874:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // InternalCryptSL.g:2874:54: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalCryptSL.g:2875:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalCryptSL.g:2881:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2887:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) )
            // InternalCryptSL.g:2888:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            {
            // InternalCryptSL.g:2888:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==48) ) {
                    alt53=2;
                }
                else if ( (LA53_1==EOF||(LA53_1>=13 && LA53_1<=14)||(LA53_1>=23 && LA53_1<=24)||(LA53_1>=26 && LA53_1<=27)||LA53_1==35||(LA53_1>=37 && LA53_1<=43)||(LA53_1>=50 && LA53_1<=52)||LA53_1==54||LA53_1==59) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalCryptSL.g:2889:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2897:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    {
                    // InternalCryptSL.g:2897:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    // InternalCryptSL.g:2898:4: this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,48,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIntegerLiteralAccess().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleUnaryPreOperator"
    // InternalCryptSL.g:2922:1: entryRuleUnaryPreOperator returns [EObject current=null] : iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF ;
    public final EObject entryRuleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreOperator = null;


        try {
            // InternalCryptSL.g:2922:57: (iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF )
            // InternalCryptSL.g:2923:2: iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPreOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryPreOperator=ruleUnaryPreOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPreOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryPreOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalCryptSL.g:2929:1: ruleUnaryPreOperator returns [EObject current=null] : ( (lv_NOT_0_0= '!' ) ) ;
    public final EObject ruleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        Token lv_NOT_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2935:2: ( ( (lv_NOT_0_0= '!' ) ) )
            // InternalCryptSL.g:2936:2: ( (lv_NOT_0_0= '!' ) )
            {
            // InternalCryptSL.g:2936:2: ( (lv_NOT_0_0= '!' ) )
            // InternalCryptSL.g:2937:3: (lv_NOT_0_0= '!' )
            {
            // InternalCryptSL.g:2937:3: (lv_NOT_0_0= '!' )
            // InternalCryptSL.g:2938:4: lv_NOT_0_0= '!'
            {
            lv_NOT_0_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_NOT_0_0, grammarAccess.getUnaryPreOperatorAccess().getNOTExclamationMarkKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getUnaryPreOperatorRule());
              				}
              				setWithLastConsumed(current, "NOT", lv_NOT_0_0, "!");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "entryRuleComparingEQNEQOperator"
    // InternalCryptSL.g:2953:1: entryRuleComparingEQNEQOperator returns [EObject current=null] : iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF ;
    public final EObject entryRuleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingEQNEQOperator = null;


        try {
            // InternalCryptSL.g:2953:63: (iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF )
            // InternalCryptSL.g:2954:2: iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparingEQNEQOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparingEQNEQOperator=ruleComparingEQNEQOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparingEQNEQOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalCryptSL.g:2960:1: ruleComparingEQNEQOperator returns [EObject current=null] : ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) ;
    public final EObject ruleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        Token lv_EQUAL_0_0=null;
        Token lv_UNEQUAL_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2966:2: ( ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) )
            // InternalCryptSL.g:2967:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            {
            // InternalCryptSL.g:2967:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            else if ( (LA54_0==51) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCryptSL.g:2968:3: ( (lv_EQUAL_0_0= '==' ) )
                    {
                    // InternalCryptSL.g:2968:3: ( (lv_EQUAL_0_0= '==' ) )
                    // InternalCryptSL.g:2969:4: (lv_EQUAL_0_0= '==' )
                    {
                    // InternalCryptSL.g:2969:4: (lv_EQUAL_0_0= '==' )
                    // InternalCryptSL.g:2970:5: lv_EQUAL_0_0= '=='
                    {
                    lv_EQUAL_0_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_EQUAL_0_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEqualsSignEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingEQNEQOperatorRule());
                      					}
                      					setWithLastConsumed(current, "EQUAL", lv_EQUAL_0_0, "==");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2983:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    {
                    // InternalCryptSL.g:2983:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    // InternalCryptSL.g:2984:4: (lv_UNEQUAL_1_0= '!=' )
                    {
                    // InternalCryptSL.g:2984:4: (lv_UNEQUAL_1_0= '!=' )
                    // InternalCryptSL.g:2985:5: lv_UNEQUAL_1_0= '!='
                    {
                    lv_UNEQUAL_1_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_UNEQUAL_1_0, grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALExclamationMarkEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingEQNEQOperatorRule());
                      					}
                      					setWithLastConsumed(current, "UNEQUAL", lv_UNEQUAL_1_0, "!=");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "entryRuleCons"
    // InternalCryptSL.g:3001:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalCryptSL.g:3001:45: (iv_ruleCons= ruleCons EOF )
            // InternalCryptSL.g:3002:2: iv_ruleCons= ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCons=ruleCons();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCons; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // InternalCryptSL.g:3008:1: ruleCons returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cons_0_0 = null;

        EObject lv_litsleft_3_0 = null;

        EObject lv_cons_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3014:2: ( ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) ) )
            // InternalCryptSL.g:3015:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )
            {
            // InternalCryptSL.g:3015:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalCryptSL.g:3016:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                    {
                    // InternalCryptSL.g:3016:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                    // InternalCryptSL.g:3017:4: ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}'
                    {
                    // InternalCryptSL.g:3017:4: ( (lv_cons_0_0= ruleArrayElements ) )
                    // InternalCryptSL.g:3018:5: (lv_cons_0_0= ruleArrayElements )
                    {
                    // InternalCryptSL.g:3018:5: (lv_cons_0_0= ruleArrayElements )
                    // InternalCryptSL.g:3019:6: lv_cons_0_0= ruleArrayElements
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsAccess().getConsArrayElementsParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_cons_0_0=ruleArrayElements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_0_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ArrayElements");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConsAccess().getInKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,53,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConsAccess().getLeftCurlyBracketKeyword_0_2());
                      			
                    }
                    // InternalCryptSL.g:3044:4: ( (lv_litsleft_3_0= ruleLitList ) )
                    // InternalCryptSL.g:3045:5: (lv_litsleft_3_0= ruleLitList )
                    {
                    // InternalCryptSL.g:3045:5: (lv_litsleft_3_0= ruleLitList )
                    // InternalCryptSL.g:3046:6: lv_litsleft_3_0= ruleLitList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsAccess().getLitsleftLitListParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_litsleft_3_0=ruleLitList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsRule());
                      						}
                      						set(
                      							current,
                      							"litsleft",
                      							lv_litsleft_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.LitList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3069:3: ( (lv_cons_5_0= ruleLiteralExpression ) )
                    {
                    // InternalCryptSL.g:3069:3: ( (lv_cons_5_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:3070:4: (lv_cons_5_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:3070:4: (lv_cons_5_0= ruleLiteralExpression )
                    // InternalCryptSL.g:3071:5: lv_cons_5_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConsAccess().getConsLiteralExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cons_5_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConsRule());
                      					}
                      					set(
                      						current,
                      						"cons",
                      						lv_cons_5_0,
                      						"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleArrayElements"
    // InternalCryptSL.g:3092:1: entryRuleArrayElements returns [EObject current=null] : iv_ruleArrayElements= ruleArrayElements EOF ;
    public final EObject entryRuleArrayElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayElements = null;


        try {
            // InternalCryptSL.g:3092:54: (iv_ruleArrayElements= ruleArrayElements EOF )
            // InternalCryptSL.g:3093:2: iv_ruleArrayElements= ruleArrayElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayElements=ruleArrayElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayElements"


    // $ANTLR start "ruleArrayElements"
    // InternalCryptSL.g:3099:1: ruleArrayElements returns [EObject current=null] : ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) ;
    public final EObject ruleArrayElements() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_2=null;
        EObject lv_cons_1_0 = null;

        EObject lv_cons_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3105:2: ( ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) )
            // InternalCryptSL.g:3106:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            {
            // InternalCryptSL.g:3106:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||(LA56_0>=44 && LA56_0<=47)||LA56_0==56) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalCryptSL.g:3107:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    {
                    // InternalCryptSL.g:3107:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    // InternalCryptSL.g:3108:4: ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')'
                    {
                    // InternalCryptSL.g:3108:4: ( (lv_el_0_0= 'elements(' ) )
                    // InternalCryptSL.g:3109:5: (lv_el_0_0= 'elements(' )
                    {
                    // InternalCryptSL.g:3109:5: (lv_el_0_0= 'elements(' )
                    // InternalCryptSL.g:3110:6: lv_el_0_0= 'elements('
                    {
                    lv_el_0_0=(Token)match(input,55,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_el_0_0, grammarAccess.getArrayElementsAccess().getElElementsKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayElementsRule());
                      						}
                      						setWithLastConsumed(current, "el", lv_el_0_0, "elements(");
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:3122:4: ( (lv_cons_1_0= ruleConsPred ) )
                    // InternalCryptSL.g:3123:5: (lv_cons_1_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:3123:5: (lv_cons_1_0= ruleConsPred )
                    // InternalCryptSL.g:3124:6: lv_cons_1_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayElementsAccess().getConsConsPredParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_cons_1_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayElementsRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_1_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayElementsAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3147:3: ( (lv_cons_3_0= ruleConsPred ) )
                    {
                    // InternalCryptSL.g:3147:3: ( (lv_cons_3_0= ruleConsPred ) )
                    // InternalCryptSL.g:3148:4: (lv_cons_3_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:3148:4: (lv_cons_3_0= ruleConsPred )
                    // InternalCryptSL.g:3149:5: lv_cons_3_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayElementsAccess().getConsConsPredParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cons_3_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArrayElementsRule());
                      					}
                      					set(
                      						current,
                      						"cons",
                      						lv_cons_3_0,
                      						"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayElements"


    // $ANTLR start "entryRuleConsPred"
    // InternalCryptSL.g:3170:1: entryRuleConsPred returns [EObject current=null] : iv_ruleConsPred= ruleConsPred EOF ;
    public final EObject entryRuleConsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsPred = null;


        try {
            // InternalCryptSL.g:3170:49: (iv_ruleConsPred= ruleConsPred EOF )
            // InternalCryptSL.g:3171:2: iv_ruleConsPred= ruleConsPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConsPred=ruleConsPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConsPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConsPred"


    // $ANTLR start "ruleConsPred"
    // InternalCryptSL.g:3177:1: ruleConsPred returns [EObject current=null] : ( ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' ) | ( (lv_lit_7_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleConsPred() throws RecognitionException {
        EObject current = null;

        Token lv_part_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ind_1_0 = null;

        AntlrDatatypeRuleToken lv_split_3_0 = null;

        EObject lv_lit_5_0 = null;

        EObject lv_lit_7_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3183:2: ( ( ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' ) | ( (lv_lit_7_0= ruleLiteralExpression ) ) ) )
            // InternalCryptSL.g:3184:2: ( ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' ) | ( (lv_lit_7_0= ruleLiteralExpression ) ) )
            {
            // InternalCryptSL.g:3184:2: ( ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' ) | ( (lv_lit_7_0= ruleLiteralExpression ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_INT)||(LA57_0>=44 && LA57_0<=47)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalCryptSL.g:3185:3: ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' )
                    {
                    // InternalCryptSL.g:3185:3: ( ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')' )
                    // InternalCryptSL.g:3186:4: ( (lv_part_0_0= 'part(' ) ) ( (lv_ind_1_0= ruleIntegerLiteral ) ) otherlv_2= ',' ( (lv_split_3_0= ruleStringLiteral ) ) otherlv_4= ',' ( (lv_lit_5_0= ruleLiteralExpression ) ) otherlv_6= ')'
                    {
                    // InternalCryptSL.g:3186:4: ( (lv_part_0_0= 'part(' ) )
                    // InternalCryptSL.g:3187:5: (lv_part_0_0= 'part(' )
                    {
                    // InternalCryptSL.g:3187:5: (lv_part_0_0= 'part(' )
                    // InternalCryptSL.g:3188:6: lv_part_0_0= 'part('
                    {
                    lv_part_0_0=(Token)match(input,56,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_part_0_0, grammarAccess.getConsPredAccess().getPartPartKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConsPredRule());
                      						}
                      						setWithLastConsumed(current, "part", lv_part_0_0, "part(");
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:3200:4: ( (lv_ind_1_0= ruleIntegerLiteral ) )
                    // InternalCryptSL.g:3201:5: (lv_ind_1_0= ruleIntegerLiteral )
                    {
                    // InternalCryptSL.g:3201:5: (lv_ind_1_0= ruleIntegerLiteral )
                    // InternalCryptSL.g:3202:6: lv_ind_1_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getIndIntegerLiteralParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_ind_1_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"ind",
                      							lv_ind_1_0,
                      							"de.darmstadt.tu.crossing.CryptSL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConsPredAccess().getCommaKeyword_0_2());
                      			
                    }
                    // InternalCryptSL.g:3223:4: ( (lv_split_3_0= ruleStringLiteral ) )
                    // InternalCryptSL.g:3224:5: (lv_split_3_0= ruleStringLiteral )
                    {
                    // InternalCryptSL.g:3224:5: (lv_split_3_0= ruleStringLiteral )
                    // InternalCryptSL.g:3225:6: lv_split_3_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getSplitStringLiteralParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_split_3_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"split",
                      							lv_split_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConsPredAccess().getCommaKeyword_0_4());
                      			
                    }
                    // InternalCryptSL.g:3246:4: ( (lv_lit_5_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:3247:5: (lv_lit_5_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:3247:5: (lv_lit_5_0= ruleLiteralExpression )
                    // InternalCryptSL.g:3248:6: lv_lit_5_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_5_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_lit_5_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"lit",
                      							lv_lit_5_0,
                      							"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_6());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3271:3: ( (lv_lit_7_0= ruleLiteralExpression ) )
                    {
                    // InternalCryptSL.g:3271:3: ( (lv_lit_7_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:3272:4: (lv_lit_7_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:3272:4: (lv_lit_7_0= ruleLiteralExpression )
                    // InternalCryptSL.g:3273:5: lv_lit_7_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_7_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConsPredRule());
                      					}
                      					set(
                      						current,
                      						"lit",
                      						lv_lit_7_0,
                      						"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConsPred"


    // $ANTLR start "entryRuleLitList"
    // InternalCryptSL.g:3294:1: entryRuleLitList returns [EObject current=null] : iv_ruleLitList= ruleLitList EOF ;
    public final EObject entryRuleLitList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitList = null;


        try {
            // InternalCryptSL.g:3294:48: (iv_ruleLitList= ruleLitList EOF )
            // InternalCryptSL.g:3295:2: iv_ruleLitList= ruleLitList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLitListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLitList=ruleLitList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLitList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLitList"


    // $ANTLR start "ruleLitList"
    // InternalCryptSL.g:3301:1: ruleLitList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) ;
    public final EObject ruleLitList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3307:2: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) )
            // InternalCryptSL.g:3308:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            {
            // InternalCryptSL.g:3308:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            // InternalCryptSL.g:3309:3: ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            {
            // InternalCryptSL.g:3309:3: ( (lv_parameters_0_0= ruleLiteral ) )
            // InternalCryptSL.g:3310:4: (lv_parameters_0_0= ruleLiteral )
            {
            // InternalCryptSL.g:3310:4: (lv_parameters_0_0= ruleLiteral )
            // InternalCryptSL.g:3311:5: lv_parameters_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_parameters_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLitListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:3328:3: (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==26) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCryptSL.g:3329:4: otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLitListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:3333:4: ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_INT)) ) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==57) ) {
            	        alt58=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalCryptSL.g:3334:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            {
            	            // InternalCryptSL.g:3334:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            // InternalCryptSL.g:3335:6: (lv_parameters_2_0= ruleLiteral )
            	            {
            	            // InternalCryptSL.g:3335:6: (lv_parameters_2_0= ruleLiteral )
            	            // InternalCryptSL.g:3336:7: lv_parameters_2_0= ruleLiteral
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_29);
            	            lv_parameters_2_0=ruleLiteral();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getLitListRule());
            	              							}
            	              							add(
            	              								current,
            	              								"parameters",
            	              								lv_parameters_2_0,
            	              								"de.darmstadt.tu.crossing.CryptSL.Literal");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCryptSL.g:3354:5: otherlv_3= '...'
            	            {
            	            otherlv_3=(Token)match(input,57,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getLitListAccess().getFullStopFullStopFullStopKeyword_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLitList"


    // $ANTLR start "entryRulePred"
    // InternalCryptSL.g:3364:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // InternalCryptSL.g:3364:45: (iv_rulePred= rulePred EOF )
            // InternalCryptSL.g:3365:2: iv_rulePred= rulePred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePred=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePred"


    // $ANTLR start "rulePred"
    // InternalCryptSL.g:3371:1: rulePred returns [EObject current=null] : ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;

        Token lv_predName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parList_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3377:2: ( ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) )
            // InternalCryptSL.g:3378:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            {
            // InternalCryptSL.g:3378:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            // InternalCryptSL.g:3379:3: ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            {
            // InternalCryptSL.g:3379:3: ( (lv_predName_0_0= RULE_ID ) )
            // InternalCryptSL.g:3380:4: (lv_predName_0_0= RULE_ID )
            {
            // InternalCryptSL.g:3380:4: (lv_predName_0_0= RULE_ID )
            // InternalCryptSL.g:3381:5: lv_predName_0_0= RULE_ID
            {
            lv_predName_0_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_predName_0_0, grammarAccess.getPredAccess().getPredNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPredRule());
              					}
              					setWithLastConsumed(
              						current,
              						"predName",
              						lv_predName_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            // InternalCryptSL.g:3397:3: ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            else if ( (LA60_0==12) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalCryptSL.g:3398:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    {
                    // InternalCryptSL.g:3398:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    // InternalCryptSL.g:3399:5: otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPredAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalCryptSL.g:3403:5: ( (lv_parList_2_0= ruleSuParList ) )
                    // InternalCryptSL.g:3404:6: (lv_parList_2_0= ruleSuParList )
                    {
                    // InternalCryptSL.g:3404:6: (lv_parList_2_0= ruleSuParList )
                    // InternalCryptSL.g:3405:7: lv_parList_2_0= ruleSuParList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredAccess().getParListSuParListParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_60);
                    lv_parList_2_0=ruleSuParList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredRule());
                      							}
                      							set(
                      								current,
                      								"parList",
                      								lv_parList_2_0,
                      								"de.darmstadt.tu.crossing.CryptSL.SuParList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPredAccess().getRightSquareBracketKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3428:4: otherlv_4= '[]'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPredAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePred"


    // $ANTLR start "entryRuleReqPred"
    // InternalCryptSL.g:3437:1: entryRuleReqPred returns [EObject current=null] : iv_ruleReqPred= ruleReqPred EOF ;
    public final EObject entryRuleReqPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqPred = null;


        try {
            // InternalCryptSL.g:3437:48: (iv_ruleReqPred= ruleReqPred EOF )
            // InternalCryptSL.g:3438:2: iv_ruleReqPred= ruleReqPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReqPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReqPred=ruleReqPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReqPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReqPred"


    // $ANTLR start "ruleReqPred"
    // InternalCryptSL.g:3444:1: ruleReqPred returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) ;
    public final EObject ruleReqPred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        EObject lv_cons_0_0 = null;

        EObject lv_pred_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3450:2: ( ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) )
            // InternalCryptSL.g:3451:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            {
            // InternalCryptSL.g:3451:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            // InternalCryptSL.g:3452:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) )
            {
            // InternalCryptSL.g:3452:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )?
            int alt61=2;
            switch ( input.LA(1) ) {
                case 49:
                    {
                    int LA61_1 = input.LA(2);

                    if ( ((LA61_1>=RULE_STRING && LA61_1<=RULE_INT)||LA61_1==25||(LA61_1>=44 && LA61_1<=47)||(LA61_1>=55 && LA61_1<=56)) ) {
                        alt61=1;
                    }
                    else if ( (LA61_1==RULE_ID) ) {
                        int LA61_4 = input.LA(3);

                        if ( ((LA61_4>=13 && LA61_4<=14)||LA61_4==24||LA61_4==28||LA61_4==35||(LA61_4>=38 && LA61_4<=42)||(LA61_4>=50 && LA61_4<=52)) ) {
                            alt61=1;
                        }
                    }
                    }
                    break;
                case RULE_STRING:
                case RULE_INT:
                case 25:
                case 44:
                case 45:
                case 46:
                case 47:
                case 55:
                case 56:
                    {
                    alt61=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA61_3 = input.LA(2);

                    if ( ((LA61_3>=13 && LA61_3<=14)||LA61_3==24||LA61_3==28||LA61_3==35||(LA61_3>=37 && LA61_3<=43)||(LA61_3>=50 && LA61_3<=52)) ) {
                        alt61=1;
                    }
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // InternalCryptSL.g:3453:4: ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>'
                    {
                    // InternalCryptSL.g:3453:4: ( (lv_cons_0_0= ruleConstraint ) )
                    // InternalCryptSL.g:3454:5: (lv_cons_0_0= ruleConstraint )
                    {
                    // InternalCryptSL.g:3454:5: (lv_cons_0_0= ruleConstraint )
                    // InternalCryptSL.g:3455:6: lv_cons_0_0= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReqPredAccess().getConsConstraintParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_cons_0_0=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReqPredRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_0_0,
                      							"de.darmstadt.tu.crossing.CryptSL.Constraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReqPredAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCryptSL.g:3477:3: ( (lv_not_2_0= '!' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCryptSL.g:3478:4: (lv_not_2_0= '!' )
                    {
                    // InternalCryptSL.g:3478:4: (lv_not_2_0= '!' )
                    // InternalCryptSL.g:3479:5: lv_not_2_0= '!'
                    {
                    lv_not_2_0=(Token)match(input,49,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_2_0, grammarAccess.getReqPredAccess().getNotExclamationMarkKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReqPredRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_2_0, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCryptSL.g:3491:3: ( (lv_pred_3_0= rulePred ) )
            // InternalCryptSL.g:3492:4: (lv_pred_3_0= rulePred )
            {
            // InternalCryptSL.g:3492:4: (lv_pred_3_0= rulePred )
            // InternalCryptSL.g:3493:5: lv_pred_3_0= rulePred
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReqPredAccess().getPredPredParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pred_3_0=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReqPredRule());
              					}
              					set(
              						current,
              						"pred",
              						lv_pred_3_0,
              						"de.darmstadt.tu.crossing.CryptSL.Pred");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReqPred"


    // $ANTLR start "entryRuleEnsPred"
    // InternalCryptSL.g:3514:1: entryRuleEnsPred returns [EObject current=null] : iv_ruleEnsPred= ruleEnsPred EOF ;
    public final EObject entryRuleEnsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsPred = null;


        try {
            // InternalCryptSL.g:3514:48: (iv_ruleEnsPred= ruleEnsPred EOF )
            // InternalCryptSL.g:3515:2: iv_ruleEnsPred= ruleEnsPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnsPred=ruleEnsPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnsPred"


    // $ANTLR start "ruleEnsPred"
    // InternalCryptSL.g:3521:1: ruleEnsPred returns [EObject current=null] : (this_Pred_0= rulePred (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleEnsPred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Pred_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3527:2: ( (this_Pred_0= rulePred (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalCryptSL.g:3528:2: (this_Pred_0= rulePred (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalCryptSL.g:3528:2: (this_Pred_0= rulePred (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCryptSL.g:3529:3: this_Pred_0= rulePred (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnsPredAccess().getPredParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_Pred_0=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Pred_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:3537:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCryptSL.g:3538:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnsPredAccess().getAfterKeyword_1_0());
                      			
                    }
                    // InternalCryptSL.g:3542:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:3543:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:3543:5: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:3544:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnsPredRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getEnsPredAccess().getLabelCondSuperTypeCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnsPred"


    // $ANTLR start "entryRuleSuParList"
    // InternalCryptSL.g:3560:1: entryRuleSuParList returns [EObject current=null] : iv_ruleSuParList= ruleSuParList EOF ;
    public final EObject entryRuleSuParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuParList = null;


        try {
            // InternalCryptSL.g:3560:50: (iv_ruleSuParList= ruleSuParList EOF )
            // InternalCryptSL.g:3561:2: iv_ruleSuParList= ruleSuParList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuParListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuParList=ruleSuParList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuParList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSuParList"


    // $ANTLR start "ruleSuParList"
    // InternalCryptSL.g:3567:1: ruleSuParList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) ;
    public final EObject ruleSuParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3573:2: ( ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) )
            // InternalCryptSL.g:3574:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            {
            // InternalCryptSL.g:3574:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            // InternalCryptSL.g:3575:3: ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            {
            // InternalCryptSL.g:3575:3: ( (lv_parameters_0_0= ruleSuPar ) )
            // InternalCryptSL.g:3576:4: (lv_parameters_0_0= ruleSuPar )
            {
            // InternalCryptSL.g:3576:4: (lv_parameters_0_0= ruleSuPar )
            // InternalCryptSL.g:3577:5: lv_parameters_0_0= ruleSuPar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_parameters_0_0=ruleSuPar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSuParListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.SuPar");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:3594:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==26) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalCryptSL.g:3595:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSuParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:3599:4: ( (lv_parameters_2_0= ruleSuPar ) )
            	    // InternalCryptSL.g:3600:5: (lv_parameters_2_0= ruleSuPar )
            	    {
            	    // InternalCryptSL.g:3600:5: (lv_parameters_2_0= ruleSuPar )
            	    // InternalCryptSL.g:3601:6: lv_parameters_2_0= ruleSuPar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_parameters_2_0=ruleSuPar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSuParListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.SuPar");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSuParList"


    // $ANTLR start "entryRuleSuPar"
    // InternalCryptSL.g:3623:1: entryRuleSuPar returns [EObject current=null] : iv_ruleSuPar= ruleSuPar EOF ;
    public final EObject entryRuleSuPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuPar = null;


        try {
            // InternalCryptSL.g:3623:46: (iv_ruleSuPar= ruleSuPar EOF )
            // InternalCryptSL.g:3624:2: iv_ruleSuPar= ruleSuPar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuParRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuPar=ruleSuPar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuPar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSuPar"


    // $ANTLR start "ruleSuPar"
    // InternalCryptSL.g:3630:1: ruleSuPar returns [EObject current=null] : ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) ;
    public final EObject ruleSuPar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3636:2: ( ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) )
            // InternalCryptSL.g:3637:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            {
            // InternalCryptSL.g:3637:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            // InternalCryptSL.g:3638:3: () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            {
            // InternalCryptSL.g:3638:3: ()
            // InternalCryptSL.g:3639:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSuParAccess().getSuParAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:3645:3: ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 44:
            case 45:
            case 46:
            case 47:
            case 56:
                {
                alt65=1;
                }
                break;
            case 32:
                {
                alt65=2;
                }
                break;
            case 61:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalCryptSL.g:3646:4: ( (lv_val_1_0= ruleConsPred ) )
                    {
                    // InternalCryptSL.g:3646:4: ( (lv_val_1_0= ruleConsPred ) )
                    // InternalCryptSL.g:3647:5: (lv_val_1_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:3647:5: (lv_val_1_0= ruleConsPred )
                    // InternalCryptSL.g:3648:6: lv_val_1_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSuParAccess().getValConsPredParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSuParRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3666:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSuParAccess().get_Keyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:3671:4: otherlv_3= 'this'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSuParAccess().getThisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSuPar"


    // $ANTLR start "entryRuleObject"
    // InternalCryptSL.g:3680:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalCryptSL.g:3680:47: (iv_ruleObject= ruleObject EOF )
            // InternalCryptSL.g:3681:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalCryptSL.g:3687:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3693:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCryptSL.g:3694:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCryptSL.g:3694:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCryptSL.g:3695:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCryptSL.g:3695:3: ()
            // InternalCryptSL.g:3696:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:3702:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCryptSL.g:3703:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCryptSL.g:3703:4: (lv_name_1_0= RULE_ID )
            // InternalCryptSL.g:3704:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalCryptSL.g:3724:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalCryptSL.g:3724:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalCryptSL.g:3725:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalCryptSL.g:3731:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3737:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalCryptSL.g:3738:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalCryptSL.g:3738:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=24 && LA67_0<=25)) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalCryptSL.g:3739:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalCryptSL.g:3739:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalCryptSL.g:3740:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_63);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:3748:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==58) && (synpred1_InternalCryptSL())) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalCryptSL.g:3749:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalCryptSL.g:3755:5: ( () ruleArrayBrackets )
                    	    // InternalCryptSL.g:3756:6: () ruleArrayBrackets
                    	    {
                    	    // InternalCryptSL.g:3756:6: ()
                    	    // InternalCryptSL.g:3757:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_63);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3774:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalCryptSL.g:3786:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalCryptSL.g:3786:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalCryptSL.g:3787:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalCryptSL.g:3793:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3799:2: ( (kw= '[' kw= ']' ) )
            // InternalCryptSL.g:3800:2: (kw= '[' kw= ']' )
            {
            // InternalCryptSL.g:3800:2: (kw= '[' kw= ']' )
            // InternalCryptSL.g:3801:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,58,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalCryptSL.g:3815:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalCryptSL.g:3815:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalCryptSL.g:3816:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalCryptSL.g:3822:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3828:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:3829:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:3829:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:3830:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalCryptSL.g:3830:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==25) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCryptSL.g:3831:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalCryptSL.g:3835:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_ID||(LA69_0>=24 && LA69_0<=25)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalCryptSL.g:3836:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalCryptSL.g:3836:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalCryptSL.g:3837:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalCryptSL.g:3837:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalCryptSL.g:3838:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCryptSL.g:3855:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==26) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // InternalCryptSL.g:3856:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,26,FOLLOW_65); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalCryptSL.g:3860:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalCryptSL.g:3861:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalCryptSL.g:3861:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalCryptSL.g:3862:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop68;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalCryptSL.g:3890:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:3891:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:3891:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalCryptSL.g:3892:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalCryptSL.g:3913:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalCryptSL.g:3913:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalCryptSL.g:3914:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalCryptSL.g:3920:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3926:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalCryptSL.g:3927:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalCryptSL.g:3927:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalCryptSL.g:3928:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalCryptSL.g:3928:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:3929:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:3929:4: ( ruleQualifiedName )
            // InternalCryptSL.g:3930:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_66);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:3944:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==13) && (synpred2_InternalCryptSL())) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCryptSL.g:3945:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalCryptSL.g:3945:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalCryptSL.g:3946:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalCryptSL.g:3952:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalCryptSL.g:3953:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalCryptSL.g:3953:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalCryptSL.g:3954:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:3971:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==26) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalCryptSL.g:3972:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalCryptSL.g:3976:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalCryptSL.g:3977:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalCryptSL.g:3977:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalCryptSL.g:3978:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_68);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalCryptSL.g:4000:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==28) && (synpred3_InternalCryptSL())) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalCryptSL.g:4001:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalCryptSL.g:4001:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalCryptSL.g:4002:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalCryptSL.g:4008:6: ( () otherlv_7= '.' )
                    	    // InternalCryptSL.g:4009:7: () otherlv_7= '.'
                    	    {
                    	    // InternalCryptSL.g:4009:7: ()
                    	    // InternalCryptSL.g:4010:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:4022:5: ( ( ruleValidID ) )
                    	    // InternalCryptSL.g:4023:6: ( ruleValidID )
                    	    {
                    	    // InternalCryptSL.g:4023:6: ( ruleValidID )
                    	    // InternalCryptSL.g:4024:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:4038:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt73=2;
                    	    int LA73_0 = input.LA(1);

                    	    if ( (LA73_0==13) && (synpred4_InternalCryptSL())) {
                    	        alt73=1;
                    	    }
                    	    switch (alt73) {
                    	        case 1 :
                    	            // InternalCryptSL.g:4039:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalCryptSL.g:4039:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalCryptSL.g:4040:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,13,FOLLOW_67); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalCryptSL.g:4046:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalCryptSL.g:4047:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalCryptSL.g:4047:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalCryptSL.g:4048:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_68);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalCryptSL.g:4065:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop72:
                    	            do {
                    	                int alt72=2;
                    	                int LA72_0 = input.LA(1);

                    	                if ( (LA72_0==26) ) {
                    	                    alt72=1;
                    	                }


                    	                switch (alt72) {
                    	            	case 1 :
                    	            	    // InternalCryptSL.g:4066:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,26,FOLLOW_67); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalCryptSL.g:4070:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalCryptSL.g:4071:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalCryptSL.g:4071:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalCryptSL.g:4072:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_68);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop72;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,14,FOLLOW_48); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalCryptSL.g:4101:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalCryptSL.g:4101:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalCryptSL.g:4102:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalCryptSL.g:4108:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4114:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalCryptSL.g:4115:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalCryptSL.g:4115:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||(LA76_0>=24 && LA76_0<=25)) ) {
                alt76=1;
            }
            else if ( (LA76_0==36) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalCryptSL.g:4116:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4125:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalCryptSL.g:4137:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalCryptSL.g:4137:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalCryptSL.g:4138:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalCryptSL.g:4144:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4150:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalCryptSL.g:4151:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalCryptSL.g:4151:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalCryptSL.g:4152:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalCryptSL.g:4152:3: ()
            // InternalCryptSL.g:4153:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalCryptSL.g:4163:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==62) ) {
                alt79=1;
            }
            else if ( (LA79_0==64) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // InternalCryptSL.g:4164:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalCryptSL.g:4164:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalCryptSL.g:4165:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalCryptSL.g:4165:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalCryptSL.g:4166:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalCryptSL.g:4166:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalCryptSL.g:4167:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_71);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:4184:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==63) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalCryptSL.g:4185:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalCryptSL.g:4185:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalCryptSL.g:4186:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_71);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4205:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalCryptSL.g:4205:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalCryptSL.g:4206:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalCryptSL.g:4206:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalCryptSL.g:4207:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalCryptSL.g:4207:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalCryptSL.g:4208:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_71);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:4225:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==63) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalCryptSL.g:4226:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalCryptSL.g:4226:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalCryptSL.g:4227:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_71);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalCryptSL.g:4250:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalCryptSL.g:4250:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalCryptSL.g:4251:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalCryptSL.g:4257:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4263:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:4264:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:4264:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:4265:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalCryptSL.g:4269:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:4270:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:4270:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:4271:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalCryptSL.g:4292:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalCryptSL.g:4292:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalCryptSL.g:4293:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalCryptSL.g:4299:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4305:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:4306:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:4306:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:4307:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCryptSL.g:4311:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:4312:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:4312:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:4313:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalCryptSL.g:4334:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalCryptSL.g:4334:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalCryptSL.g:4335:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalCryptSL.g:4341:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4347:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:4348:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:4348:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:4349:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalCryptSL.g:4353:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:4354:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:4354:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:4355:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalCryptSL.g:4376:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalCryptSL.g:4376:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalCryptSL.g:4377:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalCryptSL.g:4383:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4389:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:4390:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:4390:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:4391:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCryptSL.g:4395:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:4396:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:4396:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:4397:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCryptSL.g:4418:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCryptSL.g:4418:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCryptSL.g:4419:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCryptSL.g:4425:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4431:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalCryptSL.g:4432:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalCryptSL.g:4432:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalCryptSL.g:4433:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:4443:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==28) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // InternalCryptSL.g:4444:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_48);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalCryptSL.g:4464:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCryptSL.g:4464:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCryptSL.g:4465:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalCryptSL.g:4471:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4477:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalCryptSL.g:4478:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalCryptSL.g:4478:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalCryptSL.g:4479:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,28,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalCryptSL.g:4503:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalCryptSL.g:4503:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalCryptSL.g:4504:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCryptSL.g:4510:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:4516:2: (this_ID_0= RULE_ID )
            // InternalCryptSL.g:4517:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalCryptSL.g:4527:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalCryptSL.g:4527:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalCryptSL.g:4528:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalCryptSL.g:4534:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4540:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalCryptSL.g:4541:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalCryptSL.g:4541:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalCryptSL.g:4542:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalCryptSL.g:4546:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt83=3;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalCryptSL.g:4547:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalCryptSL.g:4547:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalCryptSL.g:4548:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalCryptSL.g:4548:5: ( (lv_static_1_0= 'static' ) )
                    // InternalCryptSL.g:4549:6: (lv_static_1_0= 'static' )
                    {
                    // InternalCryptSL.g:4549:6: (lv_static_1_0= 'static' )
                    // InternalCryptSL.g:4550:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,66,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", true, "static");
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:4562:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==67) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalCryptSL.g:4563:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalCryptSL.g:4563:6: (lv_extension_2_0= 'extension' )
                            // InternalCryptSL.g:4564:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,67,FOLLOW_75); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", true, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalCryptSL.g:4576:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalCryptSL.g:4577:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalCryptSL.g:4577:6: ( ruleQualifiedNameInStaticImport )
                    // InternalCryptSL.g:4578:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_76);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:4592:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==37) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==RULE_ID) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalCryptSL.g:4593:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalCryptSL.g:4593:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalCryptSL.g:4594:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalCryptSL.g:4594:7: (lv_wildcard_4_0= '*' )
                            // InternalCryptSL.g:4595:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,37,FOLLOW_77); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", true, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCryptSL.g:4608:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalCryptSL.g:4608:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalCryptSL.g:4609:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalCryptSL.g:4609:7: (lv_memberName_5_0= ruleValidID )
                            // InternalCryptSL.g:4610:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_77);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4630:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalCryptSL.g:4630:4: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:4631:5: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:4631:5: ( ruleQualifiedName )
                    // InternalCryptSL.g:4632:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:4647:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalCryptSL.g:4647:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalCryptSL.g:4648:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalCryptSL.g:4648:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalCryptSL.g:4649:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:4667:3: (otherlv_8= ';' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==23) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalCryptSL.g:4668:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalCryptSL.g:4677:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalCryptSL.g:4677:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalCryptSL.g:4678:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalCryptSL.g:4684:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4690:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalCryptSL.g:4691:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalCryptSL.g:4691:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_ID) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==28) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // InternalCryptSL.g:4692:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_72);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_InternalCryptSL
    public final void synpred1_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:3749:5: ( ( () ruleArrayBrackets ) )
        // InternalCryptSL.g:3749:6: ( () ruleArrayBrackets )
        {
        // InternalCryptSL.g:3749:6: ( () ruleArrayBrackets )
        // InternalCryptSL.g:3750:6: () ruleArrayBrackets
        {
        // InternalCryptSL.g:3750:6: ()
        // InternalCryptSL.g:3751:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCryptSL

    // $ANTLR start synpred2_InternalCryptSL
    public final void synpred2_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:3946:5: ( '<' )
        // InternalCryptSL.g:3946:6: '<'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCryptSL

    // $ANTLR start synpred3_InternalCryptSL
    public final void synpred3_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:4002:6: ( ( () '.' ) )
        // InternalCryptSL.g:4002:7: ( () '.' )
        {
        // InternalCryptSL.g:4002:7: ( () '.' )
        // InternalCryptSL.g:4003:7: () '.'
        {
        // InternalCryptSL.g:4003:7: ()
        // InternalCryptSL.g:4004:7: 
        {
        }

        match(input,28,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCryptSL

    // $ANTLR start synpred4_InternalCryptSL
    public final void synpred4_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:4040:7: ( '<' )
        // InternalCryptSL.g:4040:8: '<'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCryptSL

    // Delegated rules

    public final boolean synpred3_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA55 dfa55 = new DFA55(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\2\uffff\3\11\13\uffff\2\11\5\uffff\3\11\2\uffff\1\11\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\3\15\4\31\1\uffff\1\6\5\4\2\15\1\32\3\33\1\4\3\15\1\33\1\4\1\15\1\33";
    static final String dfa_4s = "\1\70\1\uffff\3\64\1\54\1\55\1\56\1\57\1\uffff\1\6\5\4\2\64\1\32\3\33\1\4\3\64\1\34\1\4\1\64\1\34";
    static final String dfa_5s = "\1\uffff\1\1\7\uffff\1\2\24\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\2\1\3\45\uffff\1\5\1\6\1\7\1\10\7\uffff\2\1",
            "",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\4\uffff\1\12\1\uffff\2\11\1\1",
            "\2\11\10\uffff\2\11\2\uffff\1\11\1\13\6\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\1\14\22\uffff\1\5",
            "\1\15\23\uffff\1\6",
            "\1\16\24\uffff\1\7",
            "\1\17\25\uffff\1\10",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\1\34\1\33",
            "\1\35",
            "\2\11\10\uffff\2\11\2\uffff\1\11\7\uffff\1\11\1\uffff\7\11\6\uffff\2\11\1\1",
            "\1\34\1\33"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3015:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_10s = "\1\4\1\uffff\1\27\1\4\2\uffff\1\27";
    static final String dfa_11s = "\1\102\1\uffff\1\34\1\45\2\uffff\1\34";
    static final String dfa_12s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_13s = "\7\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\75\uffff\1\1",
            "",
            "\1\4\4\uffff\1\3",
            "\1\6\40\uffff\1\5",
            "",
            "",
            "\1\4\4\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4546:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000B000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0182F00002000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0182F00002000072L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010001002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000030000006002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000082000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0180F00000000070L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000060L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000001000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2180F00100000070L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000000000B000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000001003000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000800002L});

}