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
import de.darmstadt.tu.crossing.services.CrySLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCrySLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SPEC'", "'[]'", "'<'", "'>'", "'OBJECTS'", "'FORBIDDEN'", "'EVENTS'", "'ORDER'", "'CONSTRAINTS'", "'REQUIRES'", "'ENSURES'", "'NEGATES'", "';'", "'*'", "','", "'?'", "'T'", "'E'", "'=>'", "'('", "')'", "'.'", "':'", "'='", "');'", "'_'", "':='", "'|'", "'+'", "'||'", "'&&'", "'<='", "'>='", "'-'", "'%'", "'/'", "'neverTypeOf'", "'['", "']'", "'noCallTo'", "'callTo'", "'notHardCoded'", "'length'", "'instanceOf'", "'^'", "'true'", "'false'", "'!'", "'=='", "'!='", "'in'", "'{'", "'}'", "'elements('", "'alg('", "'mode('", "'pad('", "'part('", "'...'", "'after'", "'this'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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


        public InternalCrySLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCrySLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCrySLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCrySL.g"; }



     	private CrySLGrammarAccess grammarAccess;

        public InternalCrySLParser(TokenStream input, CrySLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected CrySLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalCrySL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalCrySL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalCrySL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
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
    // InternalCrySL.g:71:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? ) ;
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
            // InternalCrySL.g:77:2: ( (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? ) )
            // InternalCrySL.g:78:2: (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? )
            {
            // InternalCrySL.g:78:2: (otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )? )
            // InternalCrySL.g:79:3: otherlv_0= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )? otherlv_6= 'OBJECTS' ( (lv_usage_7_0= ruleUseBlock ) ) (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )? otherlv_10= 'EVENTS' ( (lv_req_events_11_0= ruleRequiredBlock ) ) otherlv_12= 'ORDER' ( (lv_order_13_0= ruleOrder ) ) (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )? (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )? (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )? (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getSPECKeyword_0());
              		
            }
            // InternalCrySL.g:83:3: ( ( ruleQualifiedName ) )
            // InternalCrySL.g:84:4: ( ruleQualifiedName )
            {
            // InternalCrySL.g:84:4: ( ruleQualifiedName )
            // InternalCrySL.g:85:5: ruleQualifiedName
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

            // InternalCrySL.g:99:3: ( ( (lv_array_2_0= '[]' ) ) | (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' ) )?
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
                    // InternalCrySL.g:100:4: ( (lv_array_2_0= '[]' ) )
                    {
                    // InternalCrySL.g:100:4: ( (lv_array_2_0= '[]' ) )
                    // InternalCrySL.g:101:5: (lv_array_2_0= '[]' )
                    {
                    // InternalCrySL.g:101:5: (lv_array_2_0= '[]' )
                    // InternalCrySL.g:102:6: lv_array_2_0= '[]'
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
                    // InternalCrySL.g:115:4: (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' )
                    {
                    // InternalCrySL.g:115:4: (otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>' )
                    // InternalCrySL.g:116:5: otherlv_3= '<' ( ( ruleQualifiedName ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDomainmodelAccess().getLessThanSignKeyword_2_1_0());
                      				
                    }
                    // InternalCrySL.g:120:5: ( ( ruleQualifiedName ) )
                    // InternalCrySL.g:121:6: ( ruleQualifiedName )
                    {
                    // InternalCrySL.g:121:6: ( ruleQualifiedName )
                    // InternalCrySL.g:122:7: ruleQualifiedName
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

            otherlv_6=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDomainmodelAccess().getOBJECTSKeyword_3());
              		
            }
            // InternalCrySL.g:146:3: ( (lv_usage_7_0= ruleUseBlock ) )
            // InternalCrySL.g:147:4: (lv_usage_7_0= ruleUseBlock )
            {
            // InternalCrySL.g:147:4: (lv_usage_7_0= ruleUseBlock )
            // InternalCrySL.g:148:5: lv_usage_7_0= ruleUseBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getUsageUseBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
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
              						"de.darmstadt.tu.crossing.CrySL.UseBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:165:3: (otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCrySL.g:166:4: otherlv_8= 'FORBIDDEN' ( (lv_forbEvent_9_0= ruleForbiddenBlock ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDomainmodelAccess().getFORBIDDENKeyword_5_0());
                      			
                    }
                    // InternalCrySL.g:170:4: ( (lv_forbEvent_9_0= ruleForbiddenBlock ) )
                    // InternalCrySL.g:171:5: (lv_forbEvent_9_0= ruleForbiddenBlock )
                    {
                    // InternalCrySL.g:171:5: (lv_forbEvent_9_0= ruleForbiddenBlock )
                    // InternalCrySL.g:172:6: lv_forbEvent_9_0= ruleForbiddenBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getForbEventForbiddenBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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
                      							"de.darmstadt.tu.crossing.CrySL.ForbiddenBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDomainmodelAccess().getEVENTSKeyword_6());
              		
            }
            // InternalCrySL.g:194:3: ( (lv_req_events_11_0= ruleRequiredBlock ) )
            // InternalCrySL.g:195:4: (lv_req_events_11_0= ruleRequiredBlock )
            {
            // InternalCrySL.g:195:4: (lv_req_events_11_0= ruleRequiredBlock )
            // InternalCrySL.g:196:5: lv_req_events_11_0= ruleRequiredBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getReq_eventsRequiredBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"de.darmstadt.tu.crossing.CrySL.RequiredBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getDomainmodelAccess().getORDERKeyword_8());
              		
            }
            // InternalCrySL.g:217:3: ( (lv_order_13_0= ruleOrder ) )
            // InternalCrySL.g:218:4: (lv_order_13_0= ruleOrder )
            {
            // InternalCrySL.g:218:4: (lv_order_13_0= ruleOrder )
            // InternalCrySL.g:219:5: lv_order_13_0= ruleOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainmodelAccess().getOrderOrderParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_12);
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
              						"de.darmstadt.tu.crossing.CrySL.Order");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:236:3: (otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCrySL.g:237:4: otherlv_14= 'CONSTRAINTS' ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDomainmodelAccess().getCONSTRAINTSKeyword_10_0());
                      			
                    }
                    // InternalCrySL.g:241:4: ( (lv_reqConstraints_15_0= ruleEnforceConsBlock ) )
                    // InternalCrySL.g:242:5: (lv_reqConstraints_15_0= ruleEnforceConsBlock )
                    {
                    // InternalCrySL.g:242:5: (lv_reqConstraints_15_0= ruleEnforceConsBlock )
                    // InternalCrySL.g:243:6: lv_reqConstraints_15_0= ruleEnforceConsBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getReqConstraintsEnforceConsBlockParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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
                      							"de.darmstadt.tu.crossing.CrySL.EnforceConsBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCrySL.g:261:3: (otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCrySL.g:262:4: otherlv_16= 'REQUIRES' ( (lv_require_17_0= ruleRequiresBlock ) )
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDomainmodelAccess().getREQUIRESKeyword_11_0());
                      			
                    }
                    // InternalCrySL.g:266:4: ( (lv_require_17_0= ruleRequiresBlock ) )
                    // InternalCrySL.g:267:5: (lv_require_17_0= ruleRequiresBlock )
                    {
                    // InternalCrySL.g:267:5: (lv_require_17_0= ruleRequiresBlock )
                    // InternalCrySL.g:268:6: lv_require_17_0= ruleRequiresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getRequireRequiresBlockParserRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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
                      							"de.darmstadt.tu.crossing.CrySL.RequiresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCrySL.g:286:3: (otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCrySL.g:287:4: otherlv_18= 'ENSURES' ( (lv_ensure_19_0= ruleEnsuresBlock ) )
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getDomainmodelAccess().getENSURESKeyword_12_0());
                      			
                    }
                    // InternalCrySL.g:291:4: ( (lv_ensure_19_0= ruleEnsuresBlock ) )
                    // InternalCrySL.g:292:5: (lv_ensure_19_0= ruleEnsuresBlock )
                    {
                    // InternalCrySL.g:292:5: (lv_ensure_19_0= ruleEnsuresBlock )
                    // InternalCrySL.g:293:6: lv_ensure_19_0= ruleEnsuresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainmodelAccess().getEnsureEnsuresBlockParserRuleCall_12_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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
                      							"de.darmstadt.tu.crossing.CrySL.EnsuresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCrySL.g:311:3: (otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCrySL.g:312:4: otherlv_20= 'NEGATES' ( (lv_destroy_21_0= ruleDestroysBlock ) )
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getDomainmodelAccess().getNEGATESKeyword_13_0());
                      			
                    }
                    // InternalCrySL.g:316:4: ( (lv_destroy_21_0= ruleDestroysBlock ) )
                    // InternalCrySL.g:317:5: (lv_destroy_21_0= ruleDestroysBlock )
                    {
                    // InternalCrySL.g:317:5: (lv_destroy_21_0= ruleDestroysBlock )
                    // InternalCrySL.g:318:6: lv_destroy_21_0= ruleDestroysBlock
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
                      							"de.darmstadt.tu.crossing.CrySL.DestroysBlock");
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
    // InternalCrySL.g:340:1: entryRuleUseBlock returns [EObject current=null] : iv_ruleUseBlock= ruleUseBlock EOF ;
    public final EObject entryRuleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseBlock = null;


        try {
            // InternalCrySL.g:340:49: (iv_ruleUseBlock= ruleUseBlock EOF )
            // InternalCrySL.g:341:2: iv_ruleUseBlock= ruleUseBlock EOF
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
    // InternalCrySL.g:347:1: ruleUseBlock returns [EObject current=null] : ( (lv_objects_0_0= ruleObjectDecl ) )+ ;
    public final EObject ruleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:353:2: ( ( (lv_objects_0_0= ruleObjectDecl ) )+ )
            // InternalCrySL.g:354:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            {
            // InternalCrySL.g:354:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCrySL.g:355:3: (lv_objects_0_0= ruleObjectDecl )
            	    {
            	    // InternalCrySL.g:355:3: (lv_objects_0_0= ruleObjectDecl )
            	    // InternalCrySL.g:356:4: lv_objects_0_0= ruleObjectDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getUseBlockAccess().getObjectsObjectDeclParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      					"de.darmstadt.tu.crossing.CrySL.ObjectDecl");
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
    // InternalCrySL.g:376:1: entryRuleForbiddenBlock returns [EObject current=null] : iv_ruleForbiddenBlock= ruleForbiddenBlock EOF ;
    public final EObject entryRuleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenBlock = null;


        try {
            // InternalCrySL.g:376:55: (iv_ruleForbiddenBlock= ruleForbiddenBlock EOF )
            // InternalCrySL.g:377:2: iv_ruleForbiddenBlock= ruleForbiddenBlock EOF
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
    // InternalCrySL.g:383:1: ruleForbiddenBlock returns [EObject current=null] : ( (lv_forb_methods_0_0= ruleForbMethod ) )+ ;
    public final EObject ruleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_forb_methods_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:389:2: ( ( (lv_forb_methods_0_0= ruleForbMethod ) )+ )
            // InternalCrySL.g:390:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
            {
            // InternalCrySL.g:390:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
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
            	    // InternalCrySL.g:391:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    {
            	    // InternalCrySL.g:391:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    // InternalCrySL.g:392:4: lv_forb_methods_0_0= ruleForbMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getForbiddenBlockAccess().getForb_methodsForbMethodParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
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
            	      					"de.darmstadt.tu.crossing.CrySL.ForbMethod");
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
    // InternalCrySL.g:412:1: entryRuleRequiredBlock returns [EObject current=null] : iv_ruleRequiredBlock= ruleRequiredBlock EOF ;
    public final EObject entryRuleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBlock = null;


        try {
            // InternalCrySL.g:412:54: (iv_ruleRequiredBlock= ruleRequiredBlock EOF )
            // InternalCrySL.g:413:2: iv_ruleRequiredBlock= ruleRequiredBlock EOF
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
    // InternalCrySL.g:419:1: ruleRequiredBlock returns [EObject current=null] : ( (lv_req_event_0_0= ruleEvent ) )+ ;
    public final EObject ruleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_req_event_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:425:2: ( ( (lv_req_event_0_0= ruleEvent ) )+ )
            // InternalCrySL.g:426:2: ( (lv_req_event_0_0= ruleEvent ) )+
            {
            // InternalCrySL.g:426:2: ( (lv_req_event_0_0= ruleEvent ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCrySL.g:427:3: (lv_req_event_0_0= ruleEvent )
            	    {
            	    // InternalCrySL.g:427:3: (lv_req_event_0_0= ruleEvent )
            	    // InternalCrySL.g:428:4: lv_req_event_0_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRequiredBlockAccess().getReq_eventEventParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      					"de.darmstadt.tu.crossing.CrySL.Event");
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
    // InternalCrySL.g:448:1: entryRuleEnforceConsBlock returns [EObject current=null] : iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF ;
    public final EObject entryRuleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforceConsBlock = null;


        try {
            // InternalCrySL.g:448:57: (iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF )
            // InternalCrySL.g:449:2: iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF
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
    // InternalCrySL.g:455:1: ruleEnforceConsBlock returns [EObject current=null] : ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_req_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:461:2: ( ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ )
            // InternalCrySL.g:462:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            {
            // InternalCrySL.g:462:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==30||LA10_0==47||(LA10_0>=50 && LA10_0<=54)||(LA10_0>=56 && LA10_0<=58)||(LA10_0>=64 && LA10_0<=68)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCrySL.g:463:3: ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';'
            	    {
            	    // InternalCrySL.g:463:3: ( (lv_req_0_0= ruleConstraint ) )
            	    // InternalCrySL.g:464:4: (lv_req_0_0= ruleConstraint )
            	    {
            	    // InternalCrySL.g:464:4: (lv_req_0_0= ruleConstraint )
            	    // InternalCrySL.g:465:5: lv_req_0_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnforceConsBlockAccess().getReqConstraintParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	      						"de.darmstadt.tu.crossing.CrySL.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
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
    // InternalCrySL.g:490:1: entryRuleRequiresBlock returns [EObject current=null] : iv_ruleRequiresBlock= ruleRequiresBlock EOF ;
    public final EObject entryRuleRequiresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiresBlock = null;


        try {
            // InternalCrySL.g:490:54: (iv_ruleRequiresBlock= ruleRequiresBlock EOF )
            // InternalCrySL.g:491:2: iv_ruleRequiresBlock= ruleRequiresBlock EOF
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
    // InternalCrySL.g:497:1: ruleRequiresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleRequiresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:503:2: ( ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ )
            // InternalCrySL.g:504:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            {
            // InternalCrySL.g:504:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==30||LA11_0==47||(LA11_0>=50 && LA11_0<=54)||(LA11_0>=56 && LA11_0<=58)||(LA11_0>=64 && LA11_0<=68)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCrySL.g:505:3: ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCrySL.g:505:3: ( (lv_pred_0_0= ruleReqPred ) )
            	    // InternalCrySL.g:506:4: (lv_pred_0_0= ruleReqPred )
            	    {
            	    // InternalCrySL.g:506:4: (lv_pred_0_0= ruleReqPred )
            	    // InternalCrySL.g:507:5: lv_pred_0_0= ruleReqPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRequiresBlockAccess().getPredReqPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	      						"de.darmstadt.tu.crossing.CrySL.ReqPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
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
    // InternalCrySL.g:532:1: entryRuleEnsuresBlock returns [EObject current=null] : iv_ruleEnsuresBlock= ruleEnsuresBlock EOF ;
    public final EObject entryRuleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsuresBlock = null;


        try {
            // InternalCrySL.g:532:53: (iv_ruleEnsuresBlock= ruleEnsuresBlock EOF )
            // InternalCrySL.g:533:2: iv_ruleEnsuresBlock= ruleEnsuresBlock EOF
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
    // InternalCrySL.g:539:1: ruleEnsuresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:545:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCrySL.g:546:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCrySL.g:546:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||LA12_0==30||LA12_0==47||(LA12_0>=50 && LA12_0<=54)||(LA12_0>=56 && LA12_0<=58)||(LA12_0>=64 && LA12_0<=68)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCrySL.g:547:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCrySL.g:547:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCrySL.g:548:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCrySL.g:548:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCrySL.g:549:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnsuresBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	      						"de.darmstadt.tu.crossing.CrySL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
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
    // InternalCrySL.g:574:1: entryRuleDestroysBlock returns [EObject current=null] : iv_ruleDestroysBlock= ruleDestroysBlock EOF ;
    public final EObject entryRuleDestroysBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroysBlock = null;


        try {
            // InternalCrySL.g:574:54: (iv_ruleDestroysBlock= ruleDestroysBlock EOF )
            // InternalCrySL.g:575:2: iv_ruleDestroysBlock= ruleDestroysBlock EOF
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
    // InternalCrySL.g:581:1: ruleDestroysBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleDestroysBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:587:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCrySL.g:588:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCrySL.g:588:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==30||LA13_0==47||(LA13_0>=50 && LA13_0<=54)||(LA13_0>=56 && LA13_0<=58)||(LA13_0>=64 && LA13_0<=68)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCrySL.g:589:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCrySL.g:589:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCrySL.g:590:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCrySL.g:590:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCrySL.g:591:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDestroysBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	      						"de.darmstadt.tu.crossing.CrySL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
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
    // InternalCrySL.g:616:1: entryRuleObjectDecl returns [EObject current=null] : iv_ruleObjectDecl= ruleObjectDecl EOF ;
    public final EObject entryRuleObjectDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDecl = null;


        try {
            // InternalCrySL.g:616:51: (iv_ruleObjectDecl= ruleObjectDecl EOF )
            // InternalCrySL.g:617:2: iv_ruleObjectDecl= ruleObjectDecl EOF
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
    // InternalCrySL.g:623:1: ruleObjectDecl returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' ) ;
    public final EObject ruleObjectDecl() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_collection_3_0 = null;

        EObject lv_objectName_5_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:629:2: ( ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' ) )
            // InternalCrySL.g:630:2: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' )
            {
            // InternalCrySL.g:630:2: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCrySL.g:631:3: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
                    {
                    // InternalCrySL.g:631:3: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
                    // InternalCrySL.g:632:4: ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';'
                    {
                    // InternalCrySL.g:632:4: ( ( ruleQualifiedName ) )
                    // InternalCrySL.g:633:5: ( ruleQualifiedName )
                    {
                    // InternalCrySL.g:633:5: ( ruleQualifiedName )
                    // InternalCrySL.g:634:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getObjectDeclRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectTypeJvmTypeCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCrySL.g:648:4: ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )?
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
                            // InternalCrySL.g:649:5: ( (lv_array_1_0= '[]' ) )
                            {
                            // InternalCrySL.g:649:5: ( (lv_array_1_0= '[]' ) )
                            // InternalCrySL.g:650:6: (lv_array_1_0= '[]' )
                            {
                            // InternalCrySL.g:650:6: (lv_array_1_0= '[]' )
                            // InternalCrySL.g:651:7: lv_array_1_0= '[]'
                            {
                            lv_array_1_0=(Token)match(input,12,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_array_1_0, grammarAccess.getObjectDeclAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_0_1_0_0());
                              						
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
                            // InternalCrySL.g:664:5: (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' )
                            {
                            // InternalCrySL.g:664:5: (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' )
                            // InternalCrySL.g:665:6: otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>'
                            {
                            otherlv_2=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getObjectDeclAccess().getLessThanSignKeyword_0_1_1_0());
                              					
                            }
                            // InternalCrySL.g:669:6: ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) )
                            // InternalCrySL.g:670:7: (lv_collection_3_0= ruleJvmParameterizedTypeRef )
                            {
                            // InternalCrySL.g:670:7: (lv_collection_3_0= ruleJvmParameterizedTypeRef )
                            // InternalCrySL.g:671:8: lv_collection_3_0= ruleJvmParameterizedTypeRef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getObjectDeclAccess().getCollectionJvmParameterizedTypeRefParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_6);
                            lv_collection_3_0=ruleJvmParameterizedTypeRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getObjectDeclRule());
                              								}
                              								set(
                              									current,
                              									"collection",
                              									lv_collection_3_0,
                              									"de.darmstadt.tu.crossing.CrySL.JvmParameterizedTypeRef");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getObjectDeclAccess().getGreaterThanSignKeyword_0_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalCrySL.g:694:4: ( (lv_objectName_5_0= ruleObject ) )
                    // InternalCrySL.g:695:5: (lv_objectName_5_0= ruleObject )
                    {
                    // InternalCrySL.g:695:5: (lv_objectName_5_0= ruleObject )
                    // InternalCrySL.g:696:6: lv_objectName_5_0= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectNameObjectParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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
                      							"de.darmstadt.tu.crossing.CrySL.Object");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getObjectDeclAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:719:3: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_7, grammarAccess.getObjectDeclAccess().getAsteriskKeyword_1());
                      		
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
    // $ANTLR end "ruleObjectDecl"


    // $ANTLR start "entryRuleJvmParameterizedTypeRef"
    // InternalCrySL.g:727:1: entryRuleJvmParameterizedTypeRef returns [EObject current=null] : iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF ;
    public final EObject entryRuleJvmParameterizedTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeRef = null;


        try {
            // InternalCrySL.g:727:64: (iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF )
            // InternalCrySL.g:728:2: iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeRef=ruleJvmParameterizedTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeRef; 
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
    // $ANTLR end "entryRuleJvmParameterizedTypeRef"


    // $ANTLR start "ruleJvmParameterizedTypeRef"
    // InternalCrySL.g:734:1: ruleJvmParameterizedTypeRef returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )* ;
    public final EObject ruleJvmParameterizedTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:740:2: ( ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )* )
            // InternalCrySL.g:741:2: ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )*
            {
            // InternalCrySL.g:741:2: ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=26 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCrySL.g:742:3: ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )?
            	    {
            	    // InternalCrySL.g:742:3: ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) )
            	    // InternalCrySL.g:743:4: (lv_arguments_0_0= ruleJvmArgumentTypeRef )
            	    {
            	    // InternalCrySL.g:743:4: (lv_arguments_0_0= ruleJvmArgumentTypeRef )
            	    // InternalCrySL.g:744:5: lv_arguments_0_0= ruleJvmArgumentTypeRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_arguments_0_0=ruleJvmArgumentTypeRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	      					}
            	      					add(
            	      						current,
            	      						"arguments",
            	      						lv_arguments_0_0,
            	      						"de.darmstadt.tu.crossing.CrySL.JvmArgumentTypeRef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:761:3: (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==25) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalCrySL.g:762:4: otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) )
            	    	    {
            	    	    otherlv_1=(Token)match(input,25,FOLLOW_24); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeRefAccess().getCommaKeyword_1_0());
            	    	      			
            	    	    }
            	    	    // InternalCrySL.g:766:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) )
            	    	    // InternalCrySL.g:767:5: (lv_arguments_2_0= ruleJvmArgumentTypeRef )
            	    	    {
            	    	    // InternalCrySL.g:767:5: (lv_arguments_2_0= ruleJvmArgumentTypeRef )
            	    	    // InternalCrySL.g:768:6: lv_arguments_2_0= ruleJvmArgumentTypeRef
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_1_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_23);
            	    	    lv_arguments_2_0=ruleJvmArgumentTypeRef();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"arguments",
            	    	      							lv_arguments_2_0,
            	    	      							"de.darmstadt.tu.crossing.CrySL.JvmArgumentTypeRef");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    // InternalCrySL.g:786:3: (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==13) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalCrySL.g:787:4: otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeRefAccess().getLessThanSignKeyword_2_0());
            	              			
            	            }
            	            // InternalCrySL.g:791:4: ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) )
            	            // InternalCrySL.g:792:5: (lv_arguments_4_0= ruleJvmArgumentTypeRef )
            	            {
            	            // InternalCrySL.g:792:5: (lv_arguments_4_0= ruleJvmArgumentTypeRef )
            	            // InternalCrySL.g:793:6: lv_arguments_4_0= ruleJvmArgumentTypeRef
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_2_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_25);
            	            lv_arguments_4_0=ruleJvmArgumentTypeRef();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	              						}
            	              						add(
            	              							current,
            	              							"arguments",
            	              							lv_arguments_4_0,
            	              							"de.darmstadt.tu.crossing.CrySL.JvmArgumentTypeRef");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }

            	            // InternalCrySL.g:810:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )*
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==25) ) {
            	                    alt17=1;
            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // InternalCrySL.g:811:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) )
            	            	    {
            	            	    otherlv_5=(Token)match(input,25,FOLLOW_24); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      					newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeRefAccess().getCommaKeyword_2_2_0());
            	            	      				
            	            	    }
            	            	    // InternalCrySL.g:815:5: ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) )
            	            	    // InternalCrySL.g:816:6: (lv_arguments_6_0= ruleJvmArgumentTypeRef )
            	            	    {
            	            	    // InternalCrySL.g:816:6: (lv_arguments_6_0= ruleJvmArgumentTypeRef )
            	            	    // InternalCrySL.g:817:7: lv_arguments_6_0= ruleJvmArgumentTypeRef
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_2_2_1_0());
            	            	      						
            	            	    }
            	            	    pushFollow(FOLLOW_25);
            	            	    lv_arguments_6_0=ruleJvmArgumentTypeRef();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							if (current==null) {
            	            	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	            	      							}
            	            	      							add(
            	            	      								current,
            	            	      								"arguments",
            	            	      								lv_arguments_6_0,
            	            	      								"de.darmstadt.tu.crossing.CrySL.JvmArgumentTypeRef");
            	            	      							afterParserOrEnumRuleCall();
            	            	      						
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop17;
            	                }
            	            } while (true);

            	            otherlv_7=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeRefAccess().getGreaterThanSignKeyword_2_3());
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
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
    // $ANTLR end "ruleJvmParameterizedTypeRef"


    // $ANTLR start "entryRuleJvmArgumentTypeRef"
    // InternalCrySL.g:844:1: entryRuleJvmArgumentTypeRef returns [EObject current=null] : iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF ;
    public final EObject entryRuleJvmArgumentTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeRef = null;


        try {
            // InternalCrySL.g:844:59: (iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF )
            // InternalCrySL.g:845:2: iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeRef=ruleJvmArgumentTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeRef; 
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
    // $ANTLR end "entryRuleJvmArgumentTypeRef"


    // $ANTLR start "ruleJvmArgumentTypeRef"
    // InternalCrySL.g:851:1: ruleJvmArgumentTypeRef returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) ) ;
    public final EObject ruleJvmArgumentTypeRef() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:857:2: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) ) )
            // InternalCrySL.g:858:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) )
            {
            // InternalCrySL.g:858:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=29 && LA20_0<=30)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=26 && LA20_0<=28)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCrySL.g:859:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    {
                    // InternalCrySL.g:859:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    // InternalCrySL.g:860:4: (lv_type_0_0= ruleJvmTypeReference )
                    {
                    // InternalCrySL.g:860:4: (lv_type_0_0= ruleJvmTypeReference )
                    // InternalCrySL.g:861:5: lv_type_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmArgumentTypeRefAccess().getTypeJvmTypeReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmArgumentTypeRefRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_0_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:879:3: ( (lv_type_1_0= ruleJvmWildcardTypeRef ) )
                    {
                    // InternalCrySL.g:879:3: ( (lv_type_1_0= ruleJvmWildcardTypeRef ) )
                    // InternalCrySL.g:880:4: (lv_type_1_0= ruleJvmWildcardTypeRef )
                    {
                    // InternalCrySL.g:880:4: (lv_type_1_0= ruleJvmWildcardTypeRef )
                    // InternalCrySL.g:881:5: lv_type_1_0= ruleJvmWildcardTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmArgumentTypeRefAccess().getTypeJvmWildcardTypeRefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleJvmWildcardTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmArgumentTypeRefRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_1_0,
                      						"de.darmstadt.tu.crossing.CrySL.JvmWildcardTypeRef");
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
    // $ANTLR end "ruleJvmArgumentTypeRef"


    // $ANTLR start "entryRuleJvmWildcardTypeRef"
    // InternalCrySL.g:902:1: entryRuleJvmWildcardTypeRef returns [EObject current=null] : iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF ;
    public final EObject entryRuleJvmWildcardTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeRef = null;


        try {
            // InternalCrySL.g:902:59: (iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF )
            // InternalCrySL.g:903:2: iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeRef=ruleJvmWildcardTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeRef; 
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
    // $ANTLR end "entryRuleJvmWildcardTypeRef"


    // $ANTLR start "ruleJvmWildcardTypeRef"
    // InternalCrySL.g:909:1: ruleJvmWildcardTypeRef returns [EObject current=null] : ( () (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' ) ) ;
    public final EObject ruleJvmWildcardTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCrySL.g:915:2: ( ( () (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' ) ) )
            // InternalCrySL.g:916:2: ( () (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' ) )
            {
            // InternalCrySL.g:916:2: ( () (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' ) )
            // InternalCrySL.g:917:3: () (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' )
            {
            // InternalCrySL.g:917:3: ()
            // InternalCrySL.g:918:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeRefAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:924:3: (otherlv_1= '?' | otherlv_2= 'T' | otherlv_3= 'E' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt21=1;
                }
                break;
            case 27:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCrySL.g:925:4: otherlv_1= '?'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeRefAccess().getQuestionMarkKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCrySL.g:930:4: otherlv_2= 'T'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getJvmWildcardTypeRefAccess().getTKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCrySL.g:935:4: otherlv_3= 'E'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getJvmWildcardTypeRefAccess().getEKeyword_1_2());
                      			
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
    // $ANTLR end "ruleJvmWildcardTypeRef"


    // $ANTLR start "entryRuleForbMethod"
    // InternalCrySL.g:944:1: entryRuleForbMethod returns [EObject current=null] : iv_ruleForbMethod= ruleForbMethod EOF ;
    public final EObject entryRuleForbMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbMethod = null;


        try {
            // InternalCrySL.g:944:51: (iv_ruleForbMethod= ruleForbMethod EOF )
            // InternalCrySL.g:945:2: iv_ruleForbMethod= ruleForbMethod EOF
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
    // InternalCrySL.g:951:1: ruleForbMethod returns [EObject current=null] : ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) ;
    public final EObject ruleForbMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCrySL.g:957:2: ( ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) )
            // InternalCrySL.g:958:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            {
            // InternalCrySL.g:958:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            // InternalCrySL.g:959:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';'
            {
            // InternalCrySL.g:959:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCrySL.g:960:4: ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalCrySL.g:960:4: ( ( ruleFQN ) )
            // InternalCrySL.g:961:5: ( ruleFQN )
            {
            // InternalCrySL.g:961:5: ( ruleFQN )
            // InternalCrySL.g:962:6: ruleFQN
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getForbMethodRule());
              						}
              					
            }
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getForbMethodAccess().getJavaMethJvmExecutableCrossReference_0_0_0());
              					
            }
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCrySL.g:976:4: (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCrySL.g:977:5: otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getForbMethodAccess().getEqualsSignGreaterThanSignKeyword_0_1_0());
                      				
                    }
                    // InternalCrySL.g:981:5: ( (otherlv_2= RULE_ID ) )
                    // InternalCrySL.g:982:6: (otherlv_2= RULE_ID )
                    {
                    // InternalCrySL.g:982:6: (otherlv_2= RULE_ID )
                    // InternalCrySL.g:983:7: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getForbMethodRule());
                      							}
                      						
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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
    // InternalCrySL.g:1004:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCrySL.g:1004:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCrySL.g:1005:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCrySL.g:1011:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QN_0 = null;

        AntlrDatatypeRuleToken this_QN_2 = null;

        AntlrDatatypeRuleToken this_QN_4 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1017:2: ( (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) )
            // InternalCrySL.g:1018:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            {
            // InternalCrySL.g:1018:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            // InternalCrySL.g:1019:3: this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_QN_0=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QN_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCrySL.g:1034:3: (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCrySL.g:1035:4: this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_QN_2=ruleQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_QN_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCrySL.g:1045:4: (kw= ',' this_QN_4= ruleQN )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCrySL.g:1046:5: kw= ',' this_QN_4= ruleQN
                    	    {
                    	    kw=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getFQNAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:1072:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalCrySL.g:1072:42: (iv_ruleQN= ruleQN EOF )
            // InternalCrySL.g:1073:2: iv_ruleQN= ruleQN EOF
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
    // InternalCrySL.g:1079:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCrySL.g:1085:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) )
            // InternalCrySL.g:1086:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            {
            // InternalCrySL.g:1086:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            // InternalCrySL.g:1087:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCrySL.g:1094:3: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCrySL.g:1095:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalCrySL.g:1108:3: (kw= '[]' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCrySL.g:1109:4: kw= '[]'
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
    // InternalCrySL.g:1119:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalCrySL.g:1119:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalCrySL.g:1120:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalCrySL.g:1126:1: ruleEvent returns [EObject current=null] : (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LabelMethodCall_0 = null;

        EObject this_Aggregate_1 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1132:2: ( (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' ) )
            // InternalCrySL.g:1133:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' )
            {
            // InternalCrySL.g:1133:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==33) ) {
                    alt27=1;
                }
                else if ( (LA27_1==37) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==24) ) {
                alt27=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCrySL.g:1134:3: this_LabelMethodCall_0= ruleLabelMethodCall
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
                    // InternalCrySL.g:1143:3: this_Aggregate_1= ruleAggregate
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
                case 3 :
                    // InternalCrySL.g:1152:3: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getAsteriskKeyword_2());
                      		
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
    // InternalCrySL.g:1160:1: entryRuleLabelMethodCall returns [EObject current=null] : iv_ruleLabelMethodCall= ruleLabelMethodCall EOF ;
    public final EObject entryRuleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMethodCall = null;


        try {
            // InternalCrySL.g:1160:56: (iv_ruleLabelMethodCall= ruleLabelMethodCall EOF )
            // InternalCrySL.g:1161:2: iv_ruleLabelMethodCall= ruleLabelMethodCall EOF
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
    // InternalCrySL.g:1167:1: ruleLabelMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) ;
    public final EObject ruleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_meth_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1173:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) )
            // InternalCrySL.g:1174:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            {
            // InternalCrySL.g:1174:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            // InternalCrySL.g:1175:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) )
            {
            // InternalCrySL.g:1175:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCrySL.g:1176:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCrySL.g:1176:4: (lv_name_0_0= RULE_ID )
            // InternalCrySL.g:1177:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLabelMethodCallAccess().getColonKeyword_1());
              		
            }
            // InternalCrySL.g:1197:3: ( (lv_meth_2_0= ruleMethod ) )
            // InternalCrySL.g:1198:4: (lv_meth_2_0= ruleMethod )
            {
            // InternalCrySL.g:1198:4: (lv_meth_2_0= ruleMethod )
            // InternalCrySL.g:1199:5: lv_meth_2_0= ruleMethod
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
              						"de.darmstadt.tu.crossing.CrySL.Method");
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
    // InternalCrySL.g:1220:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCrySL.g:1220:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCrySL.g:1221:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCrySL.g:1227:1: ruleMethod returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) ;
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
            // InternalCrySL.g:1233:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) )
            // InternalCrySL.g:1234:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            {
            // InternalCrySL.g:1234:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            // InternalCrySL.g:1235:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');'
            {
            // InternalCrySL.g:1235:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==34) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalCrySL.g:1236:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // InternalCrySL.g:1236:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCrySL.g:1237:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCrySL.g:1237:5: (otherlv_0= RULE_ID )
                    // InternalCrySL.g:1238:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getLeftSideObjectCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCrySL.g:1254:3: ( (otherlv_2= RULE_ID ) )
            // InternalCrySL.g:1255:4: (otherlv_2= RULE_ID )
            {
            // InternalCrySL.g:1255:4: (otherlv_2= RULE_ID )
            // InternalCrySL.g:1256:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getMethNameJvmExecutableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalCrySL.g:1271:3: ( (lv_parList_4_0= ruleParList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCrySL.g:1272:4: (lv_parList_4_0= ruleParList )
                    {
                    // InternalCrySL.g:1272:4: (lv_parList_4_0= ruleParList )
                    // InternalCrySL.g:1273:5: lv_parList_4_0= ruleParList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getParListParListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_35);
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
                      						"de.darmstadt.tu.crossing.CrySL.ParList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:1298:1: entryRuleParList returns [EObject current=null] : iv_ruleParList= ruleParList EOF ;
    public final EObject entryRuleParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParList = null;


        try {
            // InternalCrySL.g:1298:48: (iv_ruleParList= ruleParList EOF )
            // InternalCrySL.g:1299:2: iv_ruleParList= ruleParList EOF
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
    // InternalCrySL.g:1305:1: ruleParList returns [EObject current=null] : ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) ;
    public final EObject ruleParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1311:2: ( ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) )
            // InternalCrySL.g:1312:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            {
            // InternalCrySL.g:1312:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            // InternalCrySL.g:1313:3: ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            {
            // InternalCrySL.g:1313:3: ( (lv_parameters_0_0= rulePar ) )
            // InternalCrySL.g:1314:4: (lv_parameters_0_0= rulePar )
            {
            // InternalCrySL.g:1314:4: (lv_parameters_0_0= rulePar )
            // InternalCrySL.g:1315:5: lv_parameters_0_0= rulePar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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
              						"de.darmstadt.tu.crossing.CrySL.Par");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:1332:3: (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCrySL.g:1333:4: otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCrySL.g:1337:4: ( (lv_parameters_2_0= rulePar ) )
            	    // InternalCrySL.g:1338:5: (lv_parameters_2_0= rulePar )
            	    {
            	    // InternalCrySL.g:1338:5: (lv_parameters_2_0= rulePar )
            	    // InternalCrySL.g:1339:6: lv_parameters_2_0= rulePar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	      							"de.darmstadt.tu.crossing.CrySL.Par");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCrySL.g:1361:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalCrySL.g:1361:44: (iv_rulePar= rulePar EOF )
            // InternalCrySL.g:1362:2: iv_rulePar= rulePar EOF
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
    // InternalCrySL.g:1368:1: rulePar returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCrySL.g:1374:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) )
            // InternalCrySL.g:1375:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            {
            // InternalCrySL.g:1375:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            // InternalCrySL.g:1376:3: () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            {
            // InternalCrySL.g:1376:3: ()
            // InternalCrySL.g:1377:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParAccess().getParAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:1383:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCrySL.g:1384:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCrySL.g:1384:4: ( (otherlv_1= RULE_ID ) )
                    // InternalCrySL.g:1385:5: (otherlv_1= RULE_ID )
                    {
                    // InternalCrySL.g:1385:5: (otherlv_1= RULE_ID )
                    // InternalCrySL.g:1386:6: otherlv_1= RULE_ID
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
                    // InternalCrySL.g:1398:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:1407:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalCrySL.g:1407:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalCrySL.g:1408:2: iv_ruleAggregate= ruleAggregate EOF
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
    // InternalCrySL.g:1414:1: ruleAggregate returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) ;
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
            // InternalCrySL.g:1420:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) )
            // InternalCrySL.g:1421:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            {
            // InternalCrySL.g:1421:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            // InternalCrySL.g:1422:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            {
            // InternalCrySL.g:1422:3: ()
            // InternalCrySL.g:1423:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAggregateAccess().getAggregateAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:1429:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            // InternalCrySL.g:1430:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';'
            {
            // InternalCrySL.g:1430:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrySL.g:1431:5: (lv_name_1_0= RULE_ID )
            {
            // InternalCrySL.g:1431:5: (lv_name_1_0= RULE_ID )
            // InternalCrySL.g:1432:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getColonEqualsSignKeyword_1_1());
              			
            }
            // InternalCrySL.g:1452:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalCrySL.g:1453:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalCrySL.g:1453:5: ( (otherlv_3= RULE_ID ) )
            // InternalCrySL.g:1454:6: (otherlv_3= RULE_ID )
            {
            // InternalCrySL.g:1454:6: (otherlv_3= RULE_ID )
            // InternalCrySL.g:1455:7: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getAggregateRule());
              							}
              						
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_0_0());
              						
            }

            }


            }

            // InternalCrySL.g:1466:5: (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCrySL.g:1467:6: otherlv_4= '|' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getVerticalLineKeyword_1_2_1_0());
            	      					
            	    }
            	    // InternalCrySL.g:1471:6: ( (otherlv_5= RULE_ID ) )
            	    // InternalCrySL.g:1472:7: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCrySL.g:1472:7: (otherlv_5= RULE_ID )
            	    // InternalCrySL.g:1473:8: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getAggregateRule());
            	      								}
            	      							
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_1_1_0());
            	      							
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCrySL.g:1495:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalCrySL.g:1495:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalCrySL.g:1496:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalCrySL.g:1502:1: ruleOrder returns [EObject current=null] : ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        Token otherlv_4=null;
        EObject this_SimpleOrder_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1508:2: ( ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' ) )
            // InternalCrySL.g:1509:2: ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' )
            {
            // InternalCrySL.g:1509:2: ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==30) ) {
                alt34=1;
            }
            else if ( (LA34_0==24) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCrySL.g:1510:3: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
                    {
                    // InternalCrySL.g:1510:3: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
                    // InternalCrySL.g:1511:4: this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOrderAccess().getSimpleOrderParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_SimpleOrder_0=ruleSimpleOrder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleOrder_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCrySL.g:1519:4: ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==25) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalCrySL.g:1520:5: () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) )
                    	    {
                    	    // InternalCrySL.g:1520:5: ()
                    	    // InternalCrySL.g:1521:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getOrderAccess().getOrderLeftAction_0_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalCrySL.g:1527:5: ( (lv_orderop_2_0= ',' ) )
                    	    // InternalCrySL.g:1528:6: (lv_orderop_2_0= ',' )
                    	    {
                    	    // InternalCrySL.g:1528:6: (lv_orderop_2_0= ',' )
                    	    // InternalCrySL.g:1529:7: lv_orderop_2_0= ','
                    	    {
                    	    lv_orderop_2_0=(Token)match(input,25,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_orderop_2_0, grammarAccess.getOrderAccess().getOrderopCommaKeyword_0_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOrderRule());
                    	      							}
                    	      							setWithLastConsumed(current, "orderop", lv_orderop_2_0, ",");
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCrySL.g:1541:5: ( (lv_right_3_0= ruleSimpleOrder ) )
                    	    // InternalCrySL.g:1542:6: (lv_right_3_0= ruleSimpleOrder )
                    	    {
                    	    // InternalCrySL.g:1542:6: (lv_right_3_0= ruleSimpleOrder )
                    	    // InternalCrySL.g:1543:7: lv_right_3_0= ruleSimpleOrder
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderAccess().getRightSimpleOrderParserRuleCall_0_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
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
                    	      								"de.darmstadt.tu.crossing.CrySL.SimpleOrder");
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
                    break;
                case 2 :
                    // InternalCrySL.g:1563:3: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getAsteriskKeyword_1());
                      		
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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleSimpleOrder"
    // InternalCrySL.g:1571:1: entryRuleSimpleOrder returns [EObject current=null] : iv_ruleSimpleOrder= ruleSimpleOrder EOF ;
    public final EObject entryRuleSimpleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrder = null;


        try {
            // InternalCrySL.g:1571:52: (iv_ruleSimpleOrder= ruleSimpleOrder EOF )
            // InternalCrySL.g:1572:2: iv_ruleSimpleOrder= ruleSimpleOrder EOF
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
    // InternalCrySL.g:1578:1: ruleSimpleOrder returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleSimpleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1584:2: ( (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalCrySL.g:1585:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalCrySL.g:1585:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalCrySL.g:1586:3: this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleOrderAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:1594:3: ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCrySL.g:1595:4: () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalCrySL.g:1595:4: ()
            	    // InternalCrySL.g:1596:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSimpleOrderAccess().getSimpleOrderLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:1602:4: ( (lv_orderop_2_0= '|' ) )
            	    // InternalCrySL.g:1603:5: (lv_orderop_2_0= '|' )
            	    {
            	    // InternalCrySL.g:1603:5: (lv_orderop_2_0= '|' )
            	    // InternalCrySL.g:1604:6: lv_orderop_2_0= '|'
            	    {
            	    lv_orderop_2_0=(Token)match(input,38,FOLLOW_40); if (state.failed) return current;
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

            	    // InternalCrySL.g:1616:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalCrySL.g:1617:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalCrySL.g:1617:5: (lv_right_3_0= rulePrimary )
            	    // InternalCrySL.g:1618:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimpleOrderAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	      							"de.darmstadt.tu.crossing.CrySL.Primary");
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
    // $ANTLR end "ruleSimpleOrder"


    // $ANTLR start "entryRulePrimary"
    // InternalCrySL.g:1640:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCrySL.g:1640:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCrySL.g:1641:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalCrySL.g:1647:1: rulePrimary returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) ;
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
            // InternalCrySL.g:1653:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) )
            // InternalCrySL.g:1654:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            {
            // InternalCrySL.g:1654:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==30) ) {
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
                    // InternalCrySL.g:1655:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    {
                    // InternalCrySL.g:1655:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    // InternalCrySL.g:1656:4: ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    {
                    // InternalCrySL.g:1656:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCrySL.g:1657:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCrySL.g:1657:5: (otherlv_0= RULE_ID )
                    // InternalCrySL.g:1658:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getOrderEvEventCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalCrySL.g:1669:4: ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==24||LA37_0==26||LA37_0==39) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalCrySL.g:1670:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            {
                            // InternalCrySL.g:1670:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            // InternalCrySL.g:1671:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            {
                            // InternalCrySL.g:1671:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            int alt36=3;
                            switch ( input.LA(1) ) {
                            case 39:
                                {
                                alt36=1;
                                }
                                break;
                            case 26:
                                {
                                alt36=2;
                                }
                                break;
                            case 24:
                                {
                                alt36=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }

                            switch (alt36) {
                                case 1 :
                                    // InternalCrySL.g:1672:7: lv_elementop_1_1= '+'
                                    {
                                    lv_elementop_1_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
                                    // InternalCrySL.g:1683:7: lv_elementop_1_2= '?'
                                    {
                                    lv_elementop_1_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
                                    // InternalCrySL.g:1694:7: lv_elementop_1_3= '*'
                                    {
                                    lv_elementop_1_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:1709:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    {
                    // InternalCrySL.g:1709:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    // InternalCrySL.g:1710:4: otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getOrderParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_43);
                    this_Order_3=ruleOrder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Order_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,31,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    // InternalCrySL.g:1726:4: ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==24||LA39_0==26||LA39_0==39) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalCrySL.g:1727:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            {
                            // InternalCrySL.g:1727:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            // InternalCrySL.g:1728:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            {
                            // InternalCrySL.g:1728:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            int alt38=3;
                            switch ( input.LA(1) ) {
                            case 39:
                                {
                                alt38=1;
                                }
                                break;
                            case 26:
                                {
                                alt38=2;
                                }
                                break;
                            case 24:
                                {
                                alt38=3;
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
                                    // InternalCrySL.g:1729:7: lv_elementop_5_1= '+'
                                    {
                                    lv_elementop_5_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
                                    // InternalCrySL.g:1740:7: lv_elementop_5_2= '?'
                                    {
                                    lv_elementop_5_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
                                    // InternalCrySL.g:1751:7: lv_elementop_5_3= '*'
                                    {
                                    lv_elementop_5_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:1769:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCrySL.g:1769:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCrySL.g:1770:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalCrySL.g:1776:1: ruleConstraint returns [EObject current=null] : this_LogicalImplyExpression_0= ruleLogicalImplyExpression ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalImplyExpression_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1782:2: (this_LogicalImplyExpression_0= ruleLogicalImplyExpression )
            // InternalCrySL.g:1783:2: this_LogicalImplyExpression_0= ruleLogicalImplyExpression
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
    // InternalCrySL.g:1794:1: entryRuleLogicalImplyExpression returns [EObject current=null] : iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF ;
    public final EObject entryRuleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImplyExpression = null;


        try {
            // InternalCrySL.g:1794:63: (iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF )
            // InternalCrySL.g:1795:2: iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF
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
    // InternalCrySL.g:1801:1: ruleLogicalImplyExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1807:2: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) )
            // InternalCrySL.g:1808:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            {
            // InternalCrySL.g:1808:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            // InternalCrySL.g:1809:3: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getLogicalOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:1817:3: ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==29) ) {
                    switch ( input.LA(2) ) {
                    case 58:
                        {
                        int LA41_3 = input.LA(3);

                        if ( (LA41_3==RULE_ID) ) {
                            int LA41_6 = input.LA(4);

                            if ( (LA41_6==EOF||(LA41_6>=13 && LA41_6<=14)||LA41_6==23||LA41_6==29||(LA41_6>=31 && LA41_6<=32)||(LA41_6>=39 && LA41_6<=45)||(LA41_6>=59 && LA41_6<=61)) ) {
                                alt41=1;
                            }


                        }
                        else if ( ((LA41_3>=RULE_STRING && LA41_3<=RULE_INT)||LA41_3==30||LA41_3==47||(LA41_3>=50 && LA41_3<=54)||(LA41_3>=56 && LA41_3<=57)||(LA41_3>=64 && LA41_3<=68)) ) {
                            alt41=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case 30:
                    case 47:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 56:
                    case 57:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        {
                        alt41=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA41_5 = input.LA(3);

                        if ( (LA41_5==EOF||(LA41_5>=13 && LA41_5<=14)||(LA41_5>=23 && LA41_5<=24)||LA41_5==29||(LA41_5>=31 && LA41_5<=32)||(LA41_5>=39 && LA41_5<=46)||(LA41_5>=59 && LA41_5<=61)) ) {
                            alt41=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt41) {
            	case 1 :
            	    // InternalCrySL.g:1818:4: () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    {
            	    // InternalCrySL.g:1818:4: ()
            	    // InternalCrySL.g:1819:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalImplyExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:1825:4: ( (lv_operator_2_0= ruleLogicalImply ) )
            	    // InternalCrySL.g:1826:5: (lv_operator_2_0= ruleLogicalImply )
            	    {
            	    // InternalCrySL.g:1826:5: (lv_operator_2_0= ruleLogicalImply )
            	    // InternalCrySL.g:1827:6: lv_operator_2_0= ruleLogicalImply
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getOperatorLogicalImplyParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalImply");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:1844:4: ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    // InternalCrySL.g:1845:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    {
            	    // InternalCrySL.g:1845:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    // InternalCrySL.g:1846:6: lv_rightExpression_3_0= ruleLogicalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getRightExpressionLogicalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalOrExpression");
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
    // InternalCrySL.g:1868:1: entryRuleLogicalImply returns [EObject current=null] : iv_ruleLogicalImply= ruleLogicalImply EOF ;
    public final EObject entryRuleLogicalImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImply = null;


        try {
            // InternalCrySL.g:1868:53: (iv_ruleLogicalImply= ruleLogicalImply EOF )
            // InternalCrySL.g:1869:2: iv_ruleLogicalImply= ruleLogicalImply EOF
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
    // InternalCrySL.g:1875:1: ruleLogicalImply returns [EObject current=null] : ( (lv_IMPLIES_0_0= '=>' ) ) ;
    public final EObject ruleLogicalImply() throws RecognitionException {
        EObject current = null;

        Token lv_IMPLIES_0_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:1881:2: ( ( (lv_IMPLIES_0_0= '=>' ) ) )
            // InternalCrySL.g:1882:2: ( (lv_IMPLIES_0_0= '=>' ) )
            {
            // InternalCrySL.g:1882:2: ( (lv_IMPLIES_0_0= '=>' ) )
            // InternalCrySL.g:1883:3: (lv_IMPLIES_0_0= '=>' )
            {
            // InternalCrySL.g:1883:3: (lv_IMPLIES_0_0= '=>' )
            // InternalCrySL.g:1884:4: lv_IMPLIES_0_0= '=>'
            {
            lv_IMPLIES_0_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:1899:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalCrySL.g:1899:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalCrySL.g:1900:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalCrySL.g:1906:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:1912:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalCrySL.g:1913:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalCrySL.g:1913:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalCrySL.g:1914:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:1922:3: ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==40) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCrySL.g:1923:4: () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalCrySL.g:1923:4: ()
            	    // InternalCrySL.g:1924:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalOrExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:1930:4: ( (lv_operator_2_0= ruleLogicalOr ) )
            	    // InternalCrySL.g:1931:5: (lv_operator_2_0= ruleLogicalOr )
            	    {
            	    // InternalCrySL.g:1931:5: (lv_operator_2_0= ruleLogicalOr )
            	    // InternalCrySL.g:1932:6: lv_operator_2_0= ruleLogicalOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:1949:4: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // InternalCrySL.g:1950:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalCrySL.g:1950:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // InternalCrySL.g:1951:6: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalCrySL.g:1973:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // InternalCrySL.g:1973:50: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // InternalCrySL.g:1974:2: iv_ruleLogicalOr= ruleLogicalOr EOF
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
    // InternalCrySL.g:1980:1: ruleLogicalOr returns [EObject current=null] : ( (lv_OR_0_0= '||' ) ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        Token lv_OR_0_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:1986:2: ( ( (lv_OR_0_0= '||' ) ) )
            // InternalCrySL.g:1987:2: ( (lv_OR_0_0= '||' ) )
            {
            // InternalCrySL.g:1987:2: ( (lv_OR_0_0= '||' ) )
            // InternalCrySL.g:1988:3: (lv_OR_0_0= '||' )
            {
            // InternalCrySL.g:1988:3: (lv_OR_0_0= '||' )
            // InternalCrySL.g:1989:4: lv_OR_0_0= '||'
            {
            lv_OR_0_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:2004:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalCrySL.g:2004:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalCrySL.g:2005:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalCrySL.g:2011:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2017:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalCrySL.g:2018:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalCrySL.g:2018:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // InternalCrySL.g:2019:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:2027:3: ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==41) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCrySL.g:2028:4: () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalCrySL.g:2028:4: ()
            	    // InternalCrySL.g:2029:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalAndExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:2035:4: ( (lv_operator_2_0= ruleLogicalAnd ) )
            	    // InternalCrySL.g:2036:5: (lv_operator_2_0= ruleLogicalAnd )
            	    {
            	    // InternalCrySL.g:2036:5: (lv_operator_2_0= ruleLogicalAnd )
            	    // InternalCrySL.g:2037:6: lv_operator_2_0= ruleLogicalAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:2054:4: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // InternalCrySL.g:2055:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // InternalCrySL.g:2055:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // InternalCrySL.g:2056:6: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	      							"de.darmstadt.tu.crossing.CrySL.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalCrySL.g:2078:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // InternalCrySL.g:2078:51: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // InternalCrySL.g:2079:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
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
    // InternalCrySL.g:2085:1: ruleLogicalAnd returns [EObject current=null] : ( (lv_AND_0_0= '&&' ) ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        Token lv_AND_0_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:2091:2: ( ( (lv_AND_0_0= '&&' ) ) )
            // InternalCrySL.g:2092:2: ( (lv_AND_0_0= '&&' ) )
            {
            // InternalCrySL.g:2092:2: ( (lv_AND_0_0= '&&' ) )
            // InternalCrySL.g:2093:3: (lv_AND_0_0= '&&' )
            {
            // InternalCrySL.g:2093:3: (lv_AND_0_0= '&&' )
            // InternalCrySL.g:2094:4: lv_AND_0_0= '&&'
            {
            lv_AND_0_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:2109:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalCrySL.g:2109:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalCrySL.g:2110:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalCrySL.g:2116:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2122:2: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // InternalCrySL.g:2123:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // InternalCrySL.g:2123:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // InternalCrySL.g:2124:3: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonHigherOpExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:2132:3: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=59 && LA44_0<=60)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCrySL.g:2133:4: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // InternalCrySL.g:2133:4: ()
                    // InternalCrySL.g:2134:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCrySL.g:2140:4: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // InternalCrySL.g:2141:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // InternalCrySL.g:2141:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // InternalCrySL.g:2142:6: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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
                      							"de.darmstadt.tu.crossing.CrySL.ComparingEQNEQOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCrySL.g:2159:4: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // InternalCrySL.g:2160:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // InternalCrySL.g:2160:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // InternalCrySL.g:2161:6: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
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
                      							"de.darmstadt.tu.crossing.CrySL.ComparisonHigherOpExpression");
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
    // InternalCrySL.g:2183:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // InternalCrySL.g:2183:69: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // InternalCrySL.g:2184:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
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
    // InternalCrySL.g:2190:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2196:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalCrySL.g:2197:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalCrySL.g:2197:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // InternalCrySL.g:2198:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithmeticExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:2206:3: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=13 && LA45_0<=14)||(LA45_0>=42 && LA45_0<=43)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCrySL.g:2207:4: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalCrySL.g:2207:4: ()
                    // InternalCrySL.g:2208:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCrySL.g:2214:4: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // InternalCrySL.g:2215:5: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // InternalCrySL.g:2215:5: (lv_operator_2_0= ruleComparingRelOperator )
                    // InternalCrySL.g:2216:6: lv_operator_2_0= ruleComparingRelOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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
                      							"de.darmstadt.tu.crossing.CrySL.ComparingRelOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCrySL.g:2233:4: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // InternalCrySL.g:2234:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // InternalCrySL.g:2234:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // InternalCrySL.g:2235:6: lv_rightExpression_3_0= ruleArithmeticExpression
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
                      							"de.darmstadt.tu.crossing.CrySL.ArithmeticExpression");
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
    // InternalCrySL.g:2257:1: entryRuleComparingRelOperator returns [EObject current=null] : iv_ruleComparingRelOperator= ruleComparingRelOperator EOF ;
    public final EObject entryRuleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingRelOperator = null;


        try {
            // InternalCrySL.g:2257:61: (iv_ruleComparingRelOperator= ruleComparingRelOperator EOF )
            // InternalCrySL.g:2258:2: iv_ruleComparingRelOperator= ruleComparingRelOperator EOF
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
    // InternalCrySL.g:2264:1: ruleComparingRelOperator returns [EObject current=null] : ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) ;
    public final EObject ruleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        Token lv_LESS_0_0=null;
        Token lv_LESS_OR_EQUAL_1_0=null;
        Token lv_GREATER_OR_EQUAL_2_0=null;
        Token lv_GREATER_3_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:2270:2: ( ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) )
            // InternalCrySL.g:2271:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            {
            // InternalCrySL.g:2271:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt46=1;
                }
                break;
            case 42:
                {
                alt46=2;
                }
                break;
            case 43:
                {
                alt46=3;
                }
                break;
            case 14:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalCrySL.g:2272:3: ( (lv_LESS_0_0= '<' ) )
                    {
                    // InternalCrySL.g:2272:3: ( (lv_LESS_0_0= '<' ) )
                    // InternalCrySL.g:2273:4: (lv_LESS_0_0= '<' )
                    {
                    // InternalCrySL.g:2273:4: (lv_LESS_0_0= '<' )
                    // InternalCrySL.g:2274:5: lv_LESS_0_0= '<'
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
                    // InternalCrySL.g:2287:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    {
                    // InternalCrySL.g:2287:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    // InternalCrySL.g:2288:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    {
                    // InternalCrySL.g:2288:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    // InternalCrySL.g:2289:5: lv_LESS_OR_EQUAL_1_0= '<='
                    {
                    lv_LESS_OR_EQUAL_1_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:2302:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    {
                    // InternalCrySL.g:2302:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    // InternalCrySL.g:2303:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    {
                    // InternalCrySL.g:2303:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    // InternalCrySL.g:2304:5: lv_GREATER_OR_EQUAL_2_0= '>='
                    {
                    lv_GREATER_OR_EQUAL_2_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:2317:3: ( (lv_GREATER_3_0= '>' ) )
                    {
                    // InternalCrySL.g:2317:3: ( (lv_GREATER_3_0= '>' ) )
                    // InternalCrySL.g:2318:4: (lv_GREATER_3_0= '>' )
                    {
                    // InternalCrySL.g:2318:4: (lv_GREATER_3_0= '>' )
                    // InternalCrySL.g:2319:5: lv_GREATER_3_0= '>'
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
    // InternalCrySL.g:2335:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalCrySL.g:2335:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalCrySL.g:2336:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalCrySL.g:2342:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2348:2: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalCrySL.g:2349:2: this_AdditionExpression_0= ruleAdditionExpression
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
    // InternalCrySL.g:2360:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalCrySL.g:2360:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalCrySL.g:2361:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
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
    // InternalCrySL.g:2367:1: ruleAdditionExpression returns [EObject current=null] : (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModularExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2373:2: ( (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* ) )
            // InternalCrySL.g:2374:2: (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* )
            {
            // InternalCrySL.g:2374:2: (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* )
            // InternalCrySL.g:2375:3: this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getModularExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_ModularExpression_0=ruleModularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ModularExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:2383:3: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==39||LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCrySL.g:2384:4: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) )
            	    {
            	    // InternalCrySL.g:2384:4: ()
            	    // InternalCrySL.g:2385:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:2391:4: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalCrySL.g:2392:5: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalCrySL.g:2392:5: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalCrySL.g:2393:6: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      							"de.darmstadt.tu.crossing.CrySL.AdditionOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:2410:4: ( (lv_rightExpression_3_0= ruleModularExpression ) )
            	    // InternalCrySL.g:2411:5: (lv_rightExpression_3_0= ruleModularExpression )
            	    {
            	    // InternalCrySL.g:2411:5: (lv_rightExpression_3_0= ruleModularExpression )
            	    // InternalCrySL.g:2412:6: lv_rightExpression_3_0= ruleModularExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionModularExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_rightExpression_3_0=ruleModularExpression();

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
            	      							"de.darmstadt.tu.crossing.CrySL.ModularExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalCrySL.g:2434:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // InternalCrySL.g:2434:57: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // InternalCrySL.g:2435:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
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
    // InternalCrySL.g:2441:1: ruleAdditionOperator returns [EObject current=null] : ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_PLUS_0_0=null;
        Token lv_MINUS_1_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:2447:2: ( ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) )
            // InternalCrySL.g:2448:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            {
            // InternalCrySL.g:2448:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            else if ( (LA48_0==44) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalCrySL.g:2449:3: ( (lv_PLUS_0_0= '+' ) )
                    {
                    // InternalCrySL.g:2449:3: ( (lv_PLUS_0_0= '+' ) )
                    // InternalCrySL.g:2450:4: (lv_PLUS_0_0= '+' )
                    {
                    // InternalCrySL.g:2450:4: (lv_PLUS_0_0= '+' )
                    // InternalCrySL.g:2451:5: lv_PLUS_0_0= '+'
                    {
                    lv_PLUS_0_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:2464:3: ( (lv_MINUS_1_0= '-' ) )
                    {
                    // InternalCrySL.g:2464:3: ( (lv_MINUS_1_0= '-' ) )
                    // InternalCrySL.g:2465:4: (lv_MINUS_1_0= '-' )
                    {
                    // InternalCrySL.g:2465:4: (lv_MINUS_1_0= '-' )
                    // InternalCrySL.g:2466:5: lv_MINUS_1_0= '-'
                    {
                    lv_MINUS_1_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleModularExpression"
    // InternalCrySL.g:2482:1: entryRuleModularExpression returns [EObject current=null] : iv_ruleModularExpression= ruleModularExpression EOF ;
    public final EObject entryRuleModularExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModularExpression = null;


        try {
            // InternalCrySL.g:2482:58: (iv_ruleModularExpression= ruleModularExpression EOF )
            // InternalCrySL.g:2483:2: iv_ruleModularExpression= ruleModularExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModularExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModularExpression=ruleModularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModularExpression; 
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
    // $ANTLR end "entryRuleModularExpression"


    // $ANTLR start "ruleModularExpression"
    // InternalCrySL.g:2489:1: ruleModularExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleModularExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2495:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalCrySL.g:2496:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalCrySL.g:2496:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalCrySL.g:2497:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModularExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:2505:3: ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==45) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCrySL.g:2506:4: () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalCrySL.g:2506:4: ()
            	    // InternalCrySL.g:2507:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModularExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:2513:4: ( (lv_operator_2_0= ruleModularOperator ) )
            	    // InternalCrySL.g:2514:5: (lv_operator_2_0= ruleModularOperator )
            	    {
            	    // InternalCrySL.g:2514:5: (lv_operator_2_0= ruleModularOperator )
            	    // InternalCrySL.g:2515:6: lv_operator_2_0= ruleModularOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModularExpressionAccess().getOperatorModularOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleModularOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModularExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CrySL.ModularOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:2532:4: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // InternalCrySL.g:2533:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalCrySL.g:2533:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // InternalCrySL.g:2534:6: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModularExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModularExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CrySL.MultiplicationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "ruleModularExpression"


    // $ANTLR start "entryRuleModularOperator"
    // InternalCrySL.g:2556:1: entryRuleModularOperator returns [EObject current=null] : iv_ruleModularOperator= ruleModularOperator EOF ;
    public final EObject entryRuleModularOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModularOperator = null;


        try {
            // InternalCrySL.g:2556:56: (iv_ruleModularOperator= ruleModularOperator EOF )
            // InternalCrySL.g:2557:2: iv_ruleModularOperator= ruleModularOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModularOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModularOperator=ruleModularOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModularOperator; 
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
    // $ANTLR end "entryRuleModularOperator"


    // $ANTLR start "ruleModularOperator"
    // InternalCrySL.g:2563:1: ruleModularOperator returns [EObject current=null] : ( (lv_MOD_0_0= '%' ) ) ;
    public final EObject ruleModularOperator() throws RecognitionException {
        EObject current = null;

        Token lv_MOD_0_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:2569:2: ( ( (lv_MOD_0_0= '%' ) ) )
            // InternalCrySL.g:2570:2: ( (lv_MOD_0_0= '%' ) )
            {
            // InternalCrySL.g:2570:2: ( (lv_MOD_0_0= '%' ) )
            // InternalCrySL.g:2571:3: (lv_MOD_0_0= '%' )
            {
            // InternalCrySL.g:2571:3: (lv_MOD_0_0= '%' )
            // InternalCrySL.g:2572:4: lv_MOD_0_0= '%'
            {
            lv_MOD_0_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_MOD_0_0, grammarAccess.getModularOperatorAccess().getMODPercentSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getModularOperatorRule());
              				}
              				setWithLastConsumed(current, "MOD", lv_MOD_0_0, "%");
              			
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
    // $ANTLR end "ruleModularOperator"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalCrySL.g:2587:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalCrySL.g:2587:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalCrySL.g:2588:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
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
    // InternalCrySL.g:2594:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_Operand_1 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2600:2: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) )
            // InternalCrySL.g:2601:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            {
            // InternalCrySL.g:2601:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_INT)||LA51_0==30||LA51_0==47||(LA51_0>=50 && LA51_0<=54)||(LA51_0>=56 && LA51_0<=57)||(LA51_0>=64 && LA51_0<=68)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCrySL.g:2602:3: this_UnaryPreExpression_0= ruleUnaryPreExpression
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
                    // InternalCrySL.g:2611:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    {
                    // InternalCrySL.g:2611:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    // InternalCrySL.g:2612:4: this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    this_Operand_1=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Operand_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCrySL.g:2620:4: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==24||LA50_0==46) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalCrySL.g:2621:5: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    {
                    	    // InternalCrySL.g:2621:5: ()
                    	    // InternalCrySL.g:2622:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalCrySL.g:2628:5: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // InternalCrySL.g:2629:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // InternalCrySL.g:2629:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // InternalCrySL.g:2630:7: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	      								"de.darmstadt.tu.crossing.CrySL.MultiplicationOperator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCrySL.g:2647:5: ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    // InternalCrySL.g:2648:6: (lv_rightExpression_4_0= ruleOperand )
                    	    {
                    	    // InternalCrySL.g:2648:6: (lv_rightExpression_4_0= ruleOperand )
                    	    // InternalCrySL.g:2649:7: lv_rightExpression_4_0= ruleOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
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
                    	      								"de.darmstadt.tu.crossing.CrySL.Operand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
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
    // InternalCrySL.g:2672:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // InternalCrySL.g:2672:63: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // InternalCrySL.g:2673:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
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
    // InternalCrySL.g:2679:1: ruleMultiplicationOperator returns [EObject current=null] : ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token lv_TIMES_0_0=null;
        Token lv_DIVIDE_1_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:2685:2: ( ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) )
            // InternalCrySL.g:2686:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            {
            // InternalCrySL.g:2686:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            else if ( (LA52_0==46) ) {
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
                    // InternalCrySL.g:2687:3: ( (lv_TIMES_0_0= '*' ) )
                    {
                    // InternalCrySL.g:2687:3: ( (lv_TIMES_0_0= '*' ) )
                    // InternalCrySL.g:2688:4: (lv_TIMES_0_0= '*' )
                    {
                    // InternalCrySL.g:2688:4: (lv_TIMES_0_0= '*' )
                    // InternalCrySL.g:2689:5: lv_TIMES_0_0= '*'
                    {
                    lv_TIMES_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:2702:3: ( (lv_DIVIDE_1_0= '/' ) )
                    {
                    // InternalCrySL.g:2702:3: ( (lv_DIVIDE_1_0= '/' ) )
                    // InternalCrySL.g:2703:4: (lv_DIVIDE_1_0= '/' )
                    {
                    // InternalCrySL.g:2703:4: (lv_DIVIDE_1_0= '/' )
                    // InternalCrySL.g:2704:5: lv_DIVIDE_1_0= '/'
                    {
                    lv_DIVIDE_1_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:2720:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // InternalCrySL.g:2720:59: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // InternalCrySL.g:2721:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
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
    // InternalCrySL.g:2727:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2733:2: ( ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) )
            // InternalCrySL.g:2734:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            {
            // InternalCrySL.g:2734:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // InternalCrySL.g:2735:3: () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // InternalCrySL.g:2735:3: ()
            // InternalCrySL.g:2736:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnaryPreExpressionAccess().getUnaryPreExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:2742:3: ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // InternalCrySL.g:2743:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // InternalCrySL.g:2743:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // InternalCrySL.g:2744:5: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // InternalCrySL.g:2744:5: (lv_operator_1_0= ruleUnaryPreOperator )
            // InternalCrySL.g:2745:6: lv_operator_1_0= ruleUnaryPreOperator
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_13);
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
              							"de.darmstadt.tu.crossing.CrySL.UnaryPreOperator");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCrySL.g:2762:4: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // InternalCrySL.g:2763:5: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // InternalCrySL.g:2763:5: (lv_enclosedExpression_2_0= ruleOperand )
            // InternalCrySL.g:2764:6: lv_enclosedExpression_2_0= ruleOperand
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
              							"de.darmstadt.tu.crossing.CrySL.Operand");
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
    // InternalCrySL.g:2786:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalCrySL.g:2786:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalCrySL.g:2787:2: iv_ruleOperand= ruleOperand EOF
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
    // InternalCrySL.g:2793:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Constraint_1 = null;

        EObject this_Cons_3 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2799:2: ( ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) )
            // InternalCrySL.g:2800:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            {
            // InternalCrySL.g:2800:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_INT)||LA53_0==47||(LA53_0>=50 && LA53_0<=54)||(LA53_0>=56 && LA53_0<=57)||(LA53_0>=64 && LA53_0<=68)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalCrySL.g:2801:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    {
                    // InternalCrySL.g:2801:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    // InternalCrySL.g:2802:4: otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_43);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Constraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:2820:3: this_Cons_3= ruleCons
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
    // InternalCrySL.g:2832:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalCrySL.g:2832:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalCrySL.g:2833:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalCrySL.g:2839:1: ruleLiteralExpression returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject this_PreDefinedPredicates_2 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2845:2: ( ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) )
            // InternalCrySL.g:2846:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            {
            // InternalCrySL.g:2846:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            int alt54=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 56:
            case 57:
                {
                alt54=1;
                }
                break;
            case RULE_ID:
                {
                alt54=2;
                }
                break;
            case 47:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalCrySL.g:2847:3: ( (lv_name_0_0= ruleLiteral ) )
                    {
                    // InternalCrySL.g:2847:3: ( (lv_name_0_0= ruleLiteral ) )
                    // InternalCrySL.g:2848:4: (lv_name_0_0= ruleLiteral )
                    {
                    // InternalCrySL.g:2848:4: (lv_name_0_0= ruleLiteral )
                    // InternalCrySL.g:2849:5: lv_name_0_0= ruleLiteral
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
                      						"de.darmstadt.tu.crossing.CrySL.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:2867:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    {
                    // InternalCrySL.g:2867:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    // InternalCrySL.g:2868:4: (lv_name_1_0= ruleAggregateExpression )
                    {
                    // InternalCrySL.g:2868:4: (lv_name_1_0= ruleAggregateExpression )
                    // InternalCrySL.g:2869:5: lv_name_1_0= ruleAggregateExpression
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
                      						"de.darmstadt.tu.crossing.CrySL.AggregateExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCrySL.g:2887:3: this_PreDefinedPredicates_2= rulePreDefinedPredicates
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
    // InternalCrySL.g:2899:1: entryRulePreDefinedPredicates returns [EObject current=null] : iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF ;
    public final EObject entryRulePreDefinedPredicates() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedPredicates = null;


        try {
            // InternalCrySL.g:2899:61: (iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF )
            // InternalCrySL.g:2900:2: iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF
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
    // InternalCrySL.g:2906:1: rulePreDefinedPredicates returns [EObject current=null] : ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) ) ;
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
        Token lv_predName_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_predName_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_type_4_0 = null;

        EObject lv_type_26_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:2912:2: ( ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) ) )
            // InternalCrySL.g:2913:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) )
            {
            // InternalCrySL.g:2913:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt61=1;
                }
                break;
            case 50:
                {
                alt61=2;
                }
                break;
            case 51:
                {
                alt61=3;
                }
                break;
            case 52:
                {
                alt61=4;
                }
                break;
            case 53:
                {
                alt61=5;
                }
                break;
            case 54:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalCrySL.g:2914:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' )
                    {
                    // InternalCrySL.g:2914:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' )
                    // InternalCrySL.g:2915:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']'
                    {
                    // InternalCrySL.g:2915:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==47) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalCrySL.g:2916:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    {
                    	    // InternalCrySL.g:2916:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    // InternalCrySL.g:2917:6: lv_predName_0_0= 'neverTypeOf'
                    	    {
                    	    lv_predName_0_0=(Token)match(input,47,FOLLOW_52); if (state.failed) return current;
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    otherlv_1=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalCrySL.g:2933:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrySL.g:2934:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrySL.g:2934:5: (otherlv_2= RULE_ID )
                    // InternalCrySL.g:2935:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_0_2_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPreDefinedPredicatesAccess().getCommaKeyword_0_3());
                      			
                    }
                    // InternalCrySL.g:2950:4: ( (lv_type_4_0= ruleJvmType ) )
                    // InternalCrySL.g:2951:5: (lv_type_4_0= ruleJvmType )
                    {
                    // InternalCrySL.g:2951:5: (lv_type_4_0= ruleJvmType )
                    // InternalCrySL.g:2952:6: lv_type_4_0= ruleJvmType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreDefinedPredicatesAccess().getTypeJvmTypeParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_type_4_0=ruleJvmType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_4_0,
                      							"de.darmstadt.tu.crossing.CrySL.JvmType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:2975:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' )
                    {
                    // InternalCrySL.g:2975:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' )
                    // InternalCrySL.g:2976:4: ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']'
                    {
                    // InternalCrySL.g:2976:4: ( (lv_predName_6_0= 'noCallTo' ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==50) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalCrySL.g:2977:5: (lv_predName_6_0= 'noCallTo' )
                    	    {
                    	    // InternalCrySL.g:2977:5: (lv_predName_6_0= 'noCallTo' )
                    	    // InternalCrySL.g:2978:6: lv_predName_6_0= 'noCallTo'
                    	    {
                    	    lv_predName_6_0=(Token)match(input,50,FOLLOW_55); if (state.failed) return current;
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
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    otherlv_7=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalCrySL.g:2994:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCrySL.g:2995:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCrySL.g:2995:5: (otherlv_8= RULE_ID )
                    // InternalCrySL.g:2996:6: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCrySL.g:3013:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' )
                    {
                    // InternalCrySL.g:3013:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' )
                    // InternalCrySL.g:3014:4: ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']'
                    {
                    // InternalCrySL.g:3014:4: ( (lv_predName_10_0= 'callTo' ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==51) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalCrySL.g:3015:5: (lv_predName_10_0= 'callTo' )
                    	    {
                    	    // InternalCrySL.g:3015:5: (lv_predName_10_0= 'callTo' )
                    	    // InternalCrySL.g:3016:6: lv_predName_10_0= 'callTo'
                    	    {
                    	    lv_predName_10_0=(Token)match(input,51,FOLLOW_56); if (state.failed) return current;
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
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    otherlv_11=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_2_1());
                      			
                    }
                    // InternalCrySL.g:3032:4: ( (otherlv_12= RULE_ID ) )
                    // InternalCrySL.g:3033:5: (otherlv_12= RULE_ID )
                    {
                    // InternalCrySL.g:3033:5: (otherlv_12= RULE_ID )
                    // InternalCrySL.g:3034:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_2_2_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCrySL.g:3051:3: ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' )
                    {
                    // InternalCrySL.g:3051:3: ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' )
                    // InternalCrySL.g:3052:4: ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']'
                    {
                    // InternalCrySL.g:3052:4: ( (lv_predName_14_0= 'notHardCoded' ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==52) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalCrySL.g:3053:5: (lv_predName_14_0= 'notHardCoded' )
                    	    {
                    	    // InternalCrySL.g:3053:5: (lv_predName_14_0= 'notHardCoded' )
                    	    // InternalCrySL.g:3054:6: lv_predName_14_0= 'notHardCoded'
                    	    {
                    	    lv_predName_14_0=(Token)match(input,52,FOLLOW_57); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_14_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNotHardCodedKeyword_3_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_14_0, "notHardCoded");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_15=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_3_1());
                      			
                    }
                    // InternalCrySL.g:3070:4: ( (otherlv_16= RULE_ID ) )
                    // InternalCrySL.g:3071:5: (otherlv_16= RULE_ID )
                    {
                    // InternalCrySL.g:3071:5: (otherlv_16= RULE_ID )
                    // InternalCrySL.g:3072:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCrySL.g:3089:3: ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' )
                    {
                    // InternalCrySL.g:3089:3: ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' )
                    // InternalCrySL.g:3090:4: ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']'
                    {
                    // InternalCrySL.g:3090:4: ( (lv_predName_18_0= 'length' ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==53) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalCrySL.g:3091:5: (lv_predName_18_0= 'length' )
                    	    {
                    	    // InternalCrySL.g:3091:5: (lv_predName_18_0= 'length' )
                    	    // InternalCrySL.g:3092:6: lv_predName_18_0= 'length'
                    	    {
                    	    lv_predName_18_0=(Token)match(input,53,FOLLOW_58); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_18_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameLengthKeyword_4_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_18_0, "length");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_19=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalCrySL.g:3108:4: ( (otherlv_20= RULE_ID ) )
                    // InternalCrySL.g:3109:5: (otherlv_20= RULE_ID )
                    {
                    // InternalCrySL.g:3109:5: (otherlv_20= RULE_ID )
                    // InternalCrySL.g:3110:6: otherlv_20= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_4_2_0());
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCrySL.g:3127:3: ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' )
                    {
                    // InternalCrySL.g:3127:3: ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' )
                    // InternalCrySL.g:3128:4: ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']'
                    {
                    // InternalCrySL.g:3128:4: ( (lv_predName_22_0= 'instanceOf' ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==54) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalCrySL.g:3129:5: (lv_predName_22_0= 'instanceOf' )
                    	    {
                    	    // InternalCrySL.g:3129:5: (lv_predName_22_0= 'instanceOf' )
                    	    // InternalCrySL.g:3130:6: lv_predName_22_0= 'instanceOf'
                    	    {
                    	    lv_predName_22_0=(Token)match(input,54,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_22_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameInstanceOfKeyword_5_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_22_0, "instanceOf");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    otherlv_23=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_5_1());
                      			
                    }
                    // InternalCrySL.g:3146:4: ( (otherlv_24= RULE_ID ) )
                    // InternalCrySL.g:3147:5: (otherlv_24= RULE_ID )
                    {
                    // InternalCrySL.g:3147:5: (otherlv_24= RULE_ID )
                    // InternalCrySL.g:3148:6: otherlv_24= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_5_2_0());
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getPreDefinedPredicatesAccess().getCommaKeyword_5_3());
                      			
                    }
                    // InternalCrySL.g:3163:4: ( (lv_type_26_0= ruleJvmType ) )
                    // InternalCrySL.g:3164:5: (lv_type_26_0= ruleJvmType )
                    {
                    // InternalCrySL.g:3164:5: (lv_type_26_0= ruleJvmType )
                    // InternalCrySL.g:3165:6: lv_type_26_0= ruleJvmType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreDefinedPredicatesAccess().getTypeJvmTypeParserRuleCall_5_4_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_type_26_0=ruleJvmType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_26_0,
                      							"de.darmstadt.tu.crossing.CrySL.JvmType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_5_5());
                      			
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


    // $ANTLR start "entryRuleJvmType"
    // InternalCrySL.g:3191:1: entryRuleJvmType returns [EObject current=null] : iv_ruleJvmType= ruleJvmType EOF ;
    public final EObject entryRuleJvmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmType = null;


        try {
            // InternalCrySL.g:3191:48: (iv_ruleJvmType= ruleJvmType EOF )
            // InternalCrySL.g:3192:2: iv_ruleJvmType= ruleJvmType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmType=ruleJvmType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmType; 
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
    // $ANTLR end "entryRuleJvmType"


    // $ANTLR start "ruleJvmType"
    // InternalCrySL.g:3198:1: ruleJvmType returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleJvmType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCrySL.g:3204:2: ( ( ( ruleQualifiedName ) ) )
            // InternalCrySL.g:3205:2: ( ( ruleQualifiedName ) )
            {
            // InternalCrySL.g:3205:2: ( ( ruleQualifiedName ) )
            // InternalCrySL.g:3206:3: ( ruleQualifiedName )
            {
            // InternalCrySL.g:3206:3: ( ruleQualifiedName )
            // InternalCrySL.g:3207:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getJvmTypeRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJvmTypeAccess().getTypeJvmTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleJvmType"


    // $ANTLR start "entryRuleAggregateExpression"
    // InternalCrySL.g:3224:1: entryRuleAggregateExpression returns [EObject current=null] : iv_ruleAggregateExpression= ruleAggregateExpression EOF ;
    public final EObject entryRuleAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateExpression = null;


        try {
            // InternalCrySL.g:3224:60: (iv_ruleAggregateExpression= ruleAggregateExpression EOF )
            // InternalCrySL.g:3225:2: iv_ruleAggregateExpression= ruleAggregateExpression EOF
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
    // InternalCrySL.g:3231:1: ruleAggregateExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) ;
    public final EObject ruleAggregateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCrySL.g:3237:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) )
            // InternalCrySL.g:3238:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            {
            // InternalCrySL.g:3238:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            // InternalCrySL.g:3239:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )?
            {
            // InternalCrySL.g:3239:3: ( (otherlv_0= RULE_ID ) )
            // InternalCrySL.g:3240:4: (otherlv_0= RULE_ID )
            {
            // InternalCrySL.g:3240:4: (otherlv_0= RULE_ID )
            // InternalCrySL.g:3241:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAggregateExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAggregateExpressionAccess().getValueSuperTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalCrySL.g:3252:3: (otherlv_1= '.' this_ID_2= RULE_ID )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==32) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCrySL.g:3253:4: otherlv_1= '.' this_ID_2= RULE_ID
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
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
    // InternalCrySL.g:3266:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalCrySL.g:3266:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalCrySL.g:3267:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalCrySL.g:3273:1: ruleLiteral returns [EObject current=null] : ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_1 = null;

        AntlrDatatypeRuleToken lv_val_1_2 = null;

        AntlrDatatypeRuleToken lv_val_1_3 = null;



        	enterRule();

        try {
            // InternalCrySL.g:3279:2: ( ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) ) )
            // InternalCrySL.g:3280:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) )
            {
            // InternalCrySL.g:3280:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) )
            // InternalCrySL.g:3281:3: () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) )
            {
            // InternalCrySL.g:3281:3: ()
            // InternalCrySL.g:3282:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralAccess().getLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:3288:3: ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) )
            // InternalCrySL.g:3289:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) )
            {
            // InternalCrySL.g:3289:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) )
            // InternalCrySL.g:3290:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral )
            {
            // InternalCrySL.g:3290:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral )
            int alt63=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt63=1;
                }
                break;
            case RULE_INT:
                {
                alt63=2;
                }
                break;
            case 56:
            case 57:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalCrySL.g:3291:6: lv_val_1_1= ruleStringLiteral
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
                      							"de.darmstadt.tu.crossing.CrySL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCrySL.g:3307:6: lv_val_1_2= ruleIntegerLiteral
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
                      							"de.darmstadt.tu.crossing.CrySL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalCrySL.g:3323:6: lv_val_1_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValBooleanLiteralParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_3,
                      							"de.darmstadt.tu.crossing.CrySL.BooleanLiteral");
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
    // InternalCrySL.g:3345:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalCrySL.g:3345:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCrySL.g:3346:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalCrySL.g:3352:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:3358:2: (this_STRING_0= RULE_STRING )
            // InternalCrySL.g:3359:2: this_STRING_0= RULE_STRING
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
    // InternalCrySL.g:3369:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // InternalCrySL.g:3369:54: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalCrySL.g:3370:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalCrySL.g:3376:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalCrySL.g:3382:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) )
            // InternalCrySL.g:3383:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            {
            // InternalCrySL.g:3383:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==EOF||(LA64_1>=13 && LA64_1<=14)||(LA64_1>=23 && LA64_1<=25)||LA64_1==29||LA64_1==31||(LA64_1>=39 && LA64_1<=46)||LA64_1==49||(LA64_1>=59 && LA64_1<=61)||LA64_1==63) ) {
                    alt64=1;
                }
                else if ( (LA64_1==55) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalCrySL.g:3384:3: this_INT_0= RULE_INT
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
                    // InternalCrySL.g:3392:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    {
                    // InternalCrySL.g:3392:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    // InternalCrySL.g:3393:4: this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,55,FOLLOW_62); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalCrySL.g:3417:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalCrySL.g:3417:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalCrySL.g:3418:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalCrySL.g:3424:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCrySL.g:3430:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCrySL.g:3431:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCrySL.g:3431:2: (kw= 'true' | kw= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            else if ( (LA65_0==57) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalCrySL.g:3432:3: kw= 'true'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCrySL.g:3438:3: kw= 'false'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleUnaryPreOperator"
    // InternalCrySL.g:3447:1: entryRuleUnaryPreOperator returns [EObject current=null] : iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF ;
    public final EObject entryRuleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreOperator = null;


        try {
            // InternalCrySL.g:3447:57: (iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF )
            // InternalCrySL.g:3448:2: iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF
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
    // InternalCrySL.g:3454:1: ruleUnaryPreOperator returns [EObject current=null] : ( (lv_NOT_0_0= '!' ) ) ;
    public final EObject ruleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        Token lv_NOT_0_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:3460:2: ( ( (lv_NOT_0_0= '!' ) ) )
            // InternalCrySL.g:3461:2: ( (lv_NOT_0_0= '!' ) )
            {
            // InternalCrySL.g:3461:2: ( (lv_NOT_0_0= '!' ) )
            // InternalCrySL.g:3462:3: (lv_NOT_0_0= '!' )
            {
            // InternalCrySL.g:3462:3: (lv_NOT_0_0= '!' )
            // InternalCrySL.g:3463:4: lv_NOT_0_0= '!'
            {
            lv_NOT_0_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:3478:1: entryRuleComparingEQNEQOperator returns [EObject current=null] : iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF ;
    public final EObject entryRuleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingEQNEQOperator = null;


        try {
            // InternalCrySL.g:3478:63: (iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF )
            // InternalCrySL.g:3479:2: iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF
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
    // InternalCrySL.g:3485:1: ruleComparingEQNEQOperator returns [EObject current=null] : ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) ;
    public final EObject ruleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        Token lv_EQUAL_0_0=null;
        Token lv_UNEQUAL_1_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:3491:2: ( ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) )
            // InternalCrySL.g:3492:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            {
            // InternalCrySL.g:3492:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            else if ( (LA66_0==60) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalCrySL.g:3493:3: ( (lv_EQUAL_0_0= '==' ) )
                    {
                    // InternalCrySL.g:3493:3: ( (lv_EQUAL_0_0= '==' ) )
                    // InternalCrySL.g:3494:4: (lv_EQUAL_0_0= '==' )
                    {
                    // InternalCrySL.g:3494:4: (lv_EQUAL_0_0= '==' )
                    // InternalCrySL.g:3495:5: lv_EQUAL_0_0= '=='
                    {
                    lv_EQUAL_0_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
                    // InternalCrySL.g:3508:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    {
                    // InternalCrySL.g:3508:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    // InternalCrySL.g:3509:4: (lv_UNEQUAL_1_0= '!=' )
                    {
                    // InternalCrySL.g:3509:4: (lv_UNEQUAL_1_0= '!=' )
                    // InternalCrySL.g:3510:5: lv_UNEQUAL_1_0= '!='
                    {
                    lv_UNEQUAL_1_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:3526:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalCrySL.g:3526:45: (iv_ruleCons= ruleCons EOF )
            // InternalCrySL.g:3527:2: iv_ruleCons= ruleCons EOF
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
    // InternalCrySL.g:3533:1: ruleCons returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) ) ;
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
            // InternalCrySL.g:3539:2: ( ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) ) )
            // InternalCrySL.g:3540:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )
            {
            // InternalCrySL.g:3540:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // InternalCrySL.g:3541:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                    {
                    // InternalCrySL.g:3541:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                    // InternalCrySL.g:3542:4: ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}'
                    {
                    // InternalCrySL.g:3542:4: ( (lv_cons_0_0= ruleArrayElements ) )
                    // InternalCrySL.g:3543:5: (lv_cons_0_0= ruleArrayElements )
                    {
                    // InternalCrySL.g:3543:5: (lv_cons_0_0= ruleArrayElements )
                    // InternalCrySL.g:3544:6: lv_cons_0_0= ruleArrayElements
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsAccess().getConsArrayElementsParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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
                      							"de.darmstadt.tu.crossing.CrySL.ArrayElements");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,61,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConsAccess().getInKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,62,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConsAccess().getLeftCurlyBracketKeyword_0_2());
                      			
                    }
                    // InternalCrySL.g:3569:4: ( (lv_litsleft_3_0= ruleLitList ) )
                    // InternalCrySL.g:3570:5: (lv_litsleft_3_0= ruleLitList )
                    {
                    // InternalCrySL.g:3570:5: (lv_litsleft_3_0= ruleLitList )
                    // InternalCrySL.g:3571:6: lv_litsleft_3_0= ruleLitList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsAccess().getLitsleftLitListParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
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
                      							"de.darmstadt.tu.crossing.CrySL.LitList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:3594:3: ( (lv_cons_5_0= ruleLiteralExpression ) )
                    {
                    // InternalCrySL.g:3594:3: ( (lv_cons_5_0= ruleLiteralExpression ) )
                    // InternalCrySL.g:3595:4: (lv_cons_5_0= ruleLiteralExpression )
                    {
                    // InternalCrySL.g:3595:4: (lv_cons_5_0= ruleLiteralExpression )
                    // InternalCrySL.g:3596:5: lv_cons_5_0= ruleLiteralExpression
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
                      						"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
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
    // InternalCrySL.g:3617:1: entryRuleArrayElements returns [EObject current=null] : iv_ruleArrayElements= ruleArrayElements EOF ;
    public final EObject entryRuleArrayElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayElements = null;


        try {
            // InternalCrySL.g:3617:54: (iv_ruleArrayElements= ruleArrayElements EOF )
            // InternalCrySL.g:3618:2: iv_ruleArrayElements= ruleArrayElements EOF
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
    // InternalCrySL.g:3624:1: ruleArrayElements returns [EObject current=null] : ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) ;
    public final EObject ruleArrayElements() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_2=null;
        EObject lv_cons_1_0 = null;

        EObject lv_cons_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:3630:2: ( ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) )
            // InternalCrySL.g:3631:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            {
            // InternalCrySL.g:3631:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==64) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||LA68_0==47||(LA68_0>=50 && LA68_0<=54)||(LA68_0>=56 && LA68_0<=57)||(LA68_0>=65 && LA68_0<=68)) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalCrySL.g:3632:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    {
                    // InternalCrySL.g:3632:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    // InternalCrySL.g:3633:4: ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')'
                    {
                    // InternalCrySL.g:3633:4: ( (lv_el_0_0= 'elements(' ) )
                    // InternalCrySL.g:3634:5: (lv_el_0_0= 'elements(' )
                    {
                    // InternalCrySL.g:3634:5: (lv_el_0_0= 'elements(' )
                    // InternalCrySL.g:3635:6: lv_el_0_0= 'elements('
                    {
                    lv_el_0_0=(Token)match(input,64,FOLLOW_67); if (state.failed) return current;
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

                    // InternalCrySL.g:3647:4: ( (lv_cons_1_0= ruleConsPred ) )
                    // InternalCrySL.g:3648:5: (lv_cons_1_0= ruleConsPred )
                    {
                    // InternalCrySL.g:3648:5: (lv_cons_1_0= ruleConsPred )
                    // InternalCrySL.g:3649:6: lv_cons_1_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayElementsAccess().getConsConsPredParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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
                      							"de.darmstadt.tu.crossing.CrySL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayElementsAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:3672:3: ( (lv_cons_3_0= ruleConsPred ) )
                    {
                    // InternalCrySL.g:3672:3: ( (lv_cons_3_0= ruleConsPred ) )
                    // InternalCrySL.g:3673:4: (lv_cons_3_0= ruleConsPred )
                    {
                    // InternalCrySL.g:3673:4: (lv_cons_3_0= ruleConsPred )
                    // InternalCrySL.g:3674:5: lv_cons_3_0= ruleConsPred
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
                      						"de.darmstadt.tu.crossing.CrySL.ConsPred");
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
    // InternalCrySL.g:3695:1: entryRuleConsPred returns [EObject current=null] : iv_ruleConsPred= ruleConsPred EOF ;
    public final EObject entryRuleConsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsPred = null;


        try {
            // InternalCrySL.g:3695:49: (iv_ruleConsPred= ruleConsPred EOF )
            // InternalCrySL.g:3696:2: iv_ruleConsPred= ruleConsPred EOF
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
    // InternalCrySL.g:3702:1: ruleConsPred returns [EObject current=null] : ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleConsPred() throws RecognitionException {
        EObject current = null;

        Token lv_consPred_0_0=null;
        Token otherlv_2=null;
        Token lv_consPred_3_0=null;
        Token otherlv_5=null;
        Token lv_consPred_6_0=null;
        Token otherlv_8=null;
        Token lv_part_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_lit_1_0 = null;

        EObject lv_lit_4_0 = null;

        EObject lv_lit_7_0 = null;

        AntlrDatatypeRuleToken lv_ind_10_0 = null;

        AntlrDatatypeRuleToken lv_split_12_0 = null;

        EObject lv_lit_14_0 = null;

        EObject lv_lit_16_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:3708:2: ( ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) ) )
            // InternalCrySL.g:3709:2: ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) )
            {
            // InternalCrySL.g:3709:2: ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 65:
            case 66:
            case 67:
                {
                alt70=1;
                }
                break;
            case 68:
                {
                alt70=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 47:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalCrySL.g:3710:3: ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) )
                    {
                    // InternalCrySL.g:3710:3: ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case 65:
                        {
                        alt69=1;
                        }
                        break;
                    case 66:
                        {
                        alt69=2;
                        }
                        break;
                    case 67:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // InternalCrySL.g:3711:4: ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' )
                            {
                            // InternalCrySL.g:3711:4: ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' )
                            // InternalCrySL.g:3712:5: ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')'
                            {
                            // InternalCrySL.g:3712:5: ( (lv_consPred_0_0= 'alg(' ) )
                            // InternalCrySL.g:3713:6: (lv_consPred_0_0= 'alg(' )
                            {
                            // InternalCrySL.g:3713:6: (lv_consPred_0_0= 'alg(' )
                            // InternalCrySL.g:3714:7: lv_consPred_0_0= 'alg('
                            {
                            lv_consPred_0_0=(Token)match(input,65,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_0_0, grammarAccess.getConsPredAccess().getConsPredAlgKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_0_0, "alg(");
                              						
                            }

                            }


                            }

                            // InternalCrySL.g:3726:5: ( (lv_lit_1_0= ruleLiteralExpression ) )
                            // InternalCrySL.g:3727:6: (lv_lit_1_0= ruleLiteralExpression )
                            {
                            // InternalCrySL.g:3727:6: (lv_lit_1_0= ruleLiteralExpression )
                            // InternalCrySL.g:3728:7: lv_lit_1_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_lit_1_0=ruleLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConsPredRule());
                              							}
                              							set(
                              								current,
                              								"lit",
                              								lv_lit_1_0,
                              								"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_0_2());
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalCrySL.g:3751:4: ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' )
                            {
                            // InternalCrySL.g:3751:4: ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' )
                            // InternalCrySL.g:3752:5: ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')'
                            {
                            // InternalCrySL.g:3752:5: ( (lv_consPred_3_0= 'mode(' ) )
                            // InternalCrySL.g:3753:6: (lv_consPred_3_0= 'mode(' )
                            {
                            // InternalCrySL.g:3753:6: (lv_consPred_3_0= 'mode(' )
                            // InternalCrySL.g:3754:7: lv_consPred_3_0= 'mode('
                            {
                            lv_consPred_3_0=(Token)match(input,66,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_3_0, grammarAccess.getConsPredAccess().getConsPredModeKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_3_0, "mode(");
                              						
                            }

                            }


                            }

                            // InternalCrySL.g:3766:5: ( (lv_lit_4_0= ruleLiteralExpression ) )
                            // InternalCrySL.g:3767:6: (lv_lit_4_0= ruleLiteralExpression )
                            {
                            // InternalCrySL.g:3767:6: (lv_lit_4_0= ruleLiteralExpression )
                            // InternalCrySL.g:3768:7: lv_lit_4_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_lit_4_0=ruleLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConsPredRule());
                              							}
                              							set(
                              								current,
                              								"lit",
                              								lv_lit_4_0,
                              								"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_1_2());
                              				
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalCrySL.g:3791:4: ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' )
                            {
                            // InternalCrySL.g:3791:4: ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' )
                            // InternalCrySL.g:3792:5: ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')'
                            {
                            // InternalCrySL.g:3792:5: ( (lv_consPred_6_0= 'pad(' ) )
                            // InternalCrySL.g:3793:6: (lv_consPred_6_0= 'pad(' )
                            {
                            // InternalCrySL.g:3793:6: (lv_consPred_6_0= 'pad(' )
                            // InternalCrySL.g:3794:7: lv_consPred_6_0= 'pad('
                            {
                            lv_consPred_6_0=(Token)match(input,67,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_6_0, grammarAccess.getConsPredAccess().getConsPredPadKeyword_0_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_6_0, "pad(");
                              						
                            }

                            }


                            }

                            // InternalCrySL.g:3806:5: ( (lv_lit_7_0= ruleLiteralExpression ) )
                            // InternalCrySL.g:3807:6: (lv_lit_7_0= ruleLiteralExpression )
                            {
                            // InternalCrySL.g:3807:6: (lv_lit_7_0= ruleLiteralExpression )
                            // InternalCrySL.g:3808:7: lv_lit_7_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
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
                              								"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_2_2());
                              				
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:3832:3: ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' )
                    {
                    // InternalCrySL.g:3832:3: ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' )
                    // InternalCrySL.g:3833:4: ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')'
                    {
                    // InternalCrySL.g:3833:4: ( (lv_part_9_0= 'part(' ) )
                    // InternalCrySL.g:3834:5: (lv_part_9_0= 'part(' )
                    {
                    // InternalCrySL.g:3834:5: (lv_part_9_0= 'part(' )
                    // InternalCrySL.g:3835:6: lv_part_9_0= 'part('
                    {
                    lv_part_9_0=(Token)match(input,68,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_part_9_0, grammarAccess.getConsPredAccess().getPartPartKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConsPredRule());
                      						}
                      						setWithLastConsumed(current, "part", lv_part_9_0, "part(");
                      					
                    }

                    }


                    }

                    // InternalCrySL.g:3847:4: ( (lv_ind_10_0= ruleIntegerLiteral ) )
                    // InternalCrySL.g:3848:5: (lv_ind_10_0= ruleIntegerLiteral )
                    {
                    // InternalCrySL.g:3848:5: (lv_ind_10_0= ruleIntegerLiteral )
                    // InternalCrySL.g:3849:6: lv_ind_10_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getIndIntegerLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_ind_10_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"ind",
                      							lv_ind_10_0,
                      							"de.darmstadt.tu.crossing.CrySL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConsPredAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalCrySL.g:3870:4: ( (lv_split_12_0= ruleStringLiteral ) )
                    // InternalCrySL.g:3871:5: (lv_split_12_0= ruleStringLiteral )
                    {
                    // InternalCrySL.g:3871:5: (lv_split_12_0= ruleStringLiteral )
                    // InternalCrySL.g:3872:6: lv_split_12_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getSplitStringLiteralParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_split_12_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"split",
                      							lv_split_12_0,
                      							"de.darmstadt.tu.crossing.CrySL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getConsPredAccess().getCommaKeyword_1_4());
                      			
                    }
                    // InternalCrySL.g:3893:4: ( (lv_lit_14_0= ruleLiteralExpression ) )
                    // InternalCrySL.g:3894:5: (lv_lit_14_0= ruleLiteralExpression )
                    {
                    // InternalCrySL.g:3894:5: (lv_lit_14_0= ruleLiteralExpression )
                    // InternalCrySL.g:3895:6: lv_lit_14_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_lit_14_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"lit",
                      							lv_lit_14_0,
                      							"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCrySL.g:3918:3: ( (lv_lit_16_0= ruleLiteralExpression ) )
                    {
                    // InternalCrySL.g:3918:3: ( (lv_lit_16_0= ruleLiteralExpression ) )
                    // InternalCrySL.g:3919:4: (lv_lit_16_0= ruleLiteralExpression )
                    {
                    // InternalCrySL.g:3919:4: (lv_lit_16_0= ruleLiteralExpression )
                    // InternalCrySL.g:3920:5: lv_lit_16_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_16_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConsPredRule());
                      					}
                      					set(
                      						current,
                      						"lit",
                      						lv_lit_16_0,
                      						"de.darmstadt.tu.crossing.CrySL.LiteralExpression");
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
    // InternalCrySL.g:3941:1: entryRuleLitList returns [EObject current=null] : iv_ruleLitList= ruleLitList EOF ;
    public final EObject entryRuleLitList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitList = null;


        try {
            // InternalCrySL.g:3941:48: (iv_ruleLitList= ruleLitList EOF )
            // InternalCrySL.g:3942:2: iv_ruleLitList= ruleLitList EOF
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
    // InternalCrySL.g:3948:1: ruleLitList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) ;
    public final EObject ruleLitList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:3954:2: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) )
            // InternalCrySL.g:3955:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            {
            // InternalCrySL.g:3955:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            // InternalCrySL.g:3956:3: ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            {
            // InternalCrySL.g:3956:3: ( (lv_parameters_0_0= ruleLiteral ) )
            // InternalCrySL.g:3957:4: (lv_parameters_0_0= ruleLiteral )
            {
            // InternalCrySL.g:3957:4: (lv_parameters_0_0= ruleLiteral )
            // InternalCrySL.g:3958:5: lv_parameters_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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
              						"de.darmstadt.tu.crossing.CrySL.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:3975:3: (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==25) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalCrySL.g:3976:4: otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLitListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCrySL.g:3980:4: ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_INT)||(LA71_0>=56 && LA71_0<=57)) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==69) ) {
            	        alt71=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalCrySL.g:3981:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            {
            	            // InternalCrySL.g:3981:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            // InternalCrySL.g:3982:6: (lv_parameters_2_0= ruleLiteral )
            	            {
            	            // InternalCrySL.g:3982:6: (lv_parameters_2_0= ruleLiteral )
            	            // InternalCrySL.g:3983:7: lv_parameters_2_0= ruleLiteral
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_36);
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
            	              								"de.darmstadt.tu.crossing.CrySL.Literal");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCrySL.g:4001:5: otherlv_3= '...'
            	            {
            	            otherlv_3=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getLitListAccess().getFullStopFullStopFullStopKeyword_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalCrySL.g:4011:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // InternalCrySL.g:4011:45: (iv_rulePred= rulePred EOF )
            // InternalCrySL.g:4012:2: iv_rulePred= rulePred EOF
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
    // InternalCrySL.g:4018:1: rulePred returns [EObject current=null] : ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;

        Token lv_predName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parList_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4024:2: ( ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) )
            // InternalCrySL.g:4025:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            {
            // InternalCrySL.g:4025:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            // InternalCrySL.g:4026:3: ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            {
            // InternalCrySL.g:4026:3: ( (lv_predName_0_0= RULE_ID ) )
            // InternalCrySL.g:4027:4: (lv_predName_0_0= RULE_ID )
            {
            // InternalCrySL.g:4027:4: (lv_predName_0_0= RULE_ID )
            // InternalCrySL.g:4028:5: lv_predName_0_0= RULE_ID
            {
            lv_predName_0_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            // InternalCrySL.g:4044:3: ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==48) ) {
                alt73=1;
            }
            else if ( (LA73_0==12) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalCrySL.g:4045:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    {
                    // InternalCrySL.g:4045:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    // InternalCrySL.g:4046:5: otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPredAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalCrySL.g:4050:5: ( (lv_parList_2_0= ruleSuParList ) )
                    // InternalCrySL.g:4051:6: (lv_parList_2_0= ruleSuParList )
                    {
                    // InternalCrySL.g:4051:6: (lv_parList_2_0= ruleSuParList )
                    // InternalCrySL.g:4052:7: lv_parList_2_0= ruleSuParList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredAccess().getParListSuParListParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
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
                      								"de.darmstadt.tu.crossing.CrySL.SuParList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPredAccess().getRightSquareBracketKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:4075:4: otherlv_4= '[]'
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
    // InternalCrySL.g:4084:1: entryRuleReqPred returns [EObject current=null] : iv_ruleReqPred= ruleReqPred EOF ;
    public final EObject entryRuleReqPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqPred = null;


        try {
            // InternalCrySL.g:4084:48: (iv_ruleReqPred= ruleReqPred EOF )
            // InternalCrySL.g:4085:2: iv_ruleReqPred= ruleReqPred EOF
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
    // InternalCrySL.g:4091:1: ruleReqPred returns [EObject current=null] : (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* ) ;
    public final EObject ruleReqPred() throws RecognitionException {
        EObject current = null;

        EObject this_PredLit_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4097:2: ( (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* ) )
            // InternalCrySL.g:4098:2: (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* )
            {
            // InternalCrySL.g:4098:2: (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* )
            // InternalCrySL.g:4099:3: this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReqPredAccess().getPredLitParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_PredLit_0=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PredLit_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:4107:3: ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==40) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalCrySL.g:4108:4: () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) )
            	    {
            	    // InternalCrySL.g:4108:4: ()
            	    // InternalCrySL.g:4109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getReqPredAccess().getReqPredLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCrySL.g:4115:4: ( (lv_operator_2_0= ruleLogicalOr ) )
            	    // InternalCrySL.g:4116:5: (lv_operator_2_0= ruleLogicalOr )
            	    {
            	    // InternalCrySL.g:4116:5: (lv_operator_2_0= ruleLogicalOr )
            	    // InternalCrySL.g:4117:6: lv_operator_2_0= ruleLogicalOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReqPredAccess().getOperatorLogicalOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLogicalOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReqPredRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CrySL.LogicalOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCrySL.g:4134:4: ( (lv_rightExpression_3_0= rulePredLit ) )
            	    // InternalCrySL.g:4135:5: (lv_rightExpression_3_0= rulePredLit )
            	    {
            	    // InternalCrySL.g:4135:5: (lv_rightExpression_3_0= rulePredLit )
            	    // InternalCrySL.g:4136:6: lv_rightExpression_3_0= rulePredLit
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReqPredAccess().getRightExpressionPredLitParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_rightExpression_3_0=rulePredLit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReqPredRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CrySL.PredLit");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "ruleReqPred"


    // $ANTLR start "entryRulePredLit"
    // InternalCrySL.g:4158:1: entryRulePredLit returns [EObject current=null] : iv_rulePredLit= rulePredLit EOF ;
    public final EObject entryRulePredLit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredLit = null;


        try {
            // InternalCrySL.g:4158:48: (iv_rulePredLit= rulePredLit EOF )
            // InternalCrySL.g:4159:2: iv_rulePredLit= rulePredLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredLit=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredLit; 
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
    // $ANTLR end "entryRulePredLit"


    // $ANTLR start "rulePredLit"
    // InternalCrySL.g:4165:1: rulePredLit returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) ;
    public final EObject rulePredLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        EObject lv_cons_0_0 = null;

        EObject lv_pred_3_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4171:2: ( ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) )
            // InternalCrySL.g:4172:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            {
            // InternalCrySL.g:4172:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            // InternalCrySL.g:4173:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) )
            {
            // InternalCrySL.g:4173:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )?
            int alt75=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==RULE_ID) ) {
                        int LA75_4 = input.LA(3);

                        if ( ((LA75_4>=13 && LA75_4<=14)||LA75_4==29||LA75_4==32||(LA75_4>=39 && LA75_4<=45)||(LA75_4>=59 && LA75_4<=61)) ) {
                            alt75=1;
                        }
                    }
                    else if ( ((LA75_1>=RULE_STRING && LA75_1<=RULE_INT)||LA75_1==30||LA75_1==47||(LA75_1>=50 && LA75_1<=54)||(LA75_1>=56 && LA75_1<=57)||(LA75_1>=64 && LA75_1<=68)) ) {
                        alt75=1;
                    }
                    }
                    break;
                case RULE_STRING:
                case RULE_INT:
                case 30:
                case 47:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 56:
                case 57:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    {
                    alt75=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA75_3 = input.LA(2);

                    if ( ((LA75_3>=13 && LA75_3<=14)||LA75_3==24||LA75_3==29||LA75_3==32||(LA75_3>=39 && LA75_3<=46)||(LA75_3>=59 && LA75_3<=61)) ) {
                        alt75=1;
                    }
                    }
                    break;
            }

            switch (alt75) {
                case 1 :
                    // InternalCrySL.g:4174:4: ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>'
                    {
                    // InternalCrySL.g:4174:4: ( (lv_cons_0_0= ruleConstraint ) )
                    // InternalCrySL.g:4175:5: (lv_cons_0_0= ruleConstraint )
                    {
                    // InternalCrySL.g:4175:5: (lv_cons_0_0= ruleConstraint )
                    // InternalCrySL.g:4176:6: lv_cons_0_0= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredLitAccess().getConsConstraintParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_cons_0_0=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredLitRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_0_0,
                      							"de.darmstadt.tu.crossing.CrySL.Constraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPredLitAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCrySL.g:4198:3: ( (lv_not_2_0= '!' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==58) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalCrySL.g:4199:4: (lv_not_2_0= '!' )
                    {
                    // InternalCrySL.g:4199:4: (lv_not_2_0= '!' )
                    // InternalCrySL.g:4200:5: lv_not_2_0= '!'
                    {
                    lv_not_2_0=(Token)match(input,58,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_2_0, grammarAccess.getPredLitAccess().getNotExclamationMarkKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPredLitRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_2_0, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCrySL.g:4212:3: ( (lv_pred_3_0= rulePred ) )
            // InternalCrySL.g:4213:4: (lv_pred_3_0= rulePred )
            {
            // InternalCrySL.g:4213:4: (lv_pred_3_0= rulePred )
            // InternalCrySL.g:4214:5: lv_pred_3_0= rulePred
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredLitAccess().getPredPredParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pred_3_0=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredLitRule());
              					}
              					set(
              						current,
              						"pred",
              						lv_pred_3_0,
              						"de.darmstadt.tu.crossing.CrySL.Pred");
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
    // $ANTLR end "rulePredLit"


    // $ANTLR start "entryRuleEnsPred"
    // InternalCrySL.g:4235:1: entryRuleEnsPred returns [EObject current=null] : iv_ruleEnsPred= ruleEnsPred EOF ;
    public final EObject entryRuleEnsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsPred = null;


        try {
            // InternalCrySL.g:4235:48: (iv_ruleEnsPred= ruleEnsPred EOF )
            // InternalCrySL.g:4236:2: iv_ruleEnsPred= ruleEnsPred EOF
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
    // InternalCrySL.g:4242:1: ruleEnsPred returns [EObject current=null] : ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleEnsPred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_predLit_0_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4248:2: ( ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalCrySL.g:4249:2: ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalCrySL.g:4249:2: ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCrySL.g:4250:3: ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalCrySL.g:4250:3: ( (lv_predLit_0_0= rulePredLit ) )
            // InternalCrySL.g:4251:4: (lv_predLit_0_0= rulePredLit )
            {
            // InternalCrySL.g:4251:4: (lv_predLit_0_0= rulePredLit )
            // InternalCrySL.g:4252:5: lv_predLit_0_0= rulePredLit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnsPredAccess().getPredLitPredLitParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_predLit_0_0=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnsPredRule());
              					}
              					set(
              						current,
              						"predLit",
              						lv_predLit_0_0,
              						"de.darmstadt.tu.crossing.CrySL.PredLit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:4269:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCrySL.g:4270:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnsPredAccess().getAfterKeyword_1_0());
                      			
                    }
                    // InternalCrySL.g:4274:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCrySL.g:4275:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCrySL.g:4275:5: (otherlv_2= RULE_ID )
                    // InternalCrySL.g:4276:6: otherlv_2= RULE_ID
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
    // InternalCrySL.g:4292:1: entryRuleSuParList returns [EObject current=null] : iv_ruleSuParList= ruleSuParList EOF ;
    public final EObject entryRuleSuParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuParList = null;


        try {
            // InternalCrySL.g:4292:50: (iv_ruleSuParList= ruleSuParList EOF )
            // InternalCrySL.g:4293:2: iv_ruleSuParList= ruleSuParList EOF
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
    // InternalCrySL.g:4299:1: ruleSuParList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) ;
    public final EObject ruleSuParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4305:2: ( ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) )
            // InternalCrySL.g:4306:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            {
            // InternalCrySL.g:4306:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            // InternalCrySL.g:4307:3: ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            {
            // InternalCrySL.g:4307:3: ( (lv_parameters_0_0= ruleSuPar ) )
            // InternalCrySL.g:4308:4: (lv_parameters_0_0= ruleSuPar )
            {
            // InternalCrySL.g:4308:4: (lv_parameters_0_0= ruleSuPar )
            // InternalCrySL.g:4309:5: lv_parameters_0_0= ruleSuPar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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
              						"de.darmstadt.tu.crossing.CrySL.SuPar");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCrySL.g:4326:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==25) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalCrySL.g:4327:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSuParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCrySL.g:4331:4: ( (lv_parameters_2_0= ruleSuPar ) )
            	    // InternalCrySL.g:4332:5: (lv_parameters_2_0= ruleSuPar )
            	    {
            	    // InternalCrySL.g:4332:5: (lv_parameters_2_0= ruleSuPar )
            	    // InternalCrySL.g:4333:6: lv_parameters_2_0= ruleSuPar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	      							"de.darmstadt.tu.crossing.CrySL.SuPar");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // InternalCrySL.g:4355:1: entryRuleSuPar returns [EObject current=null] : iv_ruleSuPar= ruleSuPar EOF ;
    public final EObject entryRuleSuPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuPar = null;


        try {
            // InternalCrySL.g:4355:46: (iv_ruleSuPar= ruleSuPar EOF )
            // InternalCrySL.g:4356:2: iv_ruleSuPar= ruleSuPar EOF
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
    // InternalCrySL.g:4362:1: ruleSuPar returns [EObject current=null] : ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) ;
    public final EObject ruleSuPar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4368:2: ( ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) )
            // InternalCrySL.g:4369:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            {
            // InternalCrySL.g:4369:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            // InternalCrySL.g:4370:3: () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            {
            // InternalCrySL.g:4370:3: ()
            // InternalCrySL.g:4371:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSuParAccess().getSuParAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:4377:3: ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            int alt79=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 47:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt79=1;
                }
                break;
            case 36:
                {
                alt79=2;
                }
                break;
            case 71:
                {
                alt79=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalCrySL.g:4378:4: ( (lv_val_1_0= ruleConsPred ) )
                    {
                    // InternalCrySL.g:4378:4: ( (lv_val_1_0= ruleConsPred ) )
                    // InternalCrySL.g:4379:5: (lv_val_1_0= ruleConsPred )
                    {
                    // InternalCrySL.g:4379:5: (lv_val_1_0= ruleConsPred )
                    // InternalCrySL.g:4380:6: lv_val_1_0= ruleConsPred
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
                      							"de.darmstadt.tu.crossing.CrySL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:4398:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSuParAccess().get_Keyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCrySL.g:4403:4: otherlv_3= 'this'
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:4412:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalCrySL.g:4412:47: (iv_ruleObject= ruleObject EOF )
            // InternalCrySL.g:4413:2: iv_ruleObject= ruleObject EOF
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
    // InternalCrySL.g:4419:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:4425:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCrySL.g:4426:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCrySL.g:4426:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCrySL.g:4427:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCrySL.g:4427:3: ()
            // InternalCrySL.g:4428:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            // InternalCrySL.g:4434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCrySL.g:4435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCrySL.g:4435:4: (lv_name_1_0= RULE_ID )
            // InternalCrySL.g:4436:5: lv_name_1_0= RULE_ID
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
    // InternalCrySL.g:4456:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalCrySL.g:4456:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalCrySL.g:4457:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
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
    // InternalCrySL.g:4463:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4469:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalCrySL.g:4470:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalCrySL.g:4470:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=29 && LA81_0<=30)) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalCrySL.g:4471:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalCrySL.g:4471:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalCrySL.g:4472:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_74);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCrySL.g:4480:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==48) && (synpred1_InternalCrySL())) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalCrySL.g:4481:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalCrySL.g:4487:5: ( () ruleArrayBrackets )
                    	    // InternalCrySL.g:4488:6: () ruleArrayBrackets
                    	    {
                    	    // InternalCrySL.g:4488:6: ()
                    	    // InternalCrySL.g:4489:7: 
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
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:4506:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
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
    // InternalCrySL.g:4518:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalCrySL.g:4518:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalCrySL.g:4519:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
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
    // InternalCrySL.g:4525:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCrySL.g:4531:2: ( (kw= '[' kw= ']' ) )
            // InternalCrySL.g:4532:2: (kw= '[' kw= ']' )
            {
            // InternalCrySL.g:4532:2: (kw= '[' kw= ']' )
            // InternalCrySL.g:4533:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,48,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:4547:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalCrySL.g:4547:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalCrySL.g:4548:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
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
    // InternalCrySL.g:4554:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // InternalCrySL.g:4560:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalCrySL.g:4561:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalCrySL.g:4561:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalCrySL.g:4562:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalCrySL.g:4562:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==30) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalCrySL.g:4563:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalCrySL.g:4567:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||(LA83_0>=29 && LA83_0<=30)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalCrySL.g:4568:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalCrySL.g:4568:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalCrySL.g:4569:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalCrySL.g:4569:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalCrySL.g:4570:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
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

                            // InternalCrySL.g:4587:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==25) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // InternalCrySL.g:4588:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,25,FOLLOW_76); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalCrySL.g:4592:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalCrySL.g:4593:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalCrySL.g:4593:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalCrySL.g:4594:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_30);
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
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalCrySL.g:4622:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalCrySL.g:4623:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalCrySL.g:4623:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalCrySL.g:4624:5: lv_returnType_6_0= ruleJvmTypeReference
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
    // InternalCrySL.g:4645:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalCrySL.g:4645:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalCrySL.g:4646:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
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
    // InternalCrySL.g:4652:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
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
            // InternalCrySL.g:4658:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalCrySL.g:4659:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalCrySL.g:4659:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalCrySL.g:4660:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalCrySL.g:4660:3: ( ( ruleQualifiedName ) )
            // InternalCrySL.g:4661:4: ( ruleQualifiedName )
            {
            // InternalCrySL.g:4661:4: ( ruleQualifiedName )
            // InternalCrySL.g:4662:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
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

            // InternalCrySL.g:4676:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // InternalCrySL.g:4677:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalCrySL.g:4677:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalCrySL.g:4678:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalCrySL.g:4684:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalCrySL.g:4685:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalCrySL.g:4685:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalCrySL.g:4686:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
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

                    // InternalCrySL.g:4703:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==25) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalCrySL.g:4704:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_78); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalCrySL.g:4708:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalCrySL.g:4709:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalCrySL.g:4709:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalCrySL.g:4710:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalCrySL.g:4732:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==32) && (synpred3_InternalCrySL())) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalCrySL.g:4733:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalCrySL.g:4733:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalCrySL.g:4734:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalCrySL.g:4740:6: ( () otherlv_7= '.' )
                    	    // InternalCrySL.g:4741:7: () otherlv_7= '.'
                    	    {
                    	    // InternalCrySL.g:4741:7: ()
                    	    // InternalCrySL.g:4742:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCrySL.g:4754:5: ( ( ruleValidID ) )
                    	    // InternalCrySL.g:4755:6: ( ruleValidID )
                    	    {
                    	    // InternalCrySL.g:4755:6: ( ruleValidID )
                    	    // InternalCrySL.g:4756:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_79);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCrySL.g:4770:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt87=2;
                    	    alt87 = dfa87.predict(input);
                    	    switch (alt87) {
                    	        case 1 :
                    	            // InternalCrySL.g:4771:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalCrySL.g:4771:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalCrySL.g:4772:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,13,FOLLOW_78); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalCrySL.g:4778:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalCrySL.g:4779:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalCrySL.g:4779:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalCrySL.g:4780:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_25);
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

                    	            // InternalCrySL.g:4797:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop86:
                    	            do {
                    	                int alt86=2;
                    	                int LA86_0 = input.LA(1);

                    	                if ( (LA86_0==25) ) {
                    	                    alt86=1;
                    	                }


                    	                switch (alt86) {
                    	            	case 1 :
                    	            	    // InternalCrySL.g:4798:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,25,FOLLOW_78); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalCrySL.g:4802:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalCrySL.g:4803:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalCrySL.g:4803:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalCrySL.g:4804:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_25);
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
                    	            	    break loop86;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,14,FOLLOW_60); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
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
    // InternalCrySL.g:4833:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalCrySL.g:4833:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalCrySL.g:4834:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
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
    // InternalCrySL.g:4840:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4846:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalCrySL.g:4847:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalCrySL.g:4847:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID||(LA90_0>=29 && LA90_0<=30)) ) {
                alt90=1;
            }
            else if ( (LA90_0==26) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalCrySL.g:4848:3: this_JvmTypeReference_0= ruleJvmTypeReference
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
                    // InternalCrySL.g:4857:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
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
    // InternalCrySL.g:4869:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalCrySL.g:4869:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalCrySL.g:4870:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
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
    // InternalCrySL.g:4876:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4882:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalCrySL.g:4883:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalCrySL.g:4883:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalCrySL.g:4884:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalCrySL.g:4884:3: ()
            // InternalCrySL.g:4885:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalCrySL.g:4895:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==72) ) {
                alt93=1;
            }
            else if ( (LA93_0==74) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // InternalCrySL.g:4896:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalCrySL.g:4896:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalCrySL.g:4897:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalCrySL.g:4897:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalCrySL.g:4898:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalCrySL.g:4898:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalCrySL.g:4899:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_81);
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

                    // InternalCrySL.g:4916:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==73) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalCrySL.g:4917:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalCrySL.g:4917:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalCrySL.g:4918:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_81);
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
                    	    break loop91;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCrySL.g:4937:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalCrySL.g:4937:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalCrySL.g:4938:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalCrySL.g:4938:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalCrySL.g:4939:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalCrySL.g:4939:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalCrySL.g:4940:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_81);
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

                    // InternalCrySL.g:4957:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==73) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalCrySL.g:4958:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalCrySL.g:4958:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalCrySL.g:4959:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_81);
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
                    	    break loop92;
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
    // InternalCrySL.g:4982:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalCrySL.g:4982:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalCrySL.g:4983:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
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
    // InternalCrySL.g:4989:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:4995:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCrySL.g:4996:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCrySL.g:4996:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCrySL.g:4997:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalCrySL.g:5001:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCrySL.g:5002:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCrySL.g:5002:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCrySL.g:5003:5: lv_typeReference_1_0= ruleJvmTypeReference
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
    // InternalCrySL.g:5024:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalCrySL.g:5024:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalCrySL.g:5025:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
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
    // InternalCrySL.g:5031:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5037:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCrySL.g:5038:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCrySL.g:5038:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCrySL.g:5039:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCrySL.g:5043:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCrySL.g:5044:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCrySL.g:5044:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCrySL.g:5045:5: lv_typeReference_1_0= ruleJvmTypeReference
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
    // InternalCrySL.g:5066:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalCrySL.g:5066:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalCrySL.g:5067:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
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
    // InternalCrySL.g:5073:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5079:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCrySL.g:5080:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCrySL.g:5080:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCrySL.g:5081:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalCrySL.g:5085:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCrySL.g:5086:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCrySL.g:5086:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCrySL.g:5087:5: lv_typeReference_1_0= ruleJvmTypeReference
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
    // InternalCrySL.g:5108:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalCrySL.g:5108:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalCrySL.g:5109:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
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
    // InternalCrySL.g:5115:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5121:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCrySL.g:5122:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCrySL.g:5122:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCrySL.g:5123:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCrySL.g:5127:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCrySL.g:5128:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCrySL.g:5128:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCrySL.g:5129:5: lv_typeReference_1_0= ruleJvmTypeReference
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
    // InternalCrySL.g:5150:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCrySL.g:5150:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCrySL.g:5151:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCrySL.g:5157:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5163:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalCrySL.g:5164:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalCrySL.g:5164:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalCrySL.g:5165:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCrySL.g:5175:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==32) ) {
                    int LA94_2 = input.LA(2);

                    if ( (LA94_2==RULE_ID) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // InternalCrySL.g:5176:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop94;
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
    // InternalCrySL.g:5196:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCrySL.g:5196:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCrySL.g:5197:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalCrySL.g:5203:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5209:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalCrySL.g:5210:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalCrySL.g:5210:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalCrySL.g:5211:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,32,FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalCrySL.g:5235:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalCrySL.g:5235:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalCrySL.g:5236:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalCrySL.g:5242:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCrySL.g:5248:2: (this_ID_0= RULE_ID )
            // InternalCrySL.g:5249:2: this_ID_0= RULE_ID
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
    // InternalCrySL.g:5259:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalCrySL.g:5259:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalCrySL.g:5260:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
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
    // InternalCrySL.g:5266:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
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
            // InternalCrySL.g:5272:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalCrySL.g:5273:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalCrySL.g:5273:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalCrySL.g:5274:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalCrySL.g:5278:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt97=3;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalCrySL.g:5279:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalCrySL.g:5279:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalCrySL.g:5280:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalCrySL.g:5280:5: ( (lv_static_1_0= 'static' ) )
                    // InternalCrySL.g:5281:6: (lv_static_1_0= 'static' )
                    {
                    // InternalCrySL.g:5281:6: (lv_static_1_0= 'static' )
                    // InternalCrySL.g:5282:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,76,FOLLOW_85); if (state.failed) return current;
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

                    // InternalCrySL.g:5294:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==77) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalCrySL.g:5295:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalCrySL.g:5295:6: (lv_extension_2_0= 'extension' )
                            // InternalCrySL.g:5296:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,77,FOLLOW_85); if (state.failed) return current;
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

                    // InternalCrySL.g:5308:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalCrySL.g:5309:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalCrySL.g:5309:6: ( ruleQualifiedNameInStaticImport )
                    // InternalCrySL.g:5310:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_7);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCrySL.g:5324:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==24) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==RULE_ID) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalCrySL.g:5325:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalCrySL.g:5325:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalCrySL.g:5326:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalCrySL.g:5326:7: (lv_wildcard_4_0= '*' )
                            // InternalCrySL.g:5327:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,24,FOLLOW_86); if (state.failed) return current;
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
                            // InternalCrySL.g:5340:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalCrySL.g:5340:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalCrySL.g:5341:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalCrySL.g:5341:7: (lv_memberName_5_0= ruleValidID )
                            // InternalCrySL.g:5342:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_86);
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
                    // InternalCrySL.g:5362:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalCrySL.g:5362:4: ( ( ruleQualifiedName ) )
                    // InternalCrySL.g:5363:5: ( ruleQualifiedName )
                    {
                    // InternalCrySL.g:5363:5: ( ruleQualifiedName )
                    // InternalCrySL.g:5364:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_86);
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
                    // InternalCrySL.g:5379:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalCrySL.g:5379:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalCrySL.g:5380:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalCrySL.g:5380:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalCrySL.g:5381:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_86);
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

            // InternalCrySL.g:5399:3: (otherlv_8= ';' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==23) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalCrySL.g:5400:4: otherlv_8= ';'
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
    // InternalCrySL.g:5409:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalCrySL.g:5409:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalCrySL.g:5410:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
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
    // InternalCrySL.g:5416:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalCrySL.g:5422:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalCrySL.g:5423:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalCrySL.g:5423:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt99=0;
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==RULE_ID) ) {
                    int LA99_2 = input.LA(2);

                    if ( (LA99_2==32) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // InternalCrySL.g:5424:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_82);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
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

    // $ANTLR start synpred1_InternalCrySL
    public final void synpred1_InternalCrySL_fragment() throws RecognitionException {   
        // InternalCrySL.g:4481:5: ( ( () ruleArrayBrackets ) )
        // InternalCrySL.g:4481:6: ( () ruleArrayBrackets )
        {
        // InternalCrySL.g:4481:6: ( () ruleArrayBrackets )
        // InternalCrySL.g:4482:6: () ruleArrayBrackets
        {
        // InternalCrySL.g:4482:6: ()
        // InternalCrySL.g:4483:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCrySL

    // $ANTLR start synpred2_InternalCrySL
    public final void synpred2_InternalCrySL_fragment() throws RecognitionException {   
        // InternalCrySL.g:4678:5: ( '<' )
        // InternalCrySL.g:4678:6: '<'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCrySL

    // $ANTLR start synpred3_InternalCrySL
    public final void synpred3_InternalCrySL_fragment() throws RecognitionException {   
        // InternalCrySL.g:4734:6: ( ( () '.' ) )
        // InternalCrySL.g:4734:7: ( () '.' )
        {
        // InternalCrySL.g:4734:7: ( () '.' )
        // InternalCrySL.g:4735:7: () '.'
        {
        // InternalCrySL.g:4735:7: ()
        // InternalCrySL.g:4736:7: 
        {
        }

        match(input,32,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCrySL

    // $ANTLR start synpred4_InternalCrySL
    public final void synpred4_InternalCrySL_fragment() throws RecognitionException {   
        // InternalCrySL.g:4772:7: ( '<' )
        // InternalCrySL.g:4772:8: '<'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCrySL

    // Delegated rules

    public final boolean synpred3_InternalCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA67 dfa67 = new DFA67(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA97 dfa97 = new DFA97(this);
    static final String dfa_1s = "\54\uffff";
    static final String dfa_2s = "\2\uffff\5\15\17\uffff\2\15\7\uffff\4\15\4\uffff\1\15\1\uffff\1\15\2\uffff";
    static final String dfa_3s = "\1\4\1\uffff\5\15\1\57\5\60\1\uffff\1\6\7\4\2\15\1\31\4\61\1\31\1\4\4\15\1\4\2\40\1\4\1\15\1\4\1\15\2\40";
    static final String dfa_4s = "\1\104\1\uffff\5\75\1\60\1\62\1\63\1\64\1\65\1\66\1\uffff\1\6\7\4\2\75\1\31\4\61\1\31\1\4\4\75\1\4\2\61\1\4\1\75\1\4\1\75\2\61";
    static final String dfa_5s = "\1\uffff\1\1\13\uffff\1\2\36\uffff";
    static final String dfa_6s = "\54\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\2\1\3\50\uffff\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\4\1\5\6\uffff\5\1",
            "",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\10\uffff\1\16\3\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\1\17\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\7\1\20",
            "\1\21\1\uffff\1\10",
            "\1\22\2\uffff\1\11",
            "\1\23\3\uffff\1\12",
            "\1\24\4\uffff\1\13",
            "\1\25\5\uffff\1\14",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\1\45",
            "\1\46\20\uffff\1\47",
            "\1\50\20\uffff\1\51",
            "\1\52",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\1\53",
            "\2\15\10\uffff\2\15\4\uffff\1\15\1\uffff\1\15\7\uffff\10\15\14\uffff\2\15\1\1",
            "\1\46\20\uffff\1\47",
            "\1\50\20\uffff\1\51"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3540:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_cons_5_0= ruleLiteralExpression ) ) )";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\2\16\uffff";
    static final String dfa_10s = "\1\4\1\0\15\uffff";
    static final String dfa_11s = "\1\111\1\0\15\uffff";
    static final String dfa_12s = "\2\uffff\1\2\13\uffff\1\1";
    static final String dfa_13s = "\1\uffff\1\0\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\10\uffff\1\1\1\2\12\uffff\7\2\20\uffff\1\2\30\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4676:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCrySL()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\20\uffff";
    static final String dfa_16s = "\1\2\17\uffff";
    static final String dfa_17s = "\1\4\1\0\16\uffff";
    static final String dfa_18s = "\1\111\1\0\16\uffff";
    static final String dfa_19s = "\2\uffff\1\2\14\uffff\1\1";
    static final String dfa_20s = "\1\uffff\1\0\16\uffff}>";
    static final String[] dfa_21s = {
            "\1\2\10\uffff\1\1\1\2\12\uffff\10\2\17\uffff\1\2\30\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "4770:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCrySL()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\7\uffff";
    static final String dfa_23s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_24s = "\1\4\1\uffff\1\27\1\4\2\uffff\1\27";
    static final String dfa_25s = "\1\114\1\uffff\1\40\1\30\2\uffff\1\40";
    static final String dfa_26s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_27s = "\7\uffff}>";
    static final String[] dfa_28s = {
            "\1\2\107\uffff\1\1",
            "",
            "\1\4\10\uffff\1\3",
            "\1\6\23\uffff\1\5",
            "",
            "",
            "\1\4\10\uffff\1\3"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "5278:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000B000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000041000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x077C800040000070L,0x000000000000001FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x077C800040000072L,0x000000000000001FL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000007E002012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000007C000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000007C000012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100001002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008005000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000C0000006002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400001000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0300000000000060L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x037C800000000070L,0x000000000000001FL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0300000000000060L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0001000000001000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x037C801000000070L,0x000000000000009FL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000064000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000800002L});

}