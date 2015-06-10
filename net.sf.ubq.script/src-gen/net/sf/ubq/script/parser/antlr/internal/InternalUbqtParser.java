package net.sf.ubq.script.parser.antlr.internal; 

import java.io.InputStream;

import net.sf.ubq.script.services.UbqtGrammarAccess;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

@SuppressWarnings("all")
public class InternalUbqtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'orchestror'", "';'", "'netconf'", "'display'", "'action'", "'trigger'", "','", "'args'", "'reaction'", "'handles'", "'with'", "'fiducial'", "'code'", "'proxima'", "'maps'", "'to'", "'range'", "'bounds'", "'radius'", "'angle'", "'status'", "'requires'", "'{'", "'}'", "'emits'", "'on'", "'slot'", "'in'", "'kind'", "'layout'", "'cursor'", "'dimension'", "'composite'", "'('", "')'", "'style'", "'button'", "'text'", "'image'", "'label'", "'checkbox'", "'checked'", "'menu'", "'menuitem'", "'title'", "'['", "'..'", "'init'", "']'", "'widget:style {'", "'style:color {'", "'foreground:'", "'background:'", "'style:font {'", "'font:'", "'height:'", "'style:'", "'|'", "'style:border {'", "'tickness:'", "'rgb'", "'.'", "'engine'", "'speed'", "'ttl'", "'strategy'", "'threshold'", "'priority'", "'filter'", "'client'", "'SELECTED'", "'UNSELECTED'", "'PUSH'", "'DEACTIVATED'", "'ACTIVATED'", "'DISABLED'", "'P0'", "'P23'", "'P45'", "'P67'", "'P90'", "'P113'", "'P135'", "'P157'", "'P180'", "'P203'", "'P225'", "'P247'", "'P270'", "'P293'", "'P315'", "'P337'", "'UBQ_ROW_LAYOUT'", "'UBQ_FILL_LAYOUT'", "'PROXIMA_ADD'", "'PROXIMA_REMOVE'", "'PROXIMA_UPDATE'", "'CURSOR_ADD'", "'CURSOR_REMOVE'", "'CURSOR_UPDATE'", "'WIDGET_SELECTION'", "'WIDGET_DOWN'", "'WIDGET_UP'", "'WIDGET_DRAG'", "'WIDGET_ENTER'", "'WIDGET_LEAVE'", "'WIDGET_HOVER'", "'INPUT_CMD_ADD'", "'BOLD'", "'ITALIC'", "'STRIKED'", "'NORMAL'", "'DASHED'", "'PICK_N_RUSH'", "'OLDEST_MOST_URGENT'", "'NEWEST_MOST_URGENT'", "'PREDICATE'", "'ROUN_ROBIN'", "'TIME_RANGE_INCLUSIVE'", "'TIME_RANGE_EXCLUSIVE'", "'MAX'", "'VERY_FAST'", "'FAST'", "'AVERAGE'", "'SLOW'", "'VERY_SLOW'", "'MIN'", "'HIGHER'", "'HIGH'", "'MEDIUM'", "'LOW'", "'LOWEST'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalUbqtParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g"; }



     	private UbqtGrammarAccess grammarAccess;
     	
        public InternalUbqtParser(TokenStream input, IAstFactory factory, UbqtGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/sf/ubq/script/parser/antlr/internal/InternalUbqt.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "UbqSession";	
       	}
       	
       	@Override
       	protected UbqtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleUbqSession
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:78:1: entryRuleUbqSession returns [EObject current=null] : iv_ruleUbqSession= ruleUbqSession EOF ;
    public final EObject entryRuleUbqSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqSession = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:79:2: (iv_ruleUbqSession= ruleUbqSession EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:80:2: iv_ruleUbqSession= ruleUbqSession EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqSessionRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqSession_in_entryRuleUbqSession75);
            iv_ruleUbqSession=ruleUbqSession();
            _fsp--;

             current =iv_ruleUbqSession; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqSession85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqSession


    // $ANTLR start ruleUbqSession
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:87:1: ruleUbqSession returns [EObject current=null] : ( ( (lv_netconfs_0_0= ruleNetConfImport ) )* ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+ ( (lv_displayMode_2_0= ruleUbqDisplayMode ) ) ( (lv_fiducials_3_0= ruleUbqFiducial ) )* ( (lv_actions_4_0= ruleUbqAction ) )* ( (lv_reactions_5_0= ruleUbqReaction ) )* ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )* ( (lv_handlers_7_0= ruleUbqHandledReactions ) )* ( (lv_slots_8_0= ruleUbqSlot ) )* ( (lv_proximi_9_0= ruleUbqProxima ) )+ ( (lv_fingers_10_0= ruleUbqCursor ) )* ) ;
    public final EObject ruleUbqSession() throws RecognitionException {
        EObject current = null;

        EObject lv_netconfs_0_0 = null;

        EObject lv_orchestrors_1_0 = null;

        EObject lv_displayMode_2_0 = null;

        EObject lv_fiducials_3_0 = null;

        EObject lv_actions_4_0 = null;

        EObject lv_reactions_5_0 = null;

        EObject lv_emmiters_6_0 = null;

        EObject lv_handlers_7_0 = null;

        EObject lv_slots_8_0 = null;

        EObject lv_proximi_9_0 = null;

        EObject lv_fingers_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:92:6: ( ( ( (lv_netconfs_0_0= ruleNetConfImport ) )* ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+ ( (lv_displayMode_2_0= ruleUbqDisplayMode ) ) ( (lv_fiducials_3_0= ruleUbqFiducial ) )* ( (lv_actions_4_0= ruleUbqAction ) )* ( (lv_reactions_5_0= ruleUbqReaction ) )* ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )* ( (lv_handlers_7_0= ruleUbqHandledReactions ) )* ( (lv_slots_8_0= ruleUbqSlot ) )* ( (lv_proximi_9_0= ruleUbqProxima ) )+ ( (lv_fingers_10_0= ruleUbqCursor ) )* ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:93:1: ( ( (lv_netconfs_0_0= ruleNetConfImport ) )* ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+ ( (lv_displayMode_2_0= ruleUbqDisplayMode ) ) ( (lv_fiducials_3_0= ruleUbqFiducial ) )* ( (lv_actions_4_0= ruleUbqAction ) )* ( (lv_reactions_5_0= ruleUbqReaction ) )* ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )* ( (lv_handlers_7_0= ruleUbqHandledReactions ) )* ( (lv_slots_8_0= ruleUbqSlot ) )* ( (lv_proximi_9_0= ruleUbqProxima ) )+ ( (lv_fingers_10_0= ruleUbqCursor ) )* )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:93:1: ( ( (lv_netconfs_0_0= ruleNetConfImport ) )* ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+ ( (lv_displayMode_2_0= ruleUbqDisplayMode ) ) ( (lv_fiducials_3_0= ruleUbqFiducial ) )* ( (lv_actions_4_0= ruleUbqAction ) )* ( (lv_reactions_5_0= ruleUbqReaction ) )* ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )* ( (lv_handlers_7_0= ruleUbqHandledReactions ) )* ( (lv_slots_8_0= ruleUbqSlot ) )* ( (lv_proximi_9_0= ruleUbqProxima ) )+ ( (lv_fingers_10_0= ruleUbqCursor ) )* )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:93:2: ( (lv_netconfs_0_0= ruleNetConfImport ) )* ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+ ( (lv_displayMode_2_0= ruleUbqDisplayMode ) ) ( (lv_fiducials_3_0= ruleUbqFiducial ) )* ( (lv_actions_4_0= ruleUbqAction ) )* ( (lv_reactions_5_0= ruleUbqReaction ) )* ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )* ( (lv_handlers_7_0= ruleUbqHandledReactions ) )* ( (lv_slots_8_0= ruleUbqSlot ) )* ( (lv_proximi_9_0= ruleUbqProxima ) )+ ( (lv_fingers_10_0= ruleUbqCursor ) )*
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:93:2: ( (lv_netconfs_0_0= ruleNetConfImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:94:1: (lv_netconfs_0_0= ruleNetConfImport )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:94:1: (lv_netconfs_0_0= ruleNetConfImport )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:95:3: lv_netconfs_0_0= ruleNetConfImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getNetconfsNetConfImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNetConfImport_in_ruleUbqSession131);
            	    lv_netconfs_0_0=ruleNetConfImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"netconfs",
            	    	        		lv_netconfs_0_0, 
            	    	        		"NetConfImport", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:117:3: ( (lv_orchestrors_1_0= ruleOrchestrorImport ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:118:1: (lv_orchestrors_1_0= ruleOrchestrorImport )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:118:1: (lv_orchestrors_1_0= ruleOrchestrorImport )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:119:3: lv_orchestrors_1_0= ruleOrchestrorImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getOrchestrorsOrchestrorImportParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrchestrorImport_in_ruleUbqSession153);
            	    lv_orchestrors_1_0=ruleOrchestrorImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"orchestrors",
            	    	        		lv_orchestrors_1_0, 
            	    	        		"OrchestrorImport", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:141:3: ( (lv_displayMode_2_0= ruleUbqDisplayMode ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:142:1: (lv_displayMode_2_0= ruleUbqDisplayMode )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:142:1: (lv_displayMode_2_0= ruleUbqDisplayMode )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:143:3: lv_displayMode_2_0= ruleUbqDisplayMode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getDisplayModeUbqDisplayModeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUbqDisplayMode_in_ruleUbqSession175);
            lv_displayMode_2_0=ruleUbqDisplayMode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"displayMode",
            	        		lv_displayMode_2_0, 
            	        		"UbqDisplayMode", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:165:2: ( (lv_fiducials_3_0= ruleUbqFiducial ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:166:1: (lv_fiducials_3_0= ruleUbqFiducial )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:166:1: (lv_fiducials_3_0= ruleUbqFiducial )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:167:3: lv_fiducials_3_0= ruleUbqFiducial
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getFiducialsUbqFiducialParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqFiducial_in_ruleUbqSession196);
            	    lv_fiducials_3_0=ruleUbqFiducial();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fiducials",
            	    	        		lv_fiducials_3_0, 
            	    	        		"UbqFiducial", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:189:3: ( (lv_actions_4_0= ruleUbqAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:190:1: (lv_actions_4_0= ruleUbqAction )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:190:1: (lv_actions_4_0= ruleUbqAction )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:191:3: lv_actions_4_0= ruleUbqAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getActionsUbqActionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqAction_in_ruleUbqSession218);
            	    lv_actions_4_0=ruleUbqAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_4_0, 
            	    	        		"UbqAction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:213:3: ( (lv_reactions_5_0= ruleUbqReaction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:214:1: (lv_reactions_5_0= ruleUbqReaction )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:214:1: (lv_reactions_5_0= ruleUbqReaction )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:215:3: lv_reactions_5_0= ruleUbqReaction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getReactionsUbqReactionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqReaction_in_ruleUbqSession240);
            	    lv_reactions_5_0=ruleUbqReaction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"reactions",
            	    	        		lv_reactions_5_0, 
            	    	        		"UbqReaction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:237:3: ( (lv_emmiters_6_0= ruleUbqEmmitedActions ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:238:1: (lv_emmiters_6_0= ruleUbqEmmitedActions )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:238:1: (lv_emmiters_6_0= ruleUbqEmmitedActions )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:239:3: lv_emmiters_6_0= ruleUbqEmmitedActions
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getEmmitersUbqEmmitedActionsParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqEmmitedActions_in_ruleUbqSession262);
            	    lv_emmiters_6_0=ruleUbqEmmitedActions();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"emmiters",
            	    	        		lv_emmiters_6_0, 
            	    	        		"UbqEmmitedActions", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:261:3: ( (lv_handlers_7_0= ruleUbqHandledReactions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:262:1: (lv_handlers_7_0= ruleUbqHandledReactions )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:262:1: (lv_handlers_7_0= ruleUbqHandledReactions )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:263:3: lv_handlers_7_0= ruleUbqHandledReactions
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getHandlersUbqHandledReactionsParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqHandledReactions_in_ruleUbqSession284);
            	    lv_handlers_7_0=ruleUbqHandledReactions();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"handlers",
            	    	        		lv_handlers_7_0, 
            	    	        		"UbqHandledReactions", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:285:3: ( (lv_slots_8_0= ruleUbqSlot ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:286:1: (lv_slots_8_0= ruleUbqSlot )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:286:1: (lv_slots_8_0= ruleUbqSlot )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:287:3: lv_slots_8_0= ruleUbqSlot
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getSlotsUbqSlotParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqSlot_in_ruleUbqSession306);
            	    lv_slots_8_0=ruleUbqSlot();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"slots",
            	    	        		lv_slots_8_0, 
            	    	        		"UbqSlot", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:309:3: ( (lv_proximi_9_0= ruleUbqProxima ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:310:1: (lv_proximi_9_0= ruleUbqProxima )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:310:1: (lv_proximi_9_0= ruleUbqProxima )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:311:3: lv_proximi_9_0= ruleUbqProxima
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getProximiUbqProximaParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqProxima_in_ruleUbqSession328);
            	    lv_proximi_9_0=ruleUbqProxima();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"proximi",
            	    	        		lv_proximi_9_0, 
            	    	        		"UbqProxima", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:333:3: ( (lv_fingers_10_0= ruleUbqCursor ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:334:1: (lv_fingers_10_0= ruleUbqCursor )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:334:1: (lv_fingers_10_0= ruleUbqCursor )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:335:3: lv_fingers_10_0= ruleUbqCursor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqSessionAccess().getFingersUbqCursorParserRuleCall_10_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUbqCursor_in_ruleUbqSession350);
            	    lv_fingers_10_0=ruleUbqCursor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fingers",
            	    	        		lv_fingers_10_0, 
            	    	        		"UbqCursor", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqSession


    // $ANTLR start entryRuleOrchestrorImport
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:365:1: entryRuleOrchestrorImport returns [EObject current=null] : iv_ruleOrchestrorImport= ruleOrchestrorImport EOF ;
    public final EObject entryRuleOrchestrorImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrchestrorImport = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:366:2: (iv_ruleOrchestrorImport= ruleOrchestrorImport EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:367:2: iv_ruleOrchestrorImport= ruleOrchestrorImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrchestrorImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrchestrorImport_in_entryRuleOrchestrorImport387);
            iv_ruleOrchestrorImport=ruleOrchestrorImport();
            _fsp--;

             current =iv_ruleOrchestrorImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrchestrorImport397); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOrchestrorImport


    // $ANTLR start ruleOrchestrorImport
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:374:1: ruleOrchestrorImport returns [EObject current=null] : ( 'orchestror' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleOrchestrorImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:379:6: ( ( 'orchestror' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:380:1: ( 'orchestror' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:380:1: ( 'orchestror' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:380:3: 'orchestror' ( (lv_importURI_1_0= RULE_STRING ) ) ';'
            {
            match(input,11,FOLLOW_11_in_ruleOrchestrorImport432); 

                    createLeafNode(grammarAccess.getOrchestrorImportAccess().getOrchestrorKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:384:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:385:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:385:1: (lv_importURI_1_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:386:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrchestrorImport449); 

            			createLeafNode(grammarAccess.getOrchestrorImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOrchestrorImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleOrchestrorImport464); 

                    createLeafNode(grammarAccess.getOrchestrorImportAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrchestrorImport


    // $ANTLR start entryRuleNetConfImport
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:420:1: entryRuleNetConfImport returns [EObject current=null] : iv_ruleNetConfImport= ruleNetConfImport EOF ;
    public final EObject entryRuleNetConfImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetConfImport = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:421:2: (iv_ruleNetConfImport= ruleNetConfImport EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:422:2: iv_ruleNetConfImport= ruleNetConfImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNetConfImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleNetConfImport_in_entryRuleNetConfImport500);
            iv_ruleNetConfImport=ruleNetConfImport();
            _fsp--;

             current =iv_ruleNetConfImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetConfImport510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNetConfImport


    // $ANTLR start ruleNetConfImport
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:429:1: ruleNetConfImport returns [EObject current=null] : ( 'netconf' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleNetConfImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:434:6: ( ( 'netconf' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:435:1: ( 'netconf' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:435:1: ( 'netconf' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:435:3: 'netconf' ( (lv_importURI_1_0= RULE_STRING ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleNetConfImport545); 

                    createLeafNode(grammarAccess.getNetConfImportAccess().getNetconfKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:439:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:440:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:440:1: (lv_importURI_1_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:441:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNetConfImport562); 

            			createLeafNode(grammarAccess.getNetConfImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNetConfImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleNetConfImport577); 

                    createLeafNode(grammarAccess.getNetConfImportAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNetConfImport


    // $ANTLR start entryRuleUbqDisplayMode
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:475:1: entryRuleUbqDisplayMode returns [EObject current=null] : iv_ruleUbqDisplayMode= ruleUbqDisplayMode EOF ;
    public final EObject entryRuleUbqDisplayMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqDisplayMode = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:476:2: (iv_ruleUbqDisplayMode= ruleUbqDisplayMode EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:477:2: iv_ruleUbqDisplayMode= ruleUbqDisplayMode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqDisplayModeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqDisplayMode_in_entryRuleUbqDisplayMode613);
            iv_ruleUbqDisplayMode=ruleUbqDisplayMode();
            _fsp--;

             current =iv_ruleUbqDisplayMode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqDisplayMode623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqDisplayMode


    // $ANTLR start ruleUbqDisplayMode
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:484:1: ruleUbqDisplayMode returns [EObject current=null] : ( 'display' ( (lv_mode_1_0= ruleUbqPoint ) ) ';' ) ;
    public final EObject ruleUbqDisplayMode() throws RecognitionException {
        EObject current = null;

        EObject lv_mode_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:489:6: ( ( 'display' ( (lv_mode_1_0= ruleUbqPoint ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:490:1: ( 'display' ( (lv_mode_1_0= ruleUbqPoint ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:490:1: ( 'display' ( (lv_mode_1_0= ruleUbqPoint ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:490:3: 'display' ( (lv_mode_1_0= ruleUbqPoint ) ) ';'
            {
            match(input,14,FOLLOW_14_in_ruleUbqDisplayMode658); 

                    createLeafNode(grammarAccess.getUbqDisplayModeAccess().getDisplayKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:494:1: ( (lv_mode_1_0= ruleUbqPoint ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:495:1: (lv_mode_1_0= ruleUbqPoint )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:495:1: (lv_mode_1_0= ruleUbqPoint )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:496:3: lv_mode_1_0= ruleUbqPoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqDisplayModeAccess().getModeUbqPointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUbqPoint_in_ruleUbqDisplayMode679);
            lv_mode_1_0=ruleUbqPoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqDisplayModeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mode",
            	        		lv_mode_1_0, 
            	        		"UbqPoint", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleUbqDisplayMode689); 

                    createLeafNode(grammarAccess.getUbqDisplayModeAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqDisplayMode


    // $ANTLR start entryRuleUbqAction
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:530:1: entryRuleUbqAction returns [EObject current=null] : iv_ruleUbqAction= ruleUbqAction EOF ;
    public final EObject entryRuleUbqAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqAction = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:531:2: (iv_ruleUbqAction= ruleUbqAction EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:532:2: iv_ruleUbqAction= ruleUbqAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqAction_in_entryRuleUbqAction725);
            iv_ruleUbqAction=ruleUbqAction();
            _fsp--;

             current =iv_ruleUbqAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqAction735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqAction


    // $ANTLR start ruleUbqAction
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:539:1: ruleUbqAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'trigger' ( (lv_actionIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )* ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )? ';' ) ;
    public final EObject ruleUbqAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_actionIDs_3_0=null;
        Token lv_actionIDs_5_0=null;
        Token lv_args_7_0=null;
        Token lv_args_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:544:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'trigger' ( (lv_actionIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )* ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:545:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'trigger' ( (lv_actionIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )* ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:545:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'trigger' ( (lv_actionIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )* ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:545:3: 'action' ( (lv_name_1_0= RULE_ID ) ) 'trigger' ( (lv_actionIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )* ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )? ';'
            {
            match(input,15,FOLLOW_15_in_ruleUbqAction770); 

                    createLeafNode(grammarAccess.getUbqActionAccess().getActionKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:549:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:550:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:550:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:551:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqAction787); 

            			createLeafNode(grammarAccess.getUbqActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleUbqAction802); 

                    createLeafNode(grammarAccess.getUbqActionAccess().getTriggerKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:577:1: ( (lv_actionIDs_3_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:578:1: (lv_actionIDs_3_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:578:1: (lv_actionIDs_3_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:579:3: lv_actionIDs_3_0= RULE_STRING
            {
            lv_actionIDs_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqAction819); 

            			createLeafNode(grammarAccess.getUbqActionAccess().getActionIDsSTRINGTerminalRuleCall_3_0(), "actionIDs"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"actionIDs",
            	        		lv_actionIDs_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:601:2: ( ',' ( (lv_actionIDs_5_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:601:4: ',' ( (lv_actionIDs_5_0= RULE_STRING ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleUbqAction835); 

            	            createLeafNode(grammarAccess.getUbqActionAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:605:1: ( (lv_actionIDs_5_0= RULE_STRING ) )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:606:1: (lv_actionIDs_5_0= RULE_STRING )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:606:1: (lv_actionIDs_5_0= RULE_STRING )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:607:3: lv_actionIDs_5_0= RULE_STRING
            	    {
            	    lv_actionIDs_5_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqAction852); 

            	    			createLeafNode(grammarAccess.getUbqActionAccess().getActionIDsSTRINGTerminalRuleCall_4_1_0(), "actionIDs"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqActionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actionIDs",
            	    	        		lv_actionIDs_5_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:629:4: ( 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:629:6: 'args' ( (lv_args_7_0= RULE_STRING ) ) ( ',' ( (lv_args_9_0= RULE_STRING ) ) )*
                    {
                    match(input,18,FOLLOW_18_in_ruleUbqAction870); 

                            createLeafNode(grammarAccess.getUbqActionAccess().getArgsKeyword_5_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:633:1: ( (lv_args_7_0= RULE_STRING ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:634:1: (lv_args_7_0= RULE_STRING )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:634:1: (lv_args_7_0= RULE_STRING )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:635:3: lv_args_7_0= RULE_STRING
                    {
                    lv_args_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqAction887); 

                    			createLeafNode(grammarAccess.getUbqActionAccess().getArgsSTRINGTerminalRuleCall_5_1_0(), "args"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"args",
                    	        		lv_args_7_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:657:2: ( ',' ( (lv_args_9_0= RULE_STRING ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:657:4: ',' ( (lv_args_9_0= RULE_STRING ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleUbqAction903); 

                    	            createLeafNode(grammarAccess.getUbqActionAccess().getCommaKeyword_5_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:661:1: ( (lv_args_9_0= RULE_STRING ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:662:1: (lv_args_9_0= RULE_STRING )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:662:1: (lv_args_9_0= RULE_STRING )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:663:3: lv_args_9_0= RULE_STRING
                    	    {
                    	    lv_args_9_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqAction920); 

                    	    			createLeafNode(grammarAccess.getUbqActionAccess().getArgsSTRINGTerminalRuleCall_5_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqActionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_9_0, 
                    	    	        		"STRING", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqAction939); 

                    createLeafNode(grammarAccess.getUbqActionAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqAction


    // $ANTLR start entryRuleUbqReaction
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:697:1: entryRuleUbqReaction returns [EObject current=null] : iv_ruleUbqReaction= ruleUbqReaction EOF ;
    public final EObject entryRuleUbqReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqReaction = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:698:2: (iv_ruleUbqReaction= ruleUbqReaction EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:699:2: iv_ruleUbqReaction= ruleUbqReaction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqReactionRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqReaction_in_entryRuleUbqReaction975);
            iv_ruleUbqReaction=ruleUbqReaction();
            _fsp--;

             current =iv_ruleUbqReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqReaction985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqReaction


    // $ANTLR start ruleUbqReaction
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:706:1: ruleUbqReaction returns [EObject current=null] : ( 'reaction' ( (lv_name_1_0= RULE_ID ) ) 'handles' ( (lv_cmdIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )* 'with' ( (lv_clazz_7_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleUbqReaction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_cmdIDs_3_0=null;
        Token lv_cmdIDs_5_0=null;
        Token lv_clazz_7_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:711:6: ( ( 'reaction' ( (lv_name_1_0= RULE_ID ) ) 'handles' ( (lv_cmdIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )* 'with' ( (lv_clazz_7_0= RULE_STRING ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:712:1: ( 'reaction' ( (lv_name_1_0= RULE_ID ) ) 'handles' ( (lv_cmdIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )* 'with' ( (lv_clazz_7_0= RULE_STRING ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:712:1: ( 'reaction' ( (lv_name_1_0= RULE_ID ) ) 'handles' ( (lv_cmdIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )* 'with' ( (lv_clazz_7_0= RULE_STRING ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:712:3: 'reaction' ( (lv_name_1_0= RULE_ID ) ) 'handles' ( (lv_cmdIDs_3_0= RULE_STRING ) ) ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )* 'with' ( (lv_clazz_7_0= RULE_STRING ) ) ';'
            {
            match(input,19,FOLLOW_19_in_ruleUbqReaction1020); 

                    createLeafNode(grammarAccess.getUbqReactionAccess().getReactionKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:716:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:717:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:717:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:718:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqReaction1037); 

            			createLeafNode(grammarAccess.getUbqReactionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqReactionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleUbqReaction1052); 

                    createLeafNode(grammarAccess.getUbqReactionAccess().getHandlesKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:744:1: ( (lv_cmdIDs_3_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:745:1: (lv_cmdIDs_3_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:745:1: (lv_cmdIDs_3_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:746:3: lv_cmdIDs_3_0= RULE_STRING
            {
            lv_cmdIDs_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqReaction1069); 

            			createLeafNode(grammarAccess.getUbqReactionAccess().getCmdIDsSTRINGTerminalRuleCall_3_0(), "cmdIDs"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqReactionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"cmdIDs",
            	        		lv_cmdIDs_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:768:2: ( ',' ( (lv_cmdIDs_5_0= RULE_STRING ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:768:4: ',' ( (lv_cmdIDs_5_0= RULE_STRING ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleUbqReaction1085); 

            	            createLeafNode(grammarAccess.getUbqReactionAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:772:1: ( (lv_cmdIDs_5_0= RULE_STRING ) )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:773:1: (lv_cmdIDs_5_0= RULE_STRING )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:773:1: (lv_cmdIDs_5_0= RULE_STRING )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:774:3: lv_cmdIDs_5_0= RULE_STRING
            	    {
            	    lv_cmdIDs_5_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqReaction1102); 

            	    			createLeafNode(grammarAccess.getUbqReactionAccess().getCmdIDsSTRINGTerminalRuleCall_4_1_0(), "cmdIDs"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqReactionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cmdIDs",
            	    	        		lv_cmdIDs_5_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleUbqReaction1119); 

                    createLeafNode(grammarAccess.getUbqReactionAccess().getWithKeyword_5(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:800:1: ( (lv_clazz_7_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:801:1: (lv_clazz_7_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:801:1: (lv_clazz_7_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:802:3: lv_clazz_7_0= RULE_STRING
            {
            lv_clazz_7_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqReaction1136); 

            			createLeafNode(grammarAccess.getUbqReactionAccess().getClazzSTRINGTerminalRuleCall_6_0(), "clazz"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqReactionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clazz",
            	        		lv_clazz_7_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleUbqReaction1151); 

                    createLeafNode(grammarAccess.getUbqReactionAccess().getSemicolonKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqReaction


    // $ANTLR start entryRuleUbqFiducial
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:836:1: entryRuleUbqFiducial returns [EObject current=null] : iv_ruleUbqFiducial= ruleUbqFiducial EOF ;
    public final EObject entryRuleUbqFiducial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqFiducial = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:837:2: (iv_ruleUbqFiducial= ruleUbqFiducial EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:838:2: iv_ruleUbqFiducial= ruleUbqFiducial EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqFiducialRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqFiducial_in_entryRuleUbqFiducial1187);
            iv_ruleUbqFiducial=ruleUbqFiducial();
            _fsp--;

             current =iv_ruleUbqFiducial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqFiducial1197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqFiducial


    // $ANTLR start ruleUbqFiducial
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:845:1: ruleUbqFiducial returns [EObject current=null] : ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) 'code' ( (lv_fidcode_3_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleUbqFiducial() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_fidcode_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:850:6: ( ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) 'code' ( (lv_fidcode_3_0= RULE_INT ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:851:1: ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) 'code' ( (lv_fidcode_3_0= RULE_INT ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:851:1: ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) 'code' ( (lv_fidcode_3_0= RULE_INT ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:851:3: 'fiducial' ( (lv_name_1_0= RULE_ID ) ) 'code' ( (lv_fidcode_3_0= RULE_INT ) ) ';'
            {
            match(input,22,FOLLOW_22_in_ruleUbqFiducial1232); 

                    createLeafNode(grammarAccess.getUbqFiducialAccess().getFiducialKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:855:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:856:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:856:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:857:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqFiducial1249); 

            			createLeafNode(grammarAccess.getUbqFiducialAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleUbqFiducial1264); 

                    createLeafNode(grammarAccess.getUbqFiducialAccess().getCodeKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:883:1: ( (lv_fidcode_3_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:884:1: (lv_fidcode_3_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:884:1: (lv_fidcode_3_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:885:3: lv_fidcode_3_0= RULE_INT
            {
            lv_fidcode_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqFiducial1281); 

            			createLeafNode(grammarAccess.getUbqFiducialAccess().getFidcodeINTTerminalRuleCall_3_0(), "fidcode"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"fidcode",
            	        		lv_fidcode_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleUbqFiducial1296); 

                    createLeafNode(grammarAccess.getUbqFiducialAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqFiducial


    // $ANTLR start entryRuleUbqProxima
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:919:1: entryRuleUbqProxima returns [EObject current=null] : iv_ruleUbqProxima= ruleUbqProxima EOF ;
    public final EObject entryRuleUbqProxima() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqProxima = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:920:2: (iv_ruleUbqProxima= ruleUbqProxima EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:921:2: iv_ruleUbqProxima= ruleUbqProxima EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqProximaRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqProxima_in_entryRuleUbqProxima1332);
            iv_ruleUbqProxima=ruleUbqProxima();
            _fsp--;

             current =iv_ruleUbqProxima; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqProxima1342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqProxima


    // $ANTLR start ruleUbqProxima
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:928:1: ruleUbqProxima returns [EObject current=null] : ( 'proxima' ( (lv_name_1_0= RULE_ID ) ) 'maps' ( ( RULE_ID ) ) 'to' ( ( RULE_ID ) ) 'range' ( (lv_range_7_0= ruleUbqIncrementableRange ) )? ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )? ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )? ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )? ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )? ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )? ';' ) ;
    public final EObject ruleUbqProxima() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_radius_11_0=null;
        Token lv_angle_13_0=null;
        EObject lv_range_7_0 = null;

        EObject lv_bounds_9_0 = null;

        Enumerator lv_status_15_0 = null;

        EObject lv_emitted_25_0 = null;

        EObject lv_reacted_26_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:933:6: ( ( 'proxima' ( (lv_name_1_0= RULE_ID ) ) 'maps' ( ( RULE_ID ) ) 'to' ( ( RULE_ID ) ) 'range' ( (lv_range_7_0= ruleUbqIncrementableRange ) )? ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )? ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )? ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )? ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )? ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:934:1: ( 'proxima' ( (lv_name_1_0= RULE_ID ) ) 'maps' ( ( RULE_ID ) ) 'to' ( ( RULE_ID ) ) 'range' ( (lv_range_7_0= ruleUbqIncrementableRange ) )? ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )? ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )? ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )? ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )? ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:934:1: ( 'proxima' ( (lv_name_1_0= RULE_ID ) ) 'maps' ( ( RULE_ID ) ) 'to' ( ( RULE_ID ) ) 'range' ( (lv_range_7_0= ruleUbqIncrementableRange ) )? ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )? ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )? ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )? ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )? ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:934:3: 'proxima' ( (lv_name_1_0= RULE_ID ) ) 'maps' ( ( RULE_ID ) ) 'to' ( ( RULE_ID ) ) 'range' ( (lv_range_7_0= ruleUbqIncrementableRange ) )? ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )? ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )? ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )? ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )? ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )? ';'
            {
            match(input,24,FOLLOW_24_in_ruleUbqProxima1377); 

                    createLeafNode(grammarAccess.getUbqProximaAccess().getProximaKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:938:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:939:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:939:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:940:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1394); 

            			createLeafNode(grammarAccess.getUbqProximaAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,25,FOLLOW_25_in_ruleUbqProxima1409); 

                    createLeafNode(grammarAccess.getUbqProximaAccess().getMapsKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:966:1: ( ( RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:967:1: ( RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:967:1: ( RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:968:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1427); 

            		createLeafNode(grammarAccess.getUbqProximaAccess().getFiducialUbqFiducialCrossReference_3_0(), "fiducial"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleUbqProxima1437); 

                    createLeafNode(grammarAccess.getUbqProximaAccess().getToKeyword_4(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:984:1: ( ( RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:985:1: ( RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:985:1: ( RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:986:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1455); 

            		createLeafNode(grammarAccess.getUbqProximaAccess().getEngineDSLEngineClientCrossReference_5_0(), "engine"); 
            	

            }


            }

            match(input,27,FOLLOW_27_in_ruleUbqProxima1465); 

                    createLeafNode(grammarAccess.getUbqProximaAccess().getRangeKeyword_6(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1002:1: ( (lv_range_7_0= ruleUbqIncrementableRange ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1003:1: (lv_range_7_0= ruleUbqIncrementableRange )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1003:1: (lv_range_7_0= ruleUbqIncrementableRange )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1004:3: lv_range_7_0= ruleUbqIncrementableRange
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqProximaAccess().getRangeUbqIncrementableRangeParserRuleCall_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqIncrementableRange_in_ruleUbqProxima1486);
                    lv_range_7_0=ruleUbqIncrementableRange();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"range",
                    	        		lv_range_7_0, 
                    	        		"UbqIncrementableRange", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1026:3: ( 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1026:5: 'bounds' ( (lv_bounds_9_0= ruleUbqBounds ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleUbqProxima1498); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getBoundsKeyword_8_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1030:1: ( (lv_bounds_9_0= ruleUbqBounds ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1031:1: (lv_bounds_9_0= ruleUbqBounds )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1031:1: (lv_bounds_9_0= ruleUbqBounds )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1032:3: lv_bounds_9_0= ruleUbqBounds
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqProximaAccess().getBoundsUbqBoundsParserRuleCall_8_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqBounds_in_ruleUbqProxima1519);
                    lv_bounds_9_0=ruleUbqBounds();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bounds",
                    	        		lv_bounds_9_0, 
                    	        		"UbqBounds", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1054:4: ( 'radius' ( (lv_radius_11_0= RULE_INT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1054:6: 'radius' ( (lv_radius_11_0= RULE_INT ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleUbqProxima1532); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getRadiusKeyword_9_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1058:1: ( (lv_radius_11_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1059:1: (lv_radius_11_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1059:1: (lv_radius_11_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1060:3: lv_radius_11_0= RULE_INT
                    {
                    lv_radius_11_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqProxima1549); 

                    			createLeafNode(grammarAccess.getUbqProximaAccess().getRadiusINTTerminalRuleCall_9_1_0(), "radius"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"radius",
                    	        		lv_radius_11_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1082:4: ( 'angle' ( (lv_angle_13_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1082:6: 'angle' ( (lv_angle_13_0= RULE_INT ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleUbqProxima1567); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getAngleKeyword_10_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1086:1: ( (lv_angle_13_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1087:1: (lv_angle_13_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1087:1: (lv_angle_13_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1088:3: lv_angle_13_0= RULE_INT
                    {
                    lv_angle_13_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqProxima1584); 

                    			createLeafNode(grammarAccess.getUbqProximaAccess().getAngleINTTerminalRuleCall_10_1_0(), "angle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"angle",
                    	        		lv_angle_13_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1110:4: ( 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1110:6: 'status' ( (lv_status_15_0= rulePROXIMA_STATUS ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleUbqProxima1602); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getStatusKeyword_11_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1114:1: ( (lv_status_15_0= rulePROXIMA_STATUS ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1115:1: (lv_status_15_0= rulePROXIMA_STATUS )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1115:1: (lv_status_15_0= rulePROXIMA_STATUS )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1116:3: lv_status_15_0= rulePROXIMA_STATUS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqProximaAccess().getStatusPROXIMA_STATUSEnumRuleCall_11_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePROXIMA_STATUS_in_ruleUbqProxima1623);
                    lv_status_15_0=rulePROXIMA_STATUS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"status",
                    	        		lv_status_15_0, 
                    	        		"PROXIMA_STATUS", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1138:4: ( 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1138:6: 'requires' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,32,FOLLOW_32_in_ruleUbqProxima1636); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getRequiresKeyword_12_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1142:1: ( ( RULE_ID ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1143:1: ( RULE_ID )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1143:1: ( RULE_ID )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1144:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1654); 

                    		createLeafNode(grammarAccess.getUbqProximaAccess().getRequiredProximiUbqProximaCrossReference_12_1_0(), "requiredProximi"); 
                    	

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1156:2: ( ',' ( ( RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1156:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleUbqProxima1665); 

                    	            createLeafNode(grammarAccess.getUbqProximaAccess().getCommaKeyword_12_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1160:1: ( ( RULE_ID ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1161:1: ( RULE_ID )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1161:1: ( RULE_ID )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1162:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1683); 

                    	    		createLeafNode(grammarAccess.getUbqProximaAccess().getRequiredProximiUbqProximaCrossReference_12_2_1_0(), "requiredProximi"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1174:6: ( '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1174:8: '{' ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )? ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_26_0= ruleUbqHandledReactions ) )* '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqProxima1698); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getLeftCurlyBracketKeyword_13_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1178:1: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1178:2: ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
                            {
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1178:2: ( ( RULE_ID ) )
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1179:1: ( RULE_ID )
                            {
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1179:1: ( RULE_ID )
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1180:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1717); 

                            		createLeafNode(grammarAccess.getUbqProximaAccess().getSlotsUbqSlotCrossReference_13_1_0_0(), "slots"); 
                            	

                            }


                            }

                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1192:2: ( ',' ( ( RULE_ID ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==17) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1192:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,17,FOLLOW_17_in_ruleUbqProxima1728); 

                            	            createLeafNode(grammarAccess.getUbqProximaAccess().getCommaKeyword_13_1_1_0(), null); 
                            	        
                            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1196:1: ( ( RULE_ID ) )
                            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1197:1: ( RULE_ID )
                            	    {
                            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1197:1: ( RULE_ID )
                            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1198:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqProxima1746); 

                            	    		createLeafNode(grammarAccess.getUbqProximaAccess().getSlotsUbqSlotCrossReference_13_1_1_1_0(), "slots"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            match(input,12,FOLLOW_12_in_ruleUbqProxima1758); 

                                    createLeafNode(grammarAccess.getUbqProximaAccess().getSemicolonKeyword_13_1_2(), null); 
                                

                            }
                            break;

                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1214:3: ( (lv_emitted_25_0= ruleUbqEmmitedActions ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1215:1: (lv_emitted_25_0= ruleUbqEmmitedActions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1215:1: (lv_emitted_25_0= ruleUbqEmmitedActions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1216:3: lv_emitted_25_0= ruleUbqEmmitedActions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqProximaAccess().getEmittedUbqEmmitedActionsParserRuleCall_13_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqEmmitedActions_in_ruleUbqProxima1781);
                    	    lv_emitted_25_0=ruleUbqEmmitedActions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"emitted",
                    	    	        		lv_emitted_25_0, 
                    	    	        		"UbqEmmitedActions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1238:3: ( (lv_reacted_26_0= ruleUbqHandledReactions ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1239:1: (lv_reacted_26_0= ruleUbqHandledReactions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1239:1: (lv_reacted_26_0= ruleUbqHandledReactions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1240:3: lv_reacted_26_0= ruleUbqHandledReactions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqProximaAccess().getReactedUbqHandledReactionsParserRuleCall_13_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqHandledReactions_in_ruleUbqProxima1803);
                    	    lv_reacted_26_0=ruleUbqHandledReactions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqProximaRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"reacted",
                    	    	        		lv_reacted_26_0, 
                    	    	        		"UbqHandledReactions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqProxima1814); 

                            createLeafNode(grammarAccess.getUbqProximaAccess().getRightCurlyBracketKeyword_13_4(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqProxima1826); 

                    createLeafNode(grammarAccess.getUbqProximaAccess().getSemicolonKeyword_14(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqProxima


    // $ANTLR start entryRuleUbqHandledReactions
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1278:1: entryRuleUbqHandledReactions returns [EObject current=null] : iv_ruleUbqHandledReactions= ruleUbqHandledReactions EOF ;
    public final EObject entryRuleUbqHandledReactions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqHandledReactions = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1279:2: (iv_ruleUbqHandledReactions= ruleUbqHandledReactions EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1280:2: iv_ruleUbqHandledReactions= ruleUbqHandledReactions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqHandledReactionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqHandledReactions_in_entryRuleUbqHandledReactions1862);
            iv_ruleUbqHandledReactions=ruleUbqHandledReactions();
            _fsp--;

             current =iv_ruleUbqHandledReactions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqHandledReactions1872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqHandledReactions


    // $ANTLR start ruleUbqHandledReactions
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1287:1: ruleUbqHandledReactions returns [EObject current=null] : ( 'handles' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' ) ;
    public final EObject ruleUbqHandledReactions() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1292:6: ( ( 'handles' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1293:1: ( 'handles' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1293:1: ( 'handles' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1293:3: 'handles' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';'
            {
            match(input,20,FOLLOW_20_in_ruleUbqHandledReactions1907); 

                    createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getHandlesKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1297:1: ( ( RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1298:1: ( RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1298:1: ( RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1299:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUbqHandledReactionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqHandledReactions1925); 

            		createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getReactionsUbqReactionCrossReference_1_0(), "reactions"); 
            	

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1311:2: ( ',' ( ( RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1311:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleUbqHandledReactions1936); 

            	            createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1315:1: ( ( RULE_ID ) )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1316:1: ( RULE_ID )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1316:1: ( RULE_ID )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1317:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqHandledReactionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqHandledReactions1954); 

            	    		createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getReactionsUbqReactionCrossReference_2_1_0(), "reactions"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1329:4: ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1329:6: 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,21,FOLLOW_21_in_ruleUbqHandledReactions1967); 

                            createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getWithKeyword_3_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1333:1: ( ( RULE_ID ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1334:1: ( RULE_ID )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1334:1: ( RULE_ID )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1335:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqHandledReactionsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqHandledReactions1985); 

                    		createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getProximiAsRefUbqProximaCrossReference_3_1_0(), "proximiAsRef"); 
                    	

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1347:2: ( ',' ( ( RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1347:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleUbqHandledReactions1996); 

                    	            createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1351:1: ( ( RULE_ID ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1352:1: ( RULE_ID )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1352:1: ( RULE_ID )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1353:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqHandledReactionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqHandledReactions2014); 

                    	    		createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getProximiAsRefUbqProximaCrossReference_3_2_1_0(), "proximiAsRef"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqHandledReactions2028); 

                    createLeafNode(grammarAccess.getUbqHandledReactionsAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqHandledReactions


    // $ANTLR start entryRuleUbqEmmitedActions
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1377:1: entryRuleUbqEmmitedActions returns [EObject current=null] : iv_ruleUbqEmmitedActions= ruleUbqEmmitedActions EOF ;
    public final EObject entryRuleUbqEmmitedActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqEmmitedActions = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1378:2: (iv_ruleUbqEmmitedActions= ruleUbqEmmitedActions EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1379:2: iv_ruleUbqEmmitedActions= ruleUbqEmmitedActions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqEmmitedActionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqEmmitedActions_in_entryRuleUbqEmmitedActions2064);
            iv_ruleUbqEmmitedActions=ruleUbqEmmitedActions();
            _fsp--;

             current =iv_ruleUbqEmmitedActions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqEmmitedActions2074); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqEmmitedActions


    // $ANTLR start ruleUbqEmmitedActions
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1386:1: ruleUbqEmmitedActions returns [EObject current=null] : ( 'emits' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'on' ( (lv_events_5_0= ruleUBQ_EVENTS ) ) ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' ) ;
    public final EObject ruleUbqEmmitedActions() throws RecognitionException {
        EObject current = null;

        Enumerator lv_events_5_0 = null;

        Enumerator lv_events_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1391:6: ( ( 'emits' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'on' ( (lv_events_5_0= ruleUBQ_EVENTS ) ) ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1392:1: ( 'emits' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'on' ( (lv_events_5_0= ruleUBQ_EVENTS ) ) ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1392:1: ( 'emits' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'on' ( (lv_events_5_0= ruleUBQ_EVENTS ) ) ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1392:3: 'emits' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'on' ( (lv_events_5_0= ruleUBQ_EVENTS ) ) ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )* ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ';'
            {
            match(input,35,FOLLOW_35_in_ruleUbqEmmitedActions2109); 

                    createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getEmitsKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1396:1: ( ( RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1397:1: ( RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1397:1: ( RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1398:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2127); 

            		createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getActionsUbqActionCrossReference_1_0(), "actions"); 
            	

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1410:2: ( ',' ( ( RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1410:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleUbqEmmitedActions2138); 

            	            createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1414:1: ( ( RULE_ID ) )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1415:1: ( RULE_ID )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1415:1: ( RULE_ID )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1416:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2156); 

            	    		createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getActionsUbqActionCrossReference_2_1_0(), "actions"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,36,FOLLOW_36_in_ruleUbqEmmitedActions2168); 

                    createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getOnKeyword_3(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1432:1: ( (lv_events_5_0= ruleUBQ_EVENTS ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1433:1: (lv_events_5_0= ruleUBQ_EVENTS )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1433:1: (lv_events_5_0= ruleUBQ_EVENTS )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1434:3: lv_events_5_0= ruleUBQ_EVENTS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqEmmitedActionsAccess().getEventsUBQ_EVENTSEnumRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUBQ_EVENTS_in_ruleUbqEmmitedActions2189);
            lv_events_5_0=ruleUBQ_EVENTS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"events",
            	        		lv_events_5_0, 
            	        		"UBQ_EVENTS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1456:2: ( ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1456:4: ',' ( (lv_events_7_0= ruleUBQ_EVENTS ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleUbqEmmitedActions2200); 

            	            createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1460:1: ( (lv_events_7_0= ruleUBQ_EVENTS ) )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1461:1: (lv_events_7_0= ruleUBQ_EVENTS )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1461:1: (lv_events_7_0= ruleUBQ_EVENTS )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1462:3: lv_events_7_0= ruleUBQ_EVENTS
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUbqEmmitedActionsAccess().getEventsUBQ_EVENTSEnumRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUBQ_EVENTS_in_ruleUbqEmmitedActions2221);
            	    lv_events_7_0=ruleUBQ_EVENTS();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"events",
            	    	        		lv_events_7_0, 
            	    	        		"UBQ_EVENTS", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1484:4: ( 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1484:6: 'with' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,21,FOLLOW_21_in_ruleUbqEmmitedActions2234); 

                            createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getWithKeyword_6_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1488:1: ( ( RULE_ID ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1489:1: ( RULE_ID )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1489:1: ( RULE_ID )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1490:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2252); 

                    		createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getProximiAsRefUbqProximaCrossReference_6_1_0(), "proximiAsRef"); 
                    	

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1502:2: ( ',' ( ( RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1502:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleUbqEmmitedActions2263); 

                    	            createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getCommaKeyword_6_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1506:1: ( ( RULE_ID ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1507:1: ( RULE_ID )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1507:1: ( RULE_ID )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1508:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqEmmitedActionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2281); 

                    	    		createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getProximiAsRefUbqProximaCrossReference_6_2_1_0(), "proximiAsRef"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqEmmitedActions2295); 

                    createLeafNode(grammarAccess.getUbqEmmitedActionsAccess().getSemicolonKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqEmmitedActions


    // $ANTLR start entryRuleUbqSlot
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1532:1: entryRuleUbqSlot returns [EObject current=null] : iv_ruleUbqSlot= ruleUbqSlot EOF ;
    public final EObject entryRuleUbqSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqSlot = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1533:2: (iv_ruleUbqSlot= ruleUbqSlot EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1534:2: iv_ruleUbqSlot= ruleUbqSlot EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqSlotRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqSlot_in_entryRuleUbqSlot2331);
            iv_ruleUbqSlot=ruleUbqSlot();
            _fsp--;

             current =iv_ruleUbqSlot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqSlot2341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqSlot


    // $ANTLR start ruleUbqSlot
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1541:1: ruleUbqSlot returns [EObject current=null] : ( 'slot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) )? 'in' ( (lv_position_4_0= ruleSLOTS ) ) 'kind' ( (lv_kind_6_0= ruleSLOT_KIND ) ) 'status' ( (lv_status_8_0= ruleSLOT_STATUS ) ) ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )? ';' ) ;
    public final EObject ruleUbqSlot() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_bounds_2_0 = null;

        Enumerator lv_position_4_0 = null;

        Enumerator lv_kind_6_0 = null;

        Enumerator lv_status_8_0 = null;

        EObject lv_emitted_10_0 = null;

        EObject lv_reacted_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1546:6: ( ( 'slot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) )? 'in' ( (lv_position_4_0= ruleSLOTS ) ) 'kind' ( (lv_kind_6_0= ruleSLOT_KIND ) ) 'status' ( (lv_status_8_0= ruleSLOT_STATUS ) ) ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1547:1: ( 'slot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) )? 'in' ( (lv_position_4_0= ruleSLOTS ) ) 'kind' ( (lv_kind_6_0= ruleSLOT_KIND ) ) 'status' ( (lv_status_8_0= ruleSLOT_STATUS ) ) ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1547:1: ( 'slot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) )? 'in' ( (lv_position_4_0= ruleSLOTS ) ) 'kind' ( (lv_kind_6_0= ruleSLOT_KIND ) ) 'status' ( (lv_status_8_0= ruleSLOT_STATUS ) ) ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1547:3: 'slot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) )? 'in' ( (lv_position_4_0= ruleSLOTS ) ) 'kind' ( (lv_kind_6_0= ruleSLOT_KIND ) ) 'status' ( (lv_status_8_0= ruleSLOT_STATUS ) ) ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )? ';'
            {
            match(input,37,FOLLOW_37_in_ruleUbqSlot2376); 

                    createLeafNode(grammarAccess.getUbqSlotAccess().getSlotKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1551:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1552:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1552:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1553:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqSlot2393); 

            			createLeafNode(grammarAccess.getUbqSlotAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1575:2: ( (lv_bounds_2_0= ruleUbqBounds ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1576:1: (lv_bounds_2_0= ruleUbqBounds )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1576:1: (lv_bounds_2_0= ruleUbqBounds )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1577:3: lv_bounds_2_0= ruleUbqBounds
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getBoundsUbqBoundsParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqBounds_in_ruleUbqSlot2419);
                    lv_bounds_2_0=ruleUbqBounds();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bounds",
                    	        		lv_bounds_2_0, 
                    	        		"UbqBounds", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_ruleUbqSlot2430); 

                    createLeafNode(grammarAccess.getUbqSlotAccess().getInKeyword_3(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1603:1: ( (lv_position_4_0= ruleSLOTS ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1604:1: (lv_position_4_0= ruleSLOTS )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1604:1: (lv_position_4_0= ruleSLOTS )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1605:3: lv_position_4_0= ruleSLOTS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getPositionSLOTSEnumRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSLOTS_in_ruleUbqSlot2451);
            lv_position_4_0=ruleSLOTS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"position",
            	        		lv_position_4_0, 
            	        		"SLOTS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,39,FOLLOW_39_in_ruleUbqSlot2461); 

                    createLeafNode(grammarAccess.getUbqSlotAccess().getKindKeyword_5(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1631:1: ( (lv_kind_6_0= ruleSLOT_KIND ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1632:1: (lv_kind_6_0= ruleSLOT_KIND )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1632:1: (lv_kind_6_0= ruleSLOT_KIND )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1633:3: lv_kind_6_0= ruleSLOT_KIND
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getKindSLOT_KINDEnumRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSLOT_KIND_in_ruleUbqSlot2482);
            lv_kind_6_0=ruleSLOT_KIND();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_6_0, 
            	        		"SLOT_KIND", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleUbqSlot2492); 

                    createLeafNode(grammarAccess.getUbqSlotAccess().getStatusKeyword_7(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1659:1: ( (lv_status_8_0= ruleSLOT_STATUS ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1660:1: (lv_status_8_0= ruleSLOT_STATUS )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1660:1: (lv_status_8_0= ruleSLOT_STATUS )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1661:3: lv_status_8_0= ruleSLOT_STATUS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getStatusSLOT_STATUSEnumRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSLOT_STATUS_in_ruleUbqSlot2513);
            lv_status_8_0=ruleSLOT_STATUS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"status",
            	        		lv_status_8_0, 
            	        		"SLOT_STATUS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1683:2: ( '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1683:4: '{' ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_11_0= ruleUbqHandledReactions ) )* '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqSlot2524); 

                            createLeafNode(grammarAccess.getUbqSlotAccess().getLeftCurlyBracketKeyword_9_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1687:1: ( (lv_emitted_10_0= ruleUbqEmmitedActions ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==35) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1688:1: (lv_emitted_10_0= ruleUbqEmmitedActions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1688:1: (lv_emitted_10_0= ruleUbqEmmitedActions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1689:3: lv_emitted_10_0= ruleUbqEmmitedActions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getEmittedUbqEmmitedActionsParserRuleCall_9_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqEmmitedActions_in_ruleUbqSlot2545);
                    	    lv_emitted_10_0=ruleUbqEmmitedActions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"emitted",
                    	    	        		lv_emitted_10_0, 
                    	    	        		"UbqEmmitedActions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1711:3: ( (lv_reacted_11_0= ruleUbqHandledReactions ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1712:1: (lv_reacted_11_0= ruleUbqHandledReactions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1712:1: (lv_reacted_11_0= ruleUbqHandledReactions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1713:3: lv_reacted_11_0= ruleUbqHandledReactions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqSlotAccess().getReactedUbqHandledReactionsParserRuleCall_9_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqHandledReactions_in_ruleUbqSlot2567);
                    	    lv_reacted_11_0=ruleUbqHandledReactions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqSlotRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"reacted",
                    	    	        		lv_reacted_11_0, 
                    	    	        		"UbqHandledReactions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqSlot2578); 

                            createLeafNode(grammarAccess.getUbqSlotAccess().getRightCurlyBracketKeyword_9_3(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqSlot2590); 

                    createLeafNode(grammarAccess.getUbqSlotAccess().getSemicolonKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqSlot


    // $ANTLR start entryRuleUbqLayout
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1751:1: entryRuleUbqLayout returns [EObject current=null] : iv_ruleUbqLayout= ruleUbqLayout EOF ;
    public final EObject entryRuleUbqLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqLayout = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1752:2: (iv_ruleUbqLayout= ruleUbqLayout EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1753:2: iv_ruleUbqLayout= ruleUbqLayout EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqLayoutRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqLayout_in_entryRuleUbqLayout2626);
            iv_ruleUbqLayout=ruleUbqLayout();
            _fsp--;

             current =iv_ruleUbqLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqLayout2636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqLayout


    // $ANTLR start ruleUbqLayout
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1760:1: ruleUbqLayout returns [EObject current=null] : ( 'layout' ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) ) ) ;
    public final EObject ruleUbqLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1765:6: ( ( 'layout' ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1766:1: ( 'layout' ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1766:1: ( 'layout' ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1766:3: 'layout' ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) )
            {
            match(input,40,FOLLOW_40_in_ruleUbqLayout2671); 

                    createLeafNode(grammarAccess.getUbqLayoutAccess().getLayoutKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1770:1: ( (lv_kind_1_0= ruleUBQ_LAYOUT_KIND ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1771:1: (lv_kind_1_0= ruleUBQ_LAYOUT_KIND )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1771:1: (lv_kind_1_0= ruleUBQ_LAYOUT_KIND )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1772:3: lv_kind_1_0= ruleUBQ_LAYOUT_KIND
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqLayoutAccess().getKindUBQ_LAYOUT_KINDEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUBQ_LAYOUT_KIND_in_ruleUbqLayout2692);
            lv_kind_1_0=ruleUBQ_LAYOUT_KIND();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqLayoutRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_1_0, 
            	        		"UBQ_LAYOUT_KIND", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqLayout


    // $ANTLR start entryRuleUbqCursor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1802:1: entryRuleUbqCursor returns [EObject current=null] : iv_ruleUbqCursor= ruleUbqCursor EOF ;
    public final EObject entryRuleUbqCursor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqCursor = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1803:2: (iv_ruleUbqCursor= ruleUbqCursor EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1804:2: iv_ruleUbqCursor= ruleUbqCursor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqCursorRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqCursor_in_entryRuleUbqCursor2728);
            iv_ruleUbqCursor=ruleUbqCursor();
            _fsp--;

             current =iv_ruleUbqCursor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqCursor2738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqCursor


    // $ANTLR start ruleUbqCursor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1811:1: ruleUbqCursor returns [EObject current=null] : ( 'cursor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pos_2_0= ruleUbqPoint ) ) 'dimension' ( (lv_dim_4_0= ruleUbqPoint ) ) ';' ) ;
    public final EObject ruleUbqCursor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_pos_2_0 = null;

        EObject lv_dim_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1816:6: ( ( 'cursor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pos_2_0= ruleUbqPoint ) ) 'dimension' ( (lv_dim_4_0= ruleUbqPoint ) ) ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1817:1: ( 'cursor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pos_2_0= ruleUbqPoint ) ) 'dimension' ( (lv_dim_4_0= ruleUbqPoint ) ) ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1817:1: ( 'cursor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pos_2_0= ruleUbqPoint ) ) 'dimension' ( (lv_dim_4_0= ruleUbqPoint ) ) ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1817:3: 'cursor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_pos_2_0= ruleUbqPoint ) ) 'dimension' ( (lv_dim_4_0= ruleUbqPoint ) ) ';'
            {
            match(input,41,FOLLOW_41_in_ruleUbqCursor2773); 

                    createLeafNode(grammarAccess.getUbqCursorAccess().getCursorKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1821:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1822:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1822:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1823:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqCursor2790); 

            			createLeafNode(grammarAccess.getUbqCursorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCursorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1845:2: ( (lv_pos_2_0= ruleUbqPoint ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1846:1: (lv_pos_2_0= ruleUbqPoint )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1846:1: (lv_pos_2_0= ruleUbqPoint )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1847:3: lv_pos_2_0= ruleUbqPoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqCursorAccess().getPosUbqPointParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUbqPoint_in_ruleUbqCursor2816);
            lv_pos_2_0=ruleUbqPoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCursorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"pos",
            	        		lv_pos_2_0, 
            	        		"UbqPoint", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,42,FOLLOW_42_in_ruleUbqCursor2826); 

                    createLeafNode(grammarAccess.getUbqCursorAccess().getDimensionKeyword_3(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1873:1: ( (lv_dim_4_0= ruleUbqPoint ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1874:1: (lv_dim_4_0= ruleUbqPoint )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1874:1: (lv_dim_4_0= ruleUbqPoint )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1875:3: lv_dim_4_0= ruleUbqPoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqCursorAccess().getDimUbqPointParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUbqPoint_in_ruleUbqCursor2847);
            lv_dim_4_0=ruleUbqPoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCursorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dim",
            	        		lv_dim_4_0, 
            	        		"UbqPoint", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleUbqCursor2857); 

                    createLeafNode(grammarAccess.getUbqCursorAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqCursor


    // $ANTLR start entryRuleUbqComposite
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1909:1: entryRuleUbqComposite returns [EObject current=null] : iv_ruleUbqComposite= ruleUbqComposite EOF ;
    public final EObject entryRuleUbqComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqComposite = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1910:2: (iv_ruleUbqComposite= ruleUbqComposite EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1911:2: iv_ruleUbqComposite= ruleUbqComposite EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqCompositeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqComposite_in_entryRuleUbqComposite2893);
            iv_ruleUbqComposite=ruleUbqComposite();
            _fsp--;

             current =iv_ruleUbqComposite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqComposite2903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqComposite


    // $ANTLR start ruleUbqComposite
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1918:1: ruleUbqComposite returns [EObject current=null] : ( 'composite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) ) ( (lv_layout_3_0= ruleUbqLayout ) )? ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) ) ) ;
    public final EObject ruleUbqComposite() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_layout_3_0 = null;

        EObject lv_children_6_1 = null;

        EObject lv_children_6_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1923:6: ( ( 'composite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) ) ( (lv_layout_3_0= ruleUbqLayout ) )? ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1924:1: ( 'composite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) ) ( (lv_layout_3_0= ruleUbqLayout ) )? ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1924:1: ( 'composite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) ) ( (lv_layout_3_0= ruleUbqLayout ) )? ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1924:3: 'composite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bounds_2_0= ruleUbqBounds ) ) ( (lv_layout_3_0= ruleUbqLayout ) )? ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) )
            {
            match(input,43,FOLLOW_43_in_ruleUbqComposite2938); 

                    createLeafNode(grammarAccess.getUbqCompositeAccess().getCompositeKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1928:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1929:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1929:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1930:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqComposite2955); 

            			createLeafNode(grammarAccess.getUbqCompositeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCompositeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1952:2: ( (lv_bounds_2_0= ruleUbqBounds ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1953:1: (lv_bounds_2_0= ruleUbqBounds )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1953:1: (lv_bounds_2_0= ruleUbqBounds )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1954:3: lv_bounds_2_0= ruleUbqBounds
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUbqCompositeAccess().getBoundsUbqBoundsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUbqBounds_in_ruleUbqComposite2981);
            lv_bounds_2_0=ruleUbqBounds();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCompositeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"bounds",
            	        		lv_bounds_2_0, 
            	        		"UbqBounds", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1976:2: ( (lv_layout_3_0= ruleUbqLayout ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1977:1: (lv_layout_3_0= ruleUbqLayout )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1977:1: (lv_layout_3_0= ruleUbqLayout )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:1978:3: lv_layout_3_0= ruleUbqLayout
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqCompositeAccess().getLayoutUbqLayoutParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqLayout_in_ruleUbqComposite3002);
                    lv_layout_3_0=ruleUbqLayout();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqCompositeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"layout",
                    	        		lv_layout_3_0, 
                    	        		"UbqLayout", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2000:3: ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            else if ( (LA41_0==33) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2000:3: ( ';' | ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2000:5: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleUbqComposite3014); 

                            createLeafNode(grammarAccess.getUbqCompositeAccess().getSemicolonKeyword_4_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2005:6: ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2005:6: ( '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2005:8: '{' ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )* '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqComposite3031); 

                            createLeafNode(grammarAccess.getUbqCompositeAccess().getLeftCurlyBracketKeyword_4_1_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2009:1: ( ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==43||LA40_0==47||(LA40_0>=50 && LA40_0<=51)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2010:1: ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2010:1: ( (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2011:1: (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2011:1: (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget )
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==43) ) {
                    	        alt39=1;
                    	    }
                    	    else if ( (LA39_0==47||(LA39_0>=50 && LA39_0<=51)) ) {
                    	        alt39=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("2011:1: (lv_children_6_1= ruleUbqComposite | lv_children_6_2= ruleUbqWidget )", 39, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2012:3: lv_children_6_1= ruleUbqComposite
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getUbqCompositeAccess().getChildrenUbqCompositeParserRuleCall_4_1_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleUbqComposite_in_ruleUbqComposite3054);
                    	            lv_children_6_1=ruleUbqComposite();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getUbqCompositeRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_6_1, 
                    	            	        		"UbqComposite", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2033:8: lv_children_6_2= ruleUbqWidget
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getUbqCompositeAccess().getChildrenUbqWidgetParserRuleCall_4_1_1_0_1(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleUbqWidget_in_ruleUbqComposite3073);
                    	            lv_children_6_2=ruleUbqWidget();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getUbqCompositeRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_6_2, 
                    	            	        		"UbqWidget", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqComposite3087); 

                            createLeafNode(grammarAccess.getUbqCompositeAccess().getRightCurlyBracketKeyword_4_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqComposite


    // $ANTLR start entryRuleUbqPoint
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2069:1: entryRuleUbqPoint returns [EObject current=null] : iv_ruleUbqPoint= ruleUbqPoint EOF ;
    public final EObject entryRuleUbqPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqPoint = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2070:2: (iv_ruleUbqPoint= ruleUbqPoint EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2071:2: iv_ruleUbqPoint= ruleUbqPoint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqPointRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqPoint_in_entryRuleUbqPoint3125);
            iv_ruleUbqPoint=ruleUbqPoint();
            _fsp--;

             current =iv_ruleUbqPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqPoint3135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqPoint


    // $ANTLR start ruleUbqPoint
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2078:1: ruleUbqPoint returns [EObject current=null] : ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ')' ) ;
    public final EObject ruleUbqPoint() throws RecognitionException {
        EObject current = null;

        Token lv_x_1_0=null;
        Token lv_y_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2083:6: ( ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ')' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2084:1: ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ')' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2084:1: ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ')' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2084:3: '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ')'
            {
            match(input,44,FOLLOW_44_in_ruleUbqPoint3170); 

                    createLeafNode(grammarAccess.getUbqPointAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2088:1: ( (lv_x_1_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2089:1: (lv_x_1_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2089:1: (lv_x_1_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2090:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqPoint3187); 

            			createLeafNode(grammarAccess.getUbqPointAccess().getXINTTerminalRuleCall_1_0(), "x"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqPointRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"x",
            	        		lv_x_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqPoint3202); 

                    createLeafNode(grammarAccess.getUbqPointAccess().getCommaKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2116:1: ( (lv_y_3_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2117:1: (lv_y_3_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2117:1: (lv_y_3_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2118:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqPoint3219); 

            			createLeafNode(grammarAccess.getUbqPointAccess().getYINTTerminalRuleCall_3_0(), "y"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqPointRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"y",
            	        		lv_y_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,45,FOLLOW_45_in_ruleUbqPoint3234); 

                    createLeafNode(grammarAccess.getUbqPointAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqPoint


    // $ANTLR start entryRuleUbqBounds
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2152:1: entryRuleUbqBounds returns [EObject current=null] : iv_ruleUbqBounds= ruleUbqBounds EOF ;
    public final EObject entryRuleUbqBounds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqBounds = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2153:2: (iv_ruleUbqBounds= ruleUbqBounds EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2154:2: iv_ruleUbqBounds= ruleUbqBounds EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqBoundsRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqBounds_in_entryRuleUbqBounds3270);
            iv_ruleUbqBounds=ruleUbqBounds();
            _fsp--;

             current =iv_ruleUbqBounds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqBounds3280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqBounds


    // $ANTLR start ruleUbqBounds
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2161:1: ruleUbqBounds returns [EObject current=null] : ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ',' ( (lv_width_5_0= RULE_INT ) ) ',' ( (lv_height_7_0= RULE_INT ) ) ')' ) ;
    public final EObject ruleUbqBounds() throws RecognitionException {
        EObject current = null;

        Token lv_x_1_0=null;
        Token lv_y_3_0=null;
        Token lv_width_5_0=null;
        Token lv_height_7_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2166:6: ( ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ',' ( (lv_width_5_0= RULE_INT ) ) ',' ( (lv_height_7_0= RULE_INT ) ) ')' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2167:1: ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ',' ( (lv_width_5_0= RULE_INT ) ) ',' ( (lv_height_7_0= RULE_INT ) ) ')' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2167:1: ( '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ',' ( (lv_width_5_0= RULE_INT ) ) ',' ( (lv_height_7_0= RULE_INT ) ) ')' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2167:3: '(' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ',' ( (lv_width_5_0= RULE_INT ) ) ',' ( (lv_height_7_0= RULE_INT ) ) ')'
            {
            match(input,44,FOLLOW_44_in_ruleUbqBounds3315); 

                    createLeafNode(grammarAccess.getUbqBoundsAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2171:1: ( (lv_x_1_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2172:1: (lv_x_1_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2172:1: (lv_x_1_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2173:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqBounds3332); 

            			createLeafNode(grammarAccess.getUbqBoundsAccess().getXINTTerminalRuleCall_1_0(), "x"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqBoundsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"x",
            	        		lv_x_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqBounds3347); 

                    createLeafNode(grammarAccess.getUbqBoundsAccess().getCommaKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2199:1: ( (lv_y_3_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2200:1: (lv_y_3_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2200:1: (lv_y_3_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2201:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqBounds3364); 

            			createLeafNode(grammarAccess.getUbqBoundsAccess().getYINTTerminalRuleCall_3_0(), "y"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqBoundsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"y",
            	        		lv_y_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqBounds3379); 

                    createLeafNode(grammarAccess.getUbqBoundsAccess().getCommaKeyword_4(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2227:1: ( (lv_width_5_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2228:1: (lv_width_5_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2228:1: (lv_width_5_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2229:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqBounds3396); 

            			createLeafNode(grammarAccess.getUbqBoundsAccess().getWidthINTTerminalRuleCall_5_0(), "width"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqBoundsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"width",
            	        		lv_width_5_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqBounds3411); 

                    createLeafNode(grammarAccess.getUbqBoundsAccess().getCommaKeyword_6(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2255:1: ( (lv_height_7_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2256:1: (lv_height_7_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2256:1: (lv_height_7_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2257:3: lv_height_7_0= RULE_INT
            {
            lv_height_7_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqBounds3428); 

            			createLeafNode(grammarAccess.getUbqBoundsAccess().getHeightINTTerminalRuleCall_7_0(), "height"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqBoundsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"height",
            	        		lv_height_7_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,45,FOLLOW_45_in_ruleUbqBounds3443); 

                    createLeafNode(grammarAccess.getUbqBoundsAccess().getRightParenthesisKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqBounds


    // $ANTLR start entryRuleUbqWidget
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2291:1: entryRuleUbqWidget returns [EObject current=null] : iv_ruleUbqWidget= ruleUbqWidget EOF ;
    public final EObject entryRuleUbqWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqWidget = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2292:2: (iv_ruleUbqWidget= ruleUbqWidget EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2293:2: iv_ruleUbqWidget= ruleUbqWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqWidgetRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqWidget_in_entryRuleUbqWidget3479);
            iv_ruleUbqWidget=ruleUbqWidget();
            _fsp--;

             current =iv_ruleUbqWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqWidget3489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqWidget


    // $ANTLR start ruleUbqWidget
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2300:1: ruleUbqWidget returns [EObject current=null] : ( (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox ) ( 'in' ( ( RULE_ID ) ) )? ( (lv_bounds_5_0= ruleUbqBounds ) )? ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )? ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )? ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )? ';' ) ;
    public final EObject ruleUbqWidget() throws RecognitionException {
        EObject current = null;

        Token lv_angle_7_0=null;
        EObject this_UbqButton_0 = null;

        EObject this_UbqLabel_1 = null;

        EObject this_UbqCheckbox_2 = null;

        EObject lv_bounds_5_0 = null;

        EObject lv_style_9_1 = null;

        EObject lv_emitted_11_0 = null;

        EObject lv_reacted_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2305:6: ( ( (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox ) ( 'in' ( ( RULE_ID ) ) )? ( (lv_bounds_5_0= ruleUbqBounds ) )? ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )? ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )? ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2306:1: ( (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox ) ( 'in' ( ( RULE_ID ) ) )? ( (lv_bounds_5_0= ruleUbqBounds ) )? ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )? ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )? ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2306:1: ( (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox ) ( 'in' ( ( RULE_ID ) ) )? ( (lv_bounds_5_0= ruleUbqBounds ) )? ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )? ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )? ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2306:2: (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox ) ( 'in' ( ( RULE_ID ) ) )? ( (lv_bounds_5_0= ruleUbqBounds ) )? ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )? ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )? ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )? ';'
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2306:2: (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt42=1;
                }
                break;
            case 50:
                {
                alt42=2;
                }
                break;
            case 51:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2306:2: (this_UbqButton_0= ruleUbqButton | this_UbqLabel_1= ruleUbqLabel | this_UbqCheckbox_2= ruleUbqCheckbox )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2307:5: this_UbqButton_0= ruleUbqButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getUbqButtonParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUbqButton_in_ruleUbqWidget3537);
                    this_UbqButton_0=ruleUbqButton();
                    _fsp--;

                     
                            current = this_UbqButton_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2317:5: this_UbqLabel_1= ruleUbqLabel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getUbqLabelParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUbqLabel_in_ruleUbqWidget3564);
                    this_UbqLabel_1=ruleUbqLabel();
                    _fsp--;

                     
                            current = this_UbqLabel_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2327:5: this_UbqCheckbox_2= ruleUbqCheckbox
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getUbqCheckboxParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUbqCheckbox_in_ruleUbqWidget3591);
                    this_UbqCheckbox_2=ruleUbqCheckbox();
                    _fsp--;

                     
                            current = this_UbqCheckbox_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2335:2: ( 'in' ( ( RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2335:4: 'in' ( ( RULE_ID ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleUbqWidget3602); 

                            createLeafNode(grammarAccess.getUbqWidgetAccess().getInKeyword_1_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2339:1: ( ( RULE_ID ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2340:1: ( RULE_ID )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2340:1: ( RULE_ID )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2341:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqWidget3620); 

                    		createLeafNode(grammarAccess.getUbqWidgetAccess().getParentUbqCompositeCrossReference_1_1_0(), "parent"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2353:4: ( (lv_bounds_5_0= ruleUbqBounds ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2354:1: (lv_bounds_5_0= ruleUbqBounds )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2354:1: (lv_bounds_5_0= ruleUbqBounds )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2355:3: lv_bounds_5_0= ruleUbqBounds
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getBoundsUbqBoundsParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqBounds_in_ruleUbqWidget3643);
                    lv_bounds_5_0=ruleUbqBounds();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bounds",
                    	        		lv_bounds_5_0, 
                    	        		"UbqBounds", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2377:3: ( 'angle' ( (lv_angle_7_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2377:5: 'angle' ( (lv_angle_7_0= RULE_INT ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleUbqWidget3655); 

                            createLeafNode(grammarAccess.getUbqWidgetAccess().getAngleKeyword_3_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2381:1: ( (lv_angle_7_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2382:1: (lv_angle_7_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2382:1: (lv_angle_7_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2383:3: lv_angle_7_0= RULE_INT
                    {
                    lv_angle_7_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqWidget3672); 

                    			createLeafNode(grammarAccess.getUbqWidgetAccess().getAngleINTTerminalRuleCall_3_1_0(), "angle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"angle",
                    	        		lv_angle_7_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2405:4: ( 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2405:6: 'style' ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleUbqWidget3690); 

                            createLeafNode(grammarAccess.getUbqWidgetAccess().getStyleKeyword_4_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2409:1: ( ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2410:1: ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2410:1: ( (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2411:1: (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2411:1: (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==60) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_ID) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2411:1: (lv_style_9_1= ruleUbqWidgetStyle | RULE_ID )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2412:3: lv_style_9_1= ruleUbqWidgetStyle
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getStyleUbqWidgetStyleParserRuleCall_4_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleUbqWidgetStyle_in_ruleUbqWidget3713);
                            lv_style_9_1=ruleUbqWidgetStyle();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"style",
                            	        		lv_style_9_1, 
                            	        		"UbqWidgetStyle", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }
                            break;
                        case 2 :
                            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2433:8: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqWidget3729); 

                            		createLeafNode(grammarAccess.getUbqWidgetAccess().getStyleUbqWidgetStyleCrossReference_4_1_0_1(), "style"); 
                            	

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2447:4: ( '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2447:6: '{' ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )* ( (lv_reacted_12_0= ruleUbqHandledReactions ) )* '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqWidget3745); 

                            createLeafNode(grammarAccess.getUbqWidgetAccess().getLeftCurlyBracketKeyword_5_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2451:1: ( (lv_emitted_11_0= ruleUbqEmmitedActions ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==35) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2452:1: (lv_emitted_11_0= ruleUbqEmmitedActions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2452:1: (lv_emitted_11_0= ruleUbqEmmitedActions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2453:3: lv_emitted_11_0= ruleUbqEmmitedActions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getEmittedUbqEmmitedActionsParserRuleCall_5_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqEmmitedActions_in_ruleUbqWidget3766);
                    	    lv_emitted_11_0=ruleUbqEmmitedActions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"emitted",
                    	    	        		lv_emitted_11_0, 
                    	    	        		"UbqEmmitedActions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2475:3: ( (lv_reacted_12_0= ruleUbqHandledReactions ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2476:1: (lv_reacted_12_0= ruleUbqHandledReactions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2476:1: (lv_reacted_12_0= ruleUbqHandledReactions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2477:3: lv_reacted_12_0= ruleUbqHandledReactions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetAccess().getReactedUbqHandledReactionsParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqHandledReactions_in_ruleUbqWidget3788);
                    	    lv_reacted_12_0=ruleUbqHandledReactions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqWidgetRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		set(
                    	    	       			current, 
                    	    	       			"reacted",
                    	    	        		lv_reacted_12_0, 
                    	    	        		"UbqHandledReactions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqWidget3799); 

                            createLeafNode(grammarAccess.getUbqWidgetAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqWidget3811); 

                    createLeafNode(grammarAccess.getUbqWidgetAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqWidget


    // $ANTLR start entryRuleUbqButton
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2517:1: entryRuleUbqButton returns [EObject current=null] : iv_ruleUbqButton= ruleUbqButton EOF ;
    public final EObject entryRuleUbqButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqButton = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2518:2: (iv_ruleUbqButton= ruleUbqButton EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2519:2: iv_ruleUbqButton= ruleUbqButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqButton_in_entryRuleUbqButton3849);
            iv_ruleUbqButton=ruleUbqButton();
            _fsp--;

             current =iv_ruleUbqButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqButton3859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqButton


    // $ANTLR start ruleUbqButton
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2526:1: ruleUbqButton returns [EObject current=null] : ( 'button' ( (lv_name_1_0= RULE_ID ) ) ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUbqButton() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_text_3_0=null;
        Token lv_image_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2531:6: ( ( 'button' ( (lv_name_1_0= RULE_ID ) ) ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )? ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2532:1: ( 'button' ( (lv_name_1_0= RULE_ID ) ) ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )? )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2532:1: ( 'button' ( (lv_name_1_0= RULE_ID ) ) ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )? )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2532:3: 'button' ( (lv_name_1_0= RULE_ID ) ) ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )?
            {
            match(input,47,FOLLOW_47_in_ruleUbqButton3894); 

                    createLeafNode(grammarAccess.getUbqButtonAccess().getButtonKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2536:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2537:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2537:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2538:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqButton3911); 

            			createLeafNode(grammarAccess.getUbqButtonAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2560:2: ( 'text' ( (lv_text_3_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2560:4: 'text' ( (lv_text_3_0= RULE_STRING ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleUbqButton3927); 

                            createLeafNode(grammarAccess.getUbqButtonAccess().getTextKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2564:1: ( (lv_text_3_0= RULE_STRING ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2565:1: (lv_text_3_0= RULE_STRING )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2565:1: (lv_text_3_0= RULE_STRING )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2566:3: lv_text_3_0= RULE_STRING
                    {
                    lv_text_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqButton3944); 

                    			createLeafNode(grammarAccess.getUbqButtonAccess().getTextSTRINGTerminalRuleCall_2_1_0(), "text"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqButtonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"text",
                    	        		lv_text_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2588:4: ( 'image' ( (lv_image_5_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2588:6: 'image' ( (lv_image_5_0= RULE_STRING ) )
                    {
                    match(input,49,FOLLOW_49_in_ruleUbqButton3962); 

                            createLeafNode(grammarAccess.getUbqButtonAccess().getImageKeyword_3_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2592:1: ( (lv_image_5_0= RULE_STRING ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2593:1: (lv_image_5_0= RULE_STRING )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2593:1: (lv_image_5_0= RULE_STRING )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2594:3: lv_image_5_0= RULE_STRING
                    {
                    lv_image_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqButton3979); 

                    			createLeafNode(grammarAccess.getUbqButtonAccess().getImageSTRINGTerminalRuleCall_3_1_0(), "image"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqButtonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqButton


    // $ANTLR start entryRuleUbqLabel
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2624:1: entryRuleUbqLabel returns [EObject current=null] : iv_ruleUbqLabel= ruleUbqLabel EOF ;
    public final EObject entryRuleUbqLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqLabel = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2625:2: (iv_ruleUbqLabel= ruleUbqLabel EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2626:2: iv_ruleUbqLabel= ruleUbqLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqLabel_in_entryRuleUbqLabel4022);
            iv_ruleUbqLabel=ruleUbqLabel();
            _fsp--;

             current =iv_ruleUbqLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqLabel4032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqLabel


    // $ANTLR start ruleUbqLabel
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2633:1: ruleUbqLabel returns [EObject current=null] : ( 'label' ( (lv_name_1_0= RULE_ID ) ) 'text' ( (lv_text_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleUbqLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_text_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2638:6: ( ( 'label' ( (lv_name_1_0= RULE_ID ) ) 'text' ( (lv_text_3_0= RULE_STRING ) ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2639:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) 'text' ( (lv_text_3_0= RULE_STRING ) ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2639:1: ( 'label' ( (lv_name_1_0= RULE_ID ) ) 'text' ( (lv_text_3_0= RULE_STRING ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2639:3: 'label' ( (lv_name_1_0= RULE_ID ) ) 'text' ( (lv_text_3_0= RULE_STRING ) )
            {
            match(input,50,FOLLOW_50_in_ruleUbqLabel4067); 

                    createLeafNode(grammarAccess.getUbqLabelAccess().getLabelKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2643:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2644:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2644:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2645:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqLabel4084); 

            			createLeafNode(grammarAccess.getUbqLabelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,48,FOLLOW_48_in_ruleUbqLabel4099); 

                    createLeafNode(grammarAccess.getUbqLabelAccess().getTextKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2671:1: ( (lv_text_3_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2672:1: (lv_text_3_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2672:1: (lv_text_3_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2673:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqLabel4116); 

            			createLeafNode(grammarAccess.getUbqLabelAccess().getTextSTRINGTerminalRuleCall_3_0(), "text"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqLabel


    // $ANTLR start entryRuleUbqCheckbox
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2703:1: entryRuleUbqCheckbox returns [EObject current=null] : iv_ruleUbqCheckbox= ruleUbqCheckbox EOF ;
    public final EObject entryRuleUbqCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqCheckbox = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2704:2: (iv_ruleUbqCheckbox= ruleUbqCheckbox EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2705:2: iv_ruleUbqCheckbox= ruleUbqCheckbox EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqCheckboxRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqCheckbox_in_entryRuleUbqCheckbox4157);
            iv_ruleUbqCheckbox=ruleUbqCheckbox();
            _fsp--;

             current =iv_ruleUbqCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqCheckbox4167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqCheckbox


    // $ANTLR start ruleUbqCheckbox
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2712:1: ruleUbqCheckbox returns [EObject current=null] : ( 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checked_2_0= 'checked' ) )? ) ;
    public final EObject ruleUbqCheckbox() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_checked_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2717:6: ( ( 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checked_2_0= 'checked' ) )? ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2718:1: ( 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checked_2_0= 'checked' ) )? )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2718:1: ( 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checked_2_0= 'checked' ) )? )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2718:3: 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checked_2_0= 'checked' ) )?
            {
            match(input,51,FOLLOW_51_in_ruleUbqCheckbox4202); 

                    createLeafNode(grammarAccess.getUbqCheckboxAccess().getCheckboxKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2722:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2723:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2723:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2724:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqCheckbox4219); 

            			createLeafNode(grammarAccess.getUbqCheckboxAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqCheckboxRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2746:2: ( (lv_checked_2_0= 'checked' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2747:1: (lv_checked_2_0= 'checked' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2747:1: (lv_checked_2_0= 'checked' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2748:3: lv_checked_2_0= 'checked'
                    {
                    lv_checked_2_0=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleUbqCheckbox4242); 

                            createLeafNode(grammarAccess.getUbqCheckboxAccess().getCheckedCheckedKeyword_2_0(), "checked"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqCheckboxRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "checked", true, "checked", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqCheckbox


    // $ANTLR start entryRuleUbqMenu
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2777:1: entryRuleUbqMenu returns [EObject current=null] : iv_ruleUbqMenu= ruleUbqMenu EOF ;
    public final EObject entryRuleUbqMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqMenu = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2778:2: (iv_ruleUbqMenu= ruleUbqMenu EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2779:2: iv_ruleUbqMenu= ruleUbqMenu EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqMenuRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqMenu_in_entryRuleUbqMenu4294);
            iv_ruleUbqMenu=ruleUbqMenu();
            _fsp--;

             current =iv_ruleUbqMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqMenu4304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqMenu


    // $ANTLR start ruleUbqMenu
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2786:1: ruleUbqMenu returns [EObject current=null] : ( 'menu' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )? ';' ) ;
    public final EObject ruleUbqMenu() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_children_3_1 = null;

        EObject lv_children_3_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2791:6: ( ( 'menu' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2792:1: ( 'menu' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2792:1: ( 'menu' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2792:3: 'menu' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )? ';'
            {
            match(input,53,FOLLOW_53_in_ruleUbqMenu4339); 

                    createLeafNode(grammarAccess.getUbqMenuAccess().getMenuKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2796:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2797:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2797:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2798:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqMenu4356); 

            			createLeafNode(grammarAccess.getUbqMenuAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqMenuRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2820:2: ( '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==33) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2820:4: '{' ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+ '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqMenu4372); 

                            createLeafNode(grammarAccess.getUbqMenuAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2824:1: ( ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=53 && LA55_0<=54)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2825:1: ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2825:1: ( (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2826:1: (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2826:1: (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem )
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( (LA54_0==53) ) {
                    	        alt54=1;
                    	    }
                    	    else if ( (LA54_0==54) ) {
                    	        alt54=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("2826:1: (lv_children_3_1= ruleUbqMenu | lv_children_3_2= ruleUbqMenuItem )", 54, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2827:3: lv_children_3_1= ruleUbqMenu
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getUbqMenuAccess().getChildrenUbqMenuParserRuleCall_2_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleUbqMenu_in_ruleUbqMenu4395);
                    	            lv_children_3_1=ruleUbqMenu();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getUbqMenuRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_3_1, 
                    	            	        		"UbqMenu", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2848:8: lv_children_3_2= ruleUbqMenuItem
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getUbqMenuAccess().getChildrenUbqMenuItemParserRuleCall_2_1_0_1(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleUbqMenuItem_in_ruleUbqMenu4414);
                    	            lv_children_3_2=ruleUbqMenuItem();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getUbqMenuRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_3_2, 
                    	            	        		"UbqMenuItem", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqMenu4428); 

                            createLeafNode(grammarAccess.getUbqMenuAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqMenu4440); 

                    createLeafNode(grammarAccess.getUbqMenuAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqMenu


    // $ANTLR start entryRuleUbqMenuItem
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2888:1: entryRuleUbqMenuItem returns [EObject current=null] : iv_ruleUbqMenuItem= ruleUbqMenuItem EOF ;
    public final EObject entryRuleUbqMenuItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqMenuItem = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2889:2: (iv_ruleUbqMenuItem= ruleUbqMenuItem EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2890:2: iv_ruleUbqMenuItem= ruleUbqMenuItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqMenuItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqMenuItem_in_entryRuleUbqMenuItem4476);
            iv_ruleUbqMenuItem=ruleUbqMenuItem();
            _fsp--;

             current =iv_ruleUbqMenuItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqMenuItem4486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqMenuItem


    // $ANTLR start ruleUbqMenuItem
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2897:1: ruleUbqMenuItem returns [EObject current=null] : ( 'menuitem' ( (lv_name_1_0= RULE_ID ) ) 'title' ( (lv_title_3_0= RULE_STRING ) ) ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )? ';' ) ;
    public final EObject ruleUbqMenuItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_title_3_0=null;
        EObject lv_emitted_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2902:6: ( ( 'menuitem' ( (lv_name_1_0= RULE_ID ) ) 'title' ( (lv_title_3_0= RULE_STRING ) ) ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2903:1: ( 'menuitem' ( (lv_name_1_0= RULE_ID ) ) 'title' ( (lv_title_3_0= RULE_STRING ) ) ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2903:1: ( 'menuitem' ( (lv_name_1_0= RULE_ID ) ) 'title' ( (lv_title_3_0= RULE_STRING ) ) ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2903:3: 'menuitem' ( (lv_name_1_0= RULE_ID ) ) 'title' ( (lv_title_3_0= RULE_STRING ) ) ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )? ';'
            {
            match(input,54,FOLLOW_54_in_ruleUbqMenuItem4521); 

                    createLeafNode(grammarAccess.getUbqMenuItemAccess().getMenuitemKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2907:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2908:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2908:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2909:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUbqMenuItem4538); 

            			createLeafNode(grammarAccess.getUbqMenuItemAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqMenuItemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,55,FOLLOW_55_in_ruleUbqMenuItem4553); 

                    createLeafNode(grammarAccess.getUbqMenuItemAccess().getTitleKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2935:1: ( (lv_title_3_0= RULE_STRING ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2936:1: (lv_title_3_0= RULE_STRING )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2936:1: (lv_title_3_0= RULE_STRING )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2937:3: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqMenuItem4570); 

            			createLeafNode(grammarAccess.getUbqMenuItemAccess().getTitleSTRINGTerminalRuleCall_3_0(), "title"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqMenuItemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2959:2: ( '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==33) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2959:4: '{' ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )* '}'
                    {
                    match(input,33,FOLLOW_33_in_ruleUbqMenuItem4586); 

                            createLeafNode(grammarAccess.getUbqMenuItemAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2963:1: ( (lv_emitted_5_0= ruleUbqEmmitedActions ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==35) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2964:1: (lv_emitted_5_0= ruleUbqEmmitedActions )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2964:1: (lv_emitted_5_0= ruleUbqEmmitedActions )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:2965:3: lv_emitted_5_0= ruleUbqEmmitedActions
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqMenuItemAccess().getEmittedUbqEmmitedActionsParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUbqEmmitedActions_in_ruleUbqMenuItem4607);
                    	    lv_emitted_5_0=ruleUbqEmmitedActions();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqMenuItemRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"emitted",
                    	    	        		lv_emitted_5_0, 
                    	    	        		"UbqEmmitedActions", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleUbqMenuItem4618); 

                            createLeafNode(grammarAccess.getUbqMenuItemAccess().getRightCurlyBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleUbqMenuItem4630); 

                    createLeafNode(grammarAccess.getUbqMenuItemAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqMenuItem


    // $ANTLR start entryRuleUbqIncrementableRange
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3003:1: entryRuleUbqIncrementableRange returns [EObject current=null] : iv_ruleUbqIncrementableRange= ruleUbqIncrementableRange EOF ;
    public final EObject entryRuleUbqIncrementableRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqIncrementableRange = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3004:2: (iv_ruleUbqIncrementableRange= ruleUbqIncrementableRange EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3005:2: iv_ruleUbqIncrementableRange= ruleUbqIncrementableRange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqIncrementableRangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqIncrementableRange_in_entryRuleUbqIncrementableRange4666);
            iv_ruleUbqIncrementableRange=ruleUbqIncrementableRange();
            _fsp--;

             current =iv_ruleUbqIncrementableRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqIncrementableRange4676); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqIncrementableRange


    // $ANTLR start ruleUbqIncrementableRange
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3012:1: ruleUbqIncrementableRange returns [EObject current=null] : ( '[' ( (lv_min_1_0= RULE_INT ) ) '..' ( (lv_max_3_0= RULE_INT ) ) ( 'init' ( (lv_val_5_0= RULE_INT ) ) )? ']' ) ;
    public final EObject ruleUbqIncrementableRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token lv_max_3_0=null;
        Token lv_val_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3017:6: ( ( '[' ( (lv_min_1_0= RULE_INT ) ) '..' ( (lv_max_3_0= RULE_INT ) ) ( 'init' ( (lv_val_5_0= RULE_INT ) ) )? ']' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3018:1: ( '[' ( (lv_min_1_0= RULE_INT ) ) '..' ( (lv_max_3_0= RULE_INT ) ) ( 'init' ( (lv_val_5_0= RULE_INT ) ) )? ']' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3018:1: ( '[' ( (lv_min_1_0= RULE_INT ) ) '..' ( (lv_max_3_0= RULE_INT ) ) ( 'init' ( (lv_val_5_0= RULE_INT ) ) )? ']' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3018:3: '[' ( (lv_min_1_0= RULE_INT ) ) '..' ( (lv_max_3_0= RULE_INT ) ) ( 'init' ( (lv_val_5_0= RULE_INT ) ) )? ']'
            {
            match(input,56,FOLLOW_56_in_ruleUbqIncrementableRange4711); 

                    createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3022:1: ( (lv_min_1_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3023:1: (lv_min_1_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3023:1: (lv_min_1_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3024:3: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4728); 

            			createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getMinINTTerminalRuleCall_1_0(), "min"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqIncrementableRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"min",
            	        		lv_min_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,57,FOLLOW_57_in_ruleUbqIncrementableRange4743); 

                    createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getFullStopFullStopKeyword_2(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3050:1: ( (lv_max_3_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3051:1: (lv_max_3_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3051:1: (lv_max_3_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3052:3: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4760); 

            			createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getMaxINTTerminalRuleCall_3_0(), "max"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqIncrementableRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"max",
            	        		lv_max_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3074:2: ( 'init' ( (lv_val_5_0= RULE_INT ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3074:4: 'init' ( (lv_val_5_0= RULE_INT ) )
                    {
                    match(input,58,FOLLOW_58_in_ruleUbqIncrementableRange4776); 

                            createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getInitKeyword_4_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3078:1: ( (lv_val_5_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3079:1: (lv_val_5_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3079:1: (lv_val_5_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3080:3: lv_val_5_0= RULE_INT
                    {
                    lv_val_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4793); 

                    			createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getValINTTerminalRuleCall_4_1_0(), "val"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqIncrementableRangeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"val",
                    	        		lv_val_5_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_ruleUbqIncrementableRange4810); 

                    createLeafNode(grammarAccess.getUbqIncrementableRangeAccess().getRightSquareBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqIncrementableRange


    // $ANTLR start entryRuleUbqWidgetStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3122:1: entryRuleUbqWidgetStyle returns [EObject current=null] : iv_ruleUbqWidgetStyle= ruleUbqWidgetStyle EOF ;
    public final EObject entryRuleUbqWidgetStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqWidgetStyle = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3123:2: (iv_ruleUbqWidgetStyle= ruleUbqWidgetStyle EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3124:2: iv_ruleUbqWidgetStyle= ruleUbqWidgetStyle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqWidgetStyleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqWidgetStyle_in_entryRuleUbqWidgetStyle4854);
            iv_ruleUbqWidgetStyle=ruleUbqWidgetStyle();
            _fsp--;

             current =iv_ruleUbqWidgetStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqWidgetStyle4864); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqWidgetStyle


    // $ANTLR start ruleUbqWidgetStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3131:1: ruleUbqWidgetStyle returns [EObject current=null] : ( 'widget:style {' ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )? ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )? ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )? '}' ) ;
    public final EObject ruleUbqWidgetStyle() throws RecognitionException {
        EObject current = null;

        EObject lv_colorStyle_1_0 = null;

        EObject lv_fontStyleStyle_2_0 = null;

        EObject lv_borderStyle_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3136:6: ( ( 'widget:style {' ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )? ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )? ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )? '}' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3137:1: ( 'widget:style {' ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )? ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )? ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )? '}' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3137:1: ( 'widget:style {' ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )? ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )? ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )? '}' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3137:3: 'widget:style {' ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )? ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )? ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )? '}'
            {
            match(input,60,FOLLOW_60_in_ruleUbqWidgetStyle4899); 

                    createLeafNode(grammarAccess.getUbqWidgetStyleAccess().getWidgetStyleKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3141:1: ( (lv_colorStyle_1_0= ruleUbqColorStyle ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3142:1: (lv_colorStyle_1_0= ruleUbqColorStyle )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3142:1: (lv_colorStyle_1_0= ruleUbqColorStyle )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3143:3: lv_colorStyle_1_0= ruleUbqColorStyle
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetStyleAccess().getColorStyleUbqColorStyleParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqColorStyle_in_ruleUbqWidgetStyle4920);
                    lv_colorStyle_1_0=ruleUbqColorStyle();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"colorStyle",
                    	        		lv_colorStyle_1_0, 
                    	        		"UbqColorStyle", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3165:3: ( (lv_fontStyleStyle_2_0= ruleUbqFontStyle ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3166:1: (lv_fontStyleStyle_2_0= ruleUbqFontStyle )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3166:1: (lv_fontStyleStyle_2_0= ruleUbqFontStyle )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3167:3: lv_fontStyleStyle_2_0= ruleUbqFontStyle
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetStyleAccess().getFontStyleStyleUbqFontStyleParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqFontStyle_in_ruleUbqWidgetStyle4942);
                    lv_fontStyleStyle_2_0=ruleUbqFontStyle();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fontStyleStyle",
                    	        		lv_fontStyleStyle_2_0, 
                    	        		"UbqFontStyle", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3189:3: ( (lv_borderStyle_3_0= ruleUbqBorderStyle ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3190:1: (lv_borderStyle_3_0= ruleUbqBorderStyle )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3190:1: (lv_borderStyle_3_0= ruleUbqBorderStyle )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3191:3: lv_borderStyle_3_0= ruleUbqBorderStyle
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqWidgetStyleAccess().getBorderStyleUbqBorderStyleParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqBorderStyle_in_ruleUbqWidgetStyle4964);
                    lv_borderStyle_3_0=ruleUbqBorderStyle();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqWidgetStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"borderStyle",
                    	        		lv_borderStyle_3_0, 
                    	        		"UbqBorderStyle", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleUbqWidgetStyle4975); 

                    createLeafNode(grammarAccess.getUbqWidgetStyleAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqWidgetStyle


    // $ANTLR start entryRuleUbqColorStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3225:1: entryRuleUbqColorStyle returns [EObject current=null] : iv_ruleUbqColorStyle= ruleUbqColorStyle EOF ;
    public final EObject entryRuleUbqColorStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqColorStyle = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3226:2: (iv_ruleUbqColorStyle= ruleUbqColorStyle EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3227:2: iv_ruleUbqColorStyle= ruleUbqColorStyle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqColorStyleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqColorStyle_in_entryRuleUbqColorStyle5011);
            iv_ruleUbqColorStyle=ruleUbqColorStyle();
            _fsp--;

             current =iv_ruleUbqColorStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqColorStyle5021); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqColorStyle


    // $ANTLR start ruleUbqColorStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3234:1: ruleUbqColorStyle returns [EObject current=null] : ( 'style:color {' ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )? ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )? '}' ) ;
    public final EObject ruleUbqColorStyle() throws RecognitionException {
        EObject current = null;

        EObject lv_foreground_2_0 = null;

        EObject lv_background_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3239:6: ( ( 'style:color {' ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )? ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )? '}' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3240:1: ( 'style:color {' ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )? ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )? '}' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3240:1: ( 'style:color {' ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )? ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )? '}' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3240:3: 'style:color {' ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )? ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )? '}'
            {
            match(input,61,FOLLOW_61_in_ruleUbqColorStyle5056); 

                    createLeafNode(grammarAccess.getUbqColorStyleAccess().getStyleColorKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3244:1: ( 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==62) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3244:3: 'foreground:' ( (lv_foreground_2_0= ruleUbqColor ) ) ';'
                    {
                    match(input,62,FOLLOW_62_in_ruleUbqColorStyle5067); 

                            createLeafNode(grammarAccess.getUbqColorStyleAccess().getForegroundKeyword_1_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3248:1: ( (lv_foreground_2_0= ruleUbqColor ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3249:1: (lv_foreground_2_0= ruleUbqColor )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3249:1: (lv_foreground_2_0= ruleUbqColor )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3250:3: lv_foreground_2_0= ruleUbqColor
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqColorStyleAccess().getForegroundUbqColorParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqColor_in_ruleUbqColorStyle5088);
                    lv_foreground_2_0=ruleUbqColor();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqColorStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"foreground",
                    	        		lv_foreground_2_0, 
                    	        		"UbqColor", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleUbqColorStyle5098); 

                            createLeafNode(grammarAccess.getUbqColorStyleAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3276:3: ( 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==63) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3276:5: 'background:' ( (lv_background_5_0= ruleUbqColor ) ) ';'
                    {
                    match(input,63,FOLLOW_63_in_ruleUbqColorStyle5111); 

                            createLeafNode(grammarAccess.getUbqColorStyleAccess().getBackgroundKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3280:1: ( (lv_background_5_0= ruleUbqColor ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3281:1: (lv_background_5_0= ruleUbqColor )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3281:1: (lv_background_5_0= ruleUbqColor )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3282:3: lv_background_5_0= ruleUbqColor
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqColorStyleAccess().getBackgroundUbqColorParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUbqColor_in_ruleUbqColorStyle5132);
                    lv_background_5_0=ruleUbqColor();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqColorStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"background",
                    	        		lv_background_5_0, 
                    	        		"UbqColor", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleUbqColorStyle5142); 

                            createLeafNode(grammarAccess.getUbqColorStyleAccess().getSemicolonKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleUbqColorStyle5154); 

                    createLeafNode(grammarAccess.getUbqColorStyleAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqColorStyle


    // $ANTLR start entryRuleUbqFontStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3320:1: entryRuleUbqFontStyle returns [EObject current=null] : iv_ruleUbqFontStyle= ruleUbqFontStyle EOF ;
    public final EObject entryRuleUbqFontStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqFontStyle = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3321:2: (iv_ruleUbqFontStyle= ruleUbqFontStyle EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3322:2: iv_ruleUbqFontStyle= ruleUbqFontStyle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqFontStyleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqFontStyle_in_entryRuleUbqFontStyle5190);
            iv_ruleUbqFontStyle=ruleUbqFontStyle();
            _fsp--;

             current =iv_ruleUbqFontStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqFontStyle5200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqFontStyle


    // $ANTLR start ruleUbqFontStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3329:1: ruleUbqFontStyle returns [EObject current=null] : ( 'style:font {' ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )? ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )? '}' ) ;
    public final EObject ruleUbqFontStyle() throws RecognitionException {
        EObject current = null;

        Token lv_font_2_0=null;
        Token lv_height_5_0=null;
        Enumerator lv_styles_8_0 = null;

        Enumerator lv_styles_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3334:6: ( ( 'style:font {' ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )? ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )? '}' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3335:1: ( 'style:font {' ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )? ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )? '}' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3335:1: ( 'style:font {' ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )? ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )? '}' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3335:3: 'style:font {' ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )? ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )? '}'
            {
            match(input,64,FOLLOW_64_in_ruleUbqFontStyle5235); 

                    createLeafNode(grammarAccess.getUbqFontStyleAccess().getStyleFontKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3339:1: ( 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==65) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3339:3: 'font:' ( (lv_font_2_0= RULE_STRING ) ) ';'
                    {
                    match(input,65,FOLLOW_65_in_ruleUbqFontStyle5246); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getFontKeyword_1_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3343:1: ( (lv_font_2_0= RULE_STRING ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3344:1: (lv_font_2_0= RULE_STRING )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3344:1: (lv_font_2_0= RULE_STRING )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3345:3: lv_font_2_0= RULE_STRING
                    {
                    lv_font_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUbqFontStyle5263); 

                    			createLeafNode(grammarAccess.getUbqFontStyleAccess().getFontSTRINGTerminalRuleCall_1_1_0(), "font"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqFontStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"font",
                    	        		lv_font_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleUbqFontStyle5278); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3371:3: ( 'height:' ( (lv_height_5_0= RULE_INT ) ) ';' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==66) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3371:5: 'height:' ( (lv_height_5_0= RULE_INT ) ) ';'
                    {
                    match(input,66,FOLLOW_66_in_ruleUbqFontStyle5291); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getHeightKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3375:1: ( (lv_height_5_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3376:1: (lv_height_5_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3376:1: (lv_height_5_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3377:3: lv_height_5_0= RULE_INT
                    {
                    lv_height_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqFontStyle5308); 

                    			createLeafNode(grammarAccess.getUbqFontStyleAccess().getHeightINTTerminalRuleCall_2_1_0(), "height"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqFontStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"height",
                    	        		lv_height_5_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleUbqFontStyle5323); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getSemicolonKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3403:3: ( 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==67) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3403:5: 'style:' ( (lv_styles_8_0= ruleFONT_STYLE ) ) ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )* ';'
                    {
                    match(input,67,FOLLOW_67_in_ruleUbqFontStyle5336); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getStyleKeyword_3_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3407:1: ( (lv_styles_8_0= ruleFONT_STYLE ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3408:1: (lv_styles_8_0= ruleFONT_STYLE )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3408:1: (lv_styles_8_0= ruleFONT_STYLE )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3409:3: lv_styles_8_0= ruleFONT_STYLE
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqFontStyleAccess().getStylesFONT_STYLEEnumRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFONT_STYLE_in_ruleUbqFontStyle5357);
                    lv_styles_8_0=ruleFONT_STYLE();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqFontStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"styles",
                    	        		lv_styles_8_0, 
                    	        		"FONT_STYLE", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3431:2: ( '|' ( (lv_styles_10_0= ruleFONT_STYLE ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==68) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3431:4: '|' ( (lv_styles_10_0= ruleFONT_STYLE ) )
                    	    {
                    	    match(input,68,FOLLOW_68_in_ruleUbqFontStyle5368); 

                    	            createLeafNode(grammarAccess.getUbqFontStyleAccess().getVerticalLineKeyword_3_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3435:1: ( (lv_styles_10_0= ruleFONT_STYLE ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3436:1: (lv_styles_10_0= ruleFONT_STYLE )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3436:1: (lv_styles_10_0= ruleFONT_STYLE )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3437:3: lv_styles_10_0= ruleFONT_STYLE
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqFontStyleAccess().getStylesFONT_STYLEEnumRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFONT_STYLE_in_ruleUbqFontStyle5389);
                    	    lv_styles_10_0=ruleFONT_STYLE();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqFontStyleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"styles",
                    	    	        		lv_styles_10_0, 
                    	    	        		"FONT_STYLE", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    match(input,12,FOLLOW_12_in_ruleUbqFontStyle5401); 

                            createLeafNode(grammarAccess.getUbqFontStyleAccess().getSemicolonKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleUbqFontStyle5413); 

                    createLeafNode(grammarAccess.getUbqFontStyleAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqFontStyle


    // $ANTLR start entryRuleUbqBorderStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3475:1: entryRuleUbqBorderStyle returns [EObject current=null] : iv_ruleUbqBorderStyle= ruleUbqBorderStyle EOF ;
    public final EObject entryRuleUbqBorderStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqBorderStyle = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3476:2: (iv_ruleUbqBorderStyle= ruleUbqBorderStyle EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3477:2: iv_ruleUbqBorderStyle= ruleUbqBorderStyle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqBorderStyleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqBorderStyle_in_entryRuleUbqBorderStyle5449);
            iv_ruleUbqBorderStyle=ruleUbqBorderStyle();
            _fsp--;

             current =iv_ruleUbqBorderStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqBorderStyle5459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqBorderStyle


    // $ANTLR start ruleUbqBorderStyle
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3484:1: ruleUbqBorderStyle returns [EObject current=null] : ( 'style:border {' ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )? '}' ) ;
    public final EObject ruleUbqBorderStyle() throws RecognitionException {
        EObject current = null;

        Token lv_tickness_2_0=null;
        Enumerator lv_styles_5_0 = null;

        Enumerator lv_styles_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3489:6: ( ( 'style:border {' ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )? '}' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3490:1: ( 'style:border {' ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )? '}' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3490:1: ( 'style:border {' ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )? '}' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3490:3: 'style:border {' ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )? ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )? '}'
            {
            match(input,69,FOLLOW_69_in_ruleUbqBorderStyle5494); 

                    createLeafNode(grammarAccess.getUbqBorderStyleAccess().getStyleBorderKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3494:1: ( 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==70) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3494:3: 'tickness:' ( (lv_tickness_2_0= RULE_INT ) ) ';'
                    {
                    match(input,70,FOLLOW_70_in_ruleUbqBorderStyle5505); 

                            createLeafNode(grammarAccess.getUbqBorderStyleAccess().getTicknessKeyword_1_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3498:1: ( (lv_tickness_2_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3499:1: (lv_tickness_2_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3499:1: (lv_tickness_2_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3500:3: lv_tickness_2_0= RULE_INT
                    {
                    lv_tickness_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqBorderStyle5522); 

                    			createLeafNode(grammarAccess.getUbqBorderStyleAccess().getTicknessINTTerminalRuleCall_1_1_0(), "tickness"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqBorderStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tickness",
                    	        		lv_tickness_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleUbqBorderStyle5537); 

                            createLeafNode(grammarAccess.getUbqBorderStyleAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3526:3: ( 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==67) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3526:5: 'style:' ( (lv_styles_5_0= ruleBORDER_STYLE ) ) ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )* ';'
                    {
                    match(input,67,FOLLOW_67_in_ruleUbqBorderStyle5550); 

                            createLeafNode(grammarAccess.getUbqBorderStyleAccess().getStyleKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3530:1: ( (lv_styles_5_0= ruleBORDER_STYLE ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3531:1: (lv_styles_5_0= ruleBORDER_STYLE )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3531:1: (lv_styles_5_0= ruleBORDER_STYLE )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3532:3: lv_styles_5_0= ruleBORDER_STYLE
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUbqBorderStyleAccess().getStylesBORDER_STYLEEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBORDER_STYLE_in_ruleUbqBorderStyle5571);
                    lv_styles_5_0=ruleBORDER_STYLE();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUbqBorderStyleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"styles",
                    	        		lv_styles_5_0, 
                    	        		"BORDER_STYLE", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3554:2: ( '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==68) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3554:4: '|' ( (lv_styles_7_0= ruleBORDER_STYLE ) )
                    	    {
                    	    match(input,68,FOLLOW_68_in_ruleUbqBorderStyle5582); 

                    	            createLeafNode(grammarAccess.getUbqBorderStyleAccess().getVerticalLineKeyword_2_2_0(), null); 
                    	        
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3558:1: ( (lv_styles_7_0= ruleBORDER_STYLE ) )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3559:1: (lv_styles_7_0= ruleBORDER_STYLE )
                    	    {
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3559:1: (lv_styles_7_0= ruleBORDER_STYLE )
                    	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3560:3: lv_styles_7_0= ruleBORDER_STYLE
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUbqBorderStyleAccess().getStylesBORDER_STYLEEnumRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBORDER_STYLE_in_ruleUbqBorderStyle5603);
                    	    lv_styles_7_0=ruleBORDER_STYLE();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUbqBorderStyleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"styles",
                    	    	        		lv_styles_7_0, 
                    	    	        		"BORDER_STYLE", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    match(input,12,FOLLOW_12_in_ruleUbqBorderStyle5615); 

                            createLeafNode(grammarAccess.getUbqBorderStyleAccess().getSemicolonKeyword_2_3(), null); 
                        

                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleUbqBorderStyle5627); 

                    createLeafNode(grammarAccess.getUbqBorderStyleAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqBorderStyle


    // $ANTLR start entryRuleUbqColor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3598:1: entryRuleUbqColor returns [EObject current=null] : iv_ruleUbqColor= ruleUbqColor EOF ;
    public final EObject entryRuleUbqColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqColor = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3599:2: (iv_ruleUbqColor= ruleUbqColor EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3600:2: iv_ruleUbqColor= ruleUbqColor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqColorRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqColor_in_entryRuleUbqColor5663);
            iv_ruleUbqColor=ruleUbqColor();
            _fsp--;

             current =iv_ruleUbqColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqColor5673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqColor


    // $ANTLR start ruleUbqColor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3607:1: ruleUbqColor returns [EObject current=null] : this_UbqRgbColor_0= ruleUbqRgbColor ;
    public final EObject ruleUbqColor() throws RecognitionException {
        EObject current = null;

        EObject this_UbqRgbColor_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3612:6: (this_UbqRgbColor_0= ruleUbqRgbColor )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3614:5: this_UbqRgbColor_0= ruleUbqRgbColor
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUbqColorAccess().getUbqRgbColorParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUbqRgbColor_in_ruleUbqColor5719);
            this_UbqRgbColor_0=ruleUbqRgbColor();
            _fsp--;

             
                    current = this_UbqRgbColor_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqColor


    // $ANTLR start entryRuleUbqRgbColor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3632:1: entryRuleUbqRgbColor returns [EObject current=null] : iv_ruleUbqRgbColor= ruleUbqRgbColor EOF ;
    public final EObject entryRuleUbqRgbColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbqRgbColor = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3633:2: (iv_ruleUbqRgbColor= ruleUbqRgbColor EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3634:2: iv_ruleUbqRgbColor= ruleUbqRgbColor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUbqRgbColorRule(), currentNode); 
            pushFollow(FOLLOW_ruleUbqRgbColor_in_entryRuleUbqRgbColor5755);
            iv_ruleUbqRgbColor=ruleUbqRgbColor();
            _fsp--;

             current =iv_ruleUbqRgbColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUbqRgbColor5765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUbqRgbColor


    // $ANTLR start ruleUbqRgbColor
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3641:1: ruleUbqRgbColor returns [EObject current=null] : ( 'rgb' '[' ( (lv_red_2_0= RULE_INT ) ) ',' ( (lv_green_4_0= RULE_INT ) ) ',' ( (lv_blue_6_0= RULE_INT ) ) ']' ) ;
    public final EObject ruleUbqRgbColor() throws RecognitionException {
        EObject current = null;

        Token lv_red_2_0=null;
        Token lv_green_4_0=null;
        Token lv_blue_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3646:6: ( ( 'rgb' '[' ( (lv_red_2_0= RULE_INT ) ) ',' ( (lv_green_4_0= RULE_INT ) ) ',' ( (lv_blue_6_0= RULE_INT ) ) ']' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3647:1: ( 'rgb' '[' ( (lv_red_2_0= RULE_INT ) ) ',' ( (lv_green_4_0= RULE_INT ) ) ',' ( (lv_blue_6_0= RULE_INT ) ) ']' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3647:1: ( 'rgb' '[' ( (lv_red_2_0= RULE_INT ) ) ',' ( (lv_green_4_0= RULE_INT ) ) ',' ( (lv_blue_6_0= RULE_INT ) ) ']' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3647:3: 'rgb' '[' ( (lv_red_2_0= RULE_INT ) ) ',' ( (lv_green_4_0= RULE_INT ) ) ',' ( (lv_blue_6_0= RULE_INT ) ) ']'
            {
            match(input,71,FOLLOW_71_in_ruleUbqRgbColor5800); 

                    createLeafNode(grammarAccess.getUbqRgbColorAccess().getRgbKeyword_0(), null); 
                
            match(input,56,FOLLOW_56_in_ruleUbqRgbColor5810); 

                    createLeafNode(grammarAccess.getUbqRgbColorAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3655:1: ( (lv_red_2_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3656:1: (lv_red_2_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3656:1: (lv_red_2_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3657:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqRgbColor5827); 

            			createLeafNode(grammarAccess.getUbqRgbColorAccess().getRedINTTerminalRuleCall_2_0(), "red"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqRgbColorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"red",
            	        		lv_red_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqRgbColor5842); 

                    createLeafNode(grammarAccess.getUbqRgbColorAccess().getCommaKeyword_3(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3683:1: ( (lv_green_4_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3684:1: (lv_green_4_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3684:1: (lv_green_4_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3685:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqRgbColor5859); 

            			createLeafNode(grammarAccess.getUbqRgbColorAccess().getGreenINTTerminalRuleCall_4_0(), "green"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqRgbColorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"green",
            	        		lv_green_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleUbqRgbColor5874); 

                    createLeafNode(grammarAccess.getUbqRgbColorAccess().getCommaKeyword_5(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3711:1: ( (lv_blue_6_0= RULE_INT ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3712:1: (lv_blue_6_0= RULE_INT )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3712:1: (lv_blue_6_0= RULE_INT )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3713:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUbqRgbColor5891); 

            			createLeafNode(grammarAccess.getUbqRgbColorAccess().getBlueINTTerminalRuleCall_6_0(), "blue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUbqRgbColorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"blue",
            	        		lv_blue_6_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,59,FOLLOW_59_in_ruleUbqRgbColor5906); 

                    createLeafNode(grammarAccess.getUbqRgbColorAccess().getRightSquareBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUbqRgbColor


    // $ANTLR start entryRuleFloat
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3747:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3748:2: (iv_ruleFloat= ruleFloat EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3749:2: iv_ruleFloat= ruleFloat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat5943);
            iv_ruleFloat=ruleFloat();
            _fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat5954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloat


    // $ANTLR start ruleFloat
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3756:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3761:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3762:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3762:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3762:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat5994); 

            		current.merge(this_INT_0);
                
             
                createLeafNode(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3769:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3770:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ruleFloat6013); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getFloatAccess().getFullStopKeyword_1_0(), null); 
                        
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat6028); 

                    		current.merge(this_INT_2);
                        
                     
                        createLeafNode(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloat


    // $ANTLR start entryRuleDSLCommandEngine
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3792:1: entryRuleDSLCommandEngine returns [EObject current=null] : iv_ruleDSLCommandEngine= ruleDSLCommandEngine EOF ;
    public final EObject entryRuleDSLCommandEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLCommandEngine = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3793:2: (iv_ruleDSLCommandEngine= ruleDSLCommandEngine EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3794:2: iv_ruleDSLCommandEngine= ruleDSLCommandEngine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDSLCommandEngineRule(), currentNode); 
            pushFollow(FOLLOW_ruleDSLCommandEngine_in_entryRuleDSLCommandEngine6077);
            iv_ruleDSLCommandEngine=ruleDSLCommandEngine();
            _fsp--;

             current =iv_ruleDSLCommandEngine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSLCommandEngine6087); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDSLCommandEngine


    // $ANTLR start ruleDSLCommandEngine
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3801:1: ruleDSLCommandEngine returns [EObject current=null] : ( 'engine' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )? ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )? ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )? ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )? ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleDSLCommandEngine() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_ttl_5_0=null;
        Token lv_threshold_9_0=null;
        Token lv_fillterID_13_0=null;
        Enumerator lv_speed_3_0 = null;

        Enumerator lv_strategy_7_0 = null;

        Enumerator lv_priority_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3806:6: ( ( 'engine' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )? ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )? ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )? ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )? ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3807:1: ( 'engine' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )? ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )? ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )? ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )? ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3807:1: ( 'engine' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )? ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )? ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )? ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )? ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3807:3: 'engine' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )? ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )? ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )? ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )? ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )? ';'
            {
            match(input,73,FOLLOW_73_in_ruleDSLCommandEngine6122); 

                    createLeafNode(grammarAccess.getDSLCommandEngineAccess().getEngineKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3811:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3812:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3812:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3813:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSLCommandEngine6139); 

            			createLeafNode(grammarAccess.getDSLCommandEngineAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3835:2: ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==74) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3835:4: 'speed' ( (lv_speed_3_0= ruleDSLRate ) )
                    {
                    match(input,74,FOLLOW_74_in_ruleDSLCommandEngine6155); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getSpeedKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3839:1: ( (lv_speed_3_0= ruleDSLRate ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3840:1: (lv_speed_3_0= ruleDSLRate )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3840:1: (lv_speed_3_0= ruleDSLRate )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3841:3: lv_speed_3_0= ruleDSLRate
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDSLCommandEngineAccess().getSpeedDSLRateEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDSLRate_in_ruleDSLCommandEngine6176);
                    lv_speed_3_0=ruleDSLRate();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"speed",
                    	        		lv_speed_3_0, 
                    	        		"DSLRate", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3863:4: ( 'ttl' ( (lv_ttl_5_0= RULE_INT ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==75) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3863:6: 'ttl' ( (lv_ttl_5_0= RULE_INT ) )
                    {
                    match(input,75,FOLLOW_75_in_ruleDSLCommandEngine6189); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getTtlKeyword_3_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3867:1: ( (lv_ttl_5_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3868:1: (lv_ttl_5_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3868:1: (lv_ttl_5_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3869:3: lv_ttl_5_0= RULE_INT
                    {
                    lv_ttl_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDSLCommandEngine6206); 

                    			createLeafNode(grammarAccess.getDSLCommandEngineAccess().getTtlINTTerminalRuleCall_3_1_0(), "ttl"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ttl",
                    	        		lv_ttl_5_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3891:4: ( 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==76) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3891:6: 'strategy' ( (lv_strategy_7_0= ruleDSLStrategy ) )
                    {
                    match(input,76,FOLLOW_76_in_ruleDSLCommandEngine6224); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getStrategyKeyword_4_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3895:1: ( (lv_strategy_7_0= ruleDSLStrategy ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3896:1: (lv_strategy_7_0= ruleDSLStrategy )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3896:1: (lv_strategy_7_0= ruleDSLStrategy )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3897:3: lv_strategy_7_0= ruleDSLStrategy
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDSLCommandEngineAccess().getStrategyDSLStrategyEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDSLStrategy_in_ruleDSLCommandEngine6245);
                    lv_strategy_7_0=ruleDSLStrategy();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"strategy",
                    	        		lv_strategy_7_0, 
                    	        		"DSLStrategy", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3919:4: ( 'threshold' ( (lv_threshold_9_0= RULE_INT ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==77) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3919:6: 'threshold' ( (lv_threshold_9_0= RULE_INT ) )
                    {
                    match(input,77,FOLLOW_77_in_ruleDSLCommandEngine6258); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getThresholdKeyword_5_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3923:1: ( (lv_threshold_9_0= RULE_INT ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3924:1: (lv_threshold_9_0= RULE_INT )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3924:1: (lv_threshold_9_0= RULE_INT )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3925:3: lv_threshold_9_0= RULE_INT
                    {
                    lv_threshold_9_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDSLCommandEngine6275); 

                    			createLeafNode(grammarAccess.getDSLCommandEngineAccess().getThresholdINTTerminalRuleCall_5_1_0(), "threshold"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"threshold",
                    	        		lv_threshold_9_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3947:4: ( 'priority' ( (lv_priority_11_0= ruleDSLPriority ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==78) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3947:6: 'priority' ( (lv_priority_11_0= ruleDSLPriority ) )
                    {
                    match(input,78,FOLLOW_78_in_ruleDSLCommandEngine6293); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getPriorityKeyword_6_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3951:1: ( (lv_priority_11_0= ruleDSLPriority ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3952:1: (lv_priority_11_0= ruleDSLPriority )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3952:1: (lv_priority_11_0= ruleDSLPriority )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3953:3: lv_priority_11_0= ruleDSLPriority
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDSLCommandEngineAccess().getPriorityDSLPriorityEnumRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDSLPriority_in_ruleDSLCommandEngine6314);
                    lv_priority_11_0=ruleDSLPriority();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"priority",
                    	        		lv_priority_11_0, 
                    	        		"DSLPriority", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3975:4: ( 'filter' ( (lv_fillterID_13_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==79) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3975:6: 'filter' ( (lv_fillterID_13_0= RULE_STRING ) )
                    {
                    match(input,79,FOLLOW_79_in_ruleDSLCommandEngine6327); 

                            createLeafNode(grammarAccess.getDSLCommandEngineAccess().getFilterKeyword_7_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3979:1: ( (lv_fillterID_13_0= RULE_STRING ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3980:1: (lv_fillterID_13_0= RULE_STRING )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3980:1: (lv_fillterID_13_0= RULE_STRING )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:3981:3: lv_fillterID_13_0= RULE_STRING
                    {
                    lv_fillterID_13_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDSLCommandEngine6344); 

                    			createLeafNode(grammarAccess.getDSLCommandEngineAccess().getFillterIDSTRINGTerminalRuleCall_7_1_0(), "fillterID"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLCommandEngineRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fillterID",
                    	        		lv_fillterID_13_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleDSLCommandEngine6361); 

                    createLeafNode(grammarAccess.getDSLCommandEngineAccess().getSemicolonKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDSLCommandEngine


    // $ANTLR start entryRuleDSLEngineClient
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4015:1: entryRuleDSLEngineClient returns [EObject current=null] : iv_ruleDSLEngineClient= ruleDSLEngineClient EOF ;
    public final EObject entryRuleDSLEngineClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEngineClient = null;


        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4016:2: (iv_ruleDSLEngineClient= ruleDSLEngineClient EOF )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4017:2: iv_ruleDSLEngineClient= ruleDSLEngineClient EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDSLEngineClientRule(), currentNode); 
            pushFollow(FOLLOW_ruleDSLEngineClient_in_entryRuleDSLEngineClient6397);
            iv_ruleDSLEngineClient=ruleDSLEngineClient();
            _fsp--;

             current =iv_ruleDSLEngineClient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSLEngineClient6407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDSLEngineClient


    // $ANTLR start ruleDSLEngineClient
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4024:1: ruleDSLEngineClient returns [EObject current=null] : ( 'client' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? '{' ( ( RULE_ID ) )+ '}' ';' ) ;
    public final EObject ruleDSLEngineClient() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_speed_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4029:6: ( ( 'client' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? '{' ( ( RULE_ID ) )+ '}' ';' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4030:1: ( 'client' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? '{' ( ( RULE_ID ) )+ '}' ';' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4030:1: ( 'client' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? '{' ( ( RULE_ID ) )+ '}' ';' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4030:3: 'client' ( (lv_name_1_0= RULE_ID ) ) ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )? '{' ( ( RULE_ID ) )+ '}' ';'
            {
            match(input,80,FOLLOW_80_in_ruleDSLEngineClient6442); 

                    createLeafNode(grammarAccess.getDSLEngineClientAccess().getClientKeyword_0(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4034:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4035:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4035:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4036:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSLEngineClient6459); 

            			createLeafNode(grammarAccess.getDSLEngineClientAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDSLEngineClientRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4058:2: ( 'speed' ( (lv_speed_3_0= ruleDSLRate ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==74) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4058:4: 'speed' ( (lv_speed_3_0= ruleDSLRate ) )
                    {
                    match(input,74,FOLLOW_74_in_ruleDSLEngineClient6475); 

                            createLeafNode(grammarAccess.getDSLEngineClientAccess().getSpeedKeyword_2_0(), null); 
                        
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4062:1: ( (lv_speed_3_0= ruleDSLRate ) )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4063:1: (lv_speed_3_0= ruleDSLRate )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4063:1: (lv_speed_3_0= ruleDSLRate )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4064:3: lv_speed_3_0= ruleDSLRate
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDSLEngineClientAccess().getSpeedDSLRateEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDSLRate_in_ruleDSLEngineClient6496);
                    lv_speed_3_0=ruleDSLRate();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDSLEngineClientRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"speed",
                    	        		lv_speed_3_0, 
                    	        		"DSLRate", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ruleDSLEngineClient6508); 

                    createLeafNode(grammarAccess.getDSLEngineClientAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4090:1: ( ( RULE_ID ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4091:1: ( RULE_ID )
            	    {
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4091:1: ( RULE_ID )
            	    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4092:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDSLEngineClientRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSLEngineClient6526); 

            	    		createLeafNode(grammarAccess.getDSLEngineClientAccess().getRefCmdEnginesDSLCommandEngineCrossReference_4_0(), "refCmdEngines"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            match(input,34,FOLLOW_34_in_ruleDSLEngineClient6537); 

                    createLeafNode(grammarAccess.getDSLEngineClientAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,12,FOLLOW_12_in_ruleDSLEngineClient6547); 

                    createLeafNode(grammarAccess.getDSLEngineClientAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDSLEngineClient


    // $ANTLR start ruleSLOT_STATUS
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4120:1: ruleSLOT_STATUS returns [Enumerator current=null] : ( ( 'SELECTED' ) | ( 'UNSELECTED' ) ) ;
    public final Enumerator ruleSLOT_STATUS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4124:6: ( ( ( 'SELECTED' ) | ( 'UNSELECTED' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4125:1: ( ( 'SELECTED' ) | ( 'UNSELECTED' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4125:1: ( ( 'SELECTED' ) | ( 'UNSELECTED' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==81) ) {
                alt81=1;
            }
            else if ( (LA81_0==82) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4125:1: ( ( 'SELECTED' ) | ( 'UNSELECTED' ) )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4125:2: ( 'SELECTED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4125:2: ( 'SELECTED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4125:4: 'SELECTED'
                    {
                    match(input,81,FOLLOW_81_in_ruleSLOT_STATUS6595); 

                            current = grammarAccess.getSLOT_STATUSAccess().getSELECTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOT_STATUSAccess().getSELECTEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4131:6: ( 'UNSELECTED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4131:6: ( 'UNSELECTED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4131:8: 'UNSELECTED'
                    {
                    match(input,82,FOLLOW_82_in_ruleSLOT_STATUS6610); 

                            current = grammarAccess.getSLOT_STATUSAccess().getUNSELECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOT_STATUSAccess().getUNSELECTEDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSLOT_STATUS


    // $ANTLR start ruleSLOT_KIND
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4141:1: ruleSLOT_KIND returns [Enumerator current=null] : ( 'PUSH' ) ;
    public final Enumerator ruleSLOT_KIND() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4145:6: ( ( 'PUSH' ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4146:1: ( 'PUSH' )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4146:1: ( 'PUSH' )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4146:3: 'PUSH'
            {
            match(input,83,FOLLOW_83_in_ruleSLOT_KIND6652); 

                    current = grammarAccess.getSLOT_KINDAccess().getPUSHEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getSLOT_KINDAccess().getPUSHEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSLOT_KIND


    // $ANTLR start rulePROXIMA_STATUS
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4156:1: rulePROXIMA_STATUS returns [Enumerator current=null] : ( ( 'DEACTIVATED' ) | ( 'ACTIVATED' ) | ( 'DISABLED' ) ) ;
    public final Enumerator rulePROXIMA_STATUS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4160:6: ( ( ( 'DEACTIVATED' ) | ( 'ACTIVATED' ) | ( 'DISABLED' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4161:1: ( ( 'DEACTIVATED' ) | ( 'ACTIVATED' ) | ( 'DISABLED' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4161:1: ( ( 'DEACTIVATED' ) | ( 'ACTIVATED' ) | ( 'DISABLED' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt82=1;
                }
                break;
            case 85:
                {
                alt82=2;
                }
                break;
            case 86:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4161:1: ( ( 'DEACTIVATED' ) | ( 'ACTIVATED' ) | ( 'DISABLED' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4161:2: ( 'DEACTIVATED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4161:2: ( 'DEACTIVATED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4161:4: 'DEACTIVATED'
                    {
                    match(input,84,FOLLOW_84_in_rulePROXIMA_STATUS6694); 

                            current = grammarAccess.getPROXIMA_STATUSAccess().getDEACTIVATEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPROXIMA_STATUSAccess().getDEACTIVATEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4167:6: ( 'ACTIVATED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4167:6: ( 'ACTIVATED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4167:8: 'ACTIVATED'
                    {
                    match(input,85,FOLLOW_85_in_rulePROXIMA_STATUS6709); 

                            current = grammarAccess.getPROXIMA_STATUSAccess().getACTIVATEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPROXIMA_STATUSAccess().getACTIVATEDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4173:6: ( 'DISABLED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4173:6: ( 'DISABLED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4173:8: 'DISABLED'
                    {
                    match(input,86,FOLLOW_86_in_rulePROXIMA_STATUS6724); 

                            current = grammarAccess.getPROXIMA_STATUSAccess().getDISABLEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPROXIMA_STATUSAccess().getDISABLEDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePROXIMA_STATUS


    // $ANTLR start ruleSLOTS
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4183:1: ruleSLOTS returns [Enumerator current=null] : ( ( 'P0' ) | ( 'P23' ) | ( 'P45' ) | ( 'P67' ) | ( 'P90' ) | ( 'P113' ) | ( 'P135' ) | ( 'P157' ) | ( 'P180' ) | ( 'P203' ) | ( 'P225' ) | ( 'P247' ) | ( 'P270' ) | ( 'P293' ) | ( 'P315' ) | ( 'P337' ) ) ;
    public final Enumerator ruleSLOTS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4187:6: ( ( ( 'P0' ) | ( 'P23' ) | ( 'P45' ) | ( 'P67' ) | ( 'P90' ) | ( 'P113' ) | ( 'P135' ) | ( 'P157' ) | ( 'P180' ) | ( 'P203' ) | ( 'P225' ) | ( 'P247' ) | ( 'P270' ) | ( 'P293' ) | ( 'P315' ) | ( 'P337' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4188:1: ( ( 'P0' ) | ( 'P23' ) | ( 'P45' ) | ( 'P67' ) | ( 'P90' ) | ( 'P113' ) | ( 'P135' ) | ( 'P157' ) | ( 'P180' ) | ( 'P203' ) | ( 'P225' ) | ( 'P247' ) | ( 'P270' ) | ( 'P293' ) | ( 'P315' ) | ( 'P337' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4188:1: ( ( 'P0' ) | ( 'P23' ) | ( 'P45' ) | ( 'P67' ) | ( 'P90' ) | ( 'P113' ) | ( 'P135' ) | ( 'P157' ) | ( 'P180' ) | ( 'P203' ) | ( 'P225' ) | ( 'P247' ) | ( 'P270' ) | ( 'P293' ) | ( 'P315' ) | ( 'P337' ) )
            int alt83=16;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt83=1;
                }
                break;
            case 88:
                {
                alt83=2;
                }
                break;
            case 89:
                {
                alt83=3;
                }
                break;
            case 90:
                {
                alt83=4;
                }
                break;
            case 91:
                {
                alt83=5;
                }
                break;
            case 92:
                {
                alt83=6;
                }
                break;
            case 93:
                {
                alt83=7;
                }
                break;
            case 94:
                {
                alt83=8;
                }
                break;
            case 95:
                {
                alt83=9;
                }
                break;
            case 96:
                {
                alt83=10;
                }
                break;
            case 97:
                {
                alt83=11;
                }
                break;
            case 98:
                {
                alt83=12;
                }
                break;
            case 99:
                {
                alt83=13;
                }
                break;
            case 100:
                {
                alt83=14;
                }
                break;
            case 101:
                {
                alt83=15;
                }
                break;
            case 102:
                {
                alt83=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4188:1: ( ( 'P0' ) | ( 'P23' ) | ( 'P45' ) | ( 'P67' ) | ( 'P90' ) | ( 'P113' ) | ( 'P135' ) | ( 'P157' ) | ( 'P180' ) | ( 'P203' ) | ( 'P225' ) | ( 'P247' ) | ( 'P270' ) | ( 'P293' ) | ( 'P315' ) | ( 'P337' ) )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4188:2: ( 'P0' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4188:2: ( 'P0' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4188:4: 'P0'
                    {
                    match(input,87,FOLLOW_87_in_ruleSLOTS6767); 

                            current = grammarAccess.getSLOTSAccess().getP0EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP0EnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4194:6: ( 'P23' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4194:6: ( 'P23' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4194:8: 'P23'
                    {
                    match(input,88,FOLLOW_88_in_ruleSLOTS6782); 

                            current = grammarAccess.getSLOTSAccess().getP23EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP23EnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4200:6: ( 'P45' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4200:6: ( 'P45' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4200:8: 'P45'
                    {
                    match(input,89,FOLLOW_89_in_ruleSLOTS6797); 

                            current = grammarAccess.getSLOTSAccess().getP45EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP45EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4206:6: ( 'P67' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4206:6: ( 'P67' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4206:8: 'P67'
                    {
                    match(input,90,FOLLOW_90_in_ruleSLOTS6812); 

                            current = grammarAccess.getSLOTSAccess().getP67EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP67EnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4212:6: ( 'P90' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4212:6: ( 'P90' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4212:8: 'P90'
                    {
                    match(input,91,FOLLOW_91_in_ruleSLOTS6827); 

                            current = grammarAccess.getSLOTSAccess().getP90EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP90EnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4218:6: ( 'P113' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4218:6: ( 'P113' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4218:8: 'P113'
                    {
                    match(input,92,FOLLOW_92_in_ruleSLOTS6842); 

                            current = grammarAccess.getSLOTSAccess().getP113EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP113EnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4224:6: ( 'P135' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4224:6: ( 'P135' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4224:8: 'P135'
                    {
                    match(input,93,FOLLOW_93_in_ruleSLOTS6857); 

                            current = grammarAccess.getSLOTSAccess().getP135EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP135EnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4230:6: ( 'P157' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4230:6: ( 'P157' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4230:8: 'P157'
                    {
                    match(input,94,FOLLOW_94_in_ruleSLOTS6872); 

                            current = grammarAccess.getSLOTSAccess().getP157EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP157EnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4236:6: ( 'P180' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4236:6: ( 'P180' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4236:8: 'P180'
                    {
                    match(input,95,FOLLOW_95_in_ruleSLOTS6887); 

                            current = grammarAccess.getSLOTSAccess().getP180EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP180EnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4242:6: ( 'P203' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4242:6: ( 'P203' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4242:8: 'P203'
                    {
                    match(input,96,FOLLOW_96_in_ruleSLOTS6902); 

                            current = grammarAccess.getSLOTSAccess().getP203EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP203EnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4248:6: ( 'P225' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4248:6: ( 'P225' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4248:8: 'P225'
                    {
                    match(input,97,FOLLOW_97_in_ruleSLOTS6917); 

                            current = grammarAccess.getSLOTSAccess().getP225EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP225EnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4254:6: ( 'P247' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4254:6: ( 'P247' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4254:8: 'P247'
                    {
                    match(input,98,FOLLOW_98_in_ruleSLOTS6932); 

                            current = grammarAccess.getSLOTSAccess().getP247EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP247EnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4260:6: ( 'P270' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4260:6: ( 'P270' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4260:8: 'P270'
                    {
                    match(input,99,FOLLOW_99_in_ruleSLOTS6947); 

                            current = grammarAccess.getSLOTSAccess().getP270EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP270EnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4266:6: ( 'P293' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4266:6: ( 'P293' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4266:8: 'P293'
                    {
                    match(input,100,FOLLOW_100_in_ruleSLOTS6962); 

                            current = grammarAccess.getSLOTSAccess().getP293EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP293EnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4272:6: ( 'P315' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4272:6: ( 'P315' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4272:8: 'P315'
                    {
                    match(input,101,FOLLOW_101_in_ruleSLOTS6977); 

                            current = grammarAccess.getSLOTSAccess().getP315EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP315EnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4278:6: ( 'P337' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4278:6: ( 'P337' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4278:8: 'P337'
                    {
                    match(input,102,FOLLOW_102_in_ruleSLOTS6992); 

                            current = grammarAccess.getSLOTSAccess().getP337EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSLOTSAccess().getP337EnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSLOTS


    // $ANTLR start ruleUBQ_LAYOUT_KIND
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4288:1: ruleUBQ_LAYOUT_KIND returns [Enumerator current=null] : ( ( 'UBQ_ROW_LAYOUT' ) | ( 'UBQ_FILL_LAYOUT' ) ) ;
    public final Enumerator ruleUBQ_LAYOUT_KIND() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4292:6: ( ( ( 'UBQ_ROW_LAYOUT' ) | ( 'UBQ_FILL_LAYOUT' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4293:1: ( ( 'UBQ_ROW_LAYOUT' ) | ( 'UBQ_FILL_LAYOUT' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4293:1: ( ( 'UBQ_ROW_LAYOUT' ) | ( 'UBQ_FILL_LAYOUT' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==103) ) {
                alt84=1;
            }
            else if ( (LA84_0==104) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4293:1: ( ( 'UBQ_ROW_LAYOUT' ) | ( 'UBQ_FILL_LAYOUT' ) )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4293:2: ( 'UBQ_ROW_LAYOUT' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4293:2: ( 'UBQ_ROW_LAYOUT' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4293:4: 'UBQ_ROW_LAYOUT'
                    {
                    match(input,103,FOLLOW_103_in_ruleUBQ_LAYOUT_KIND7035); 

                            current = grammarAccess.getUBQ_LAYOUT_KINDAccess().getUBQ_ROW_LAYOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_LAYOUT_KINDAccess().getUBQ_ROW_LAYOUTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4299:6: ( 'UBQ_FILL_LAYOUT' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4299:6: ( 'UBQ_FILL_LAYOUT' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4299:8: 'UBQ_FILL_LAYOUT'
                    {
                    match(input,104,FOLLOW_104_in_ruleUBQ_LAYOUT_KIND7050); 

                            current = grammarAccess.getUBQ_LAYOUT_KINDAccess().getUBQ_FILL_LAYOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_LAYOUT_KINDAccess().getUBQ_FILL_LAYOUTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUBQ_LAYOUT_KIND


    // $ANTLR start ruleUBQ_EVENTS
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4309:1: ruleUBQ_EVENTS returns [Enumerator current=null] : ( ( 'PROXIMA_ADD' ) | ( 'PROXIMA_REMOVE' ) | ( 'PROXIMA_UPDATE' ) | ( 'CURSOR_ADD' ) | ( 'CURSOR_REMOVE' ) | ( 'CURSOR_UPDATE' ) | ( 'WIDGET_SELECTION' ) | ( 'WIDGET_DOWN' ) | ( 'WIDGET_UP' ) | ( 'WIDGET_DRAG' ) | ( 'WIDGET_ENTER' ) | ( 'WIDGET_LEAVE' ) | ( 'WIDGET_HOVER' ) | ( 'INPUT_CMD_ADD' ) ) ;
    public final Enumerator ruleUBQ_EVENTS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4313:6: ( ( ( 'PROXIMA_ADD' ) | ( 'PROXIMA_REMOVE' ) | ( 'PROXIMA_UPDATE' ) | ( 'CURSOR_ADD' ) | ( 'CURSOR_REMOVE' ) | ( 'CURSOR_UPDATE' ) | ( 'WIDGET_SELECTION' ) | ( 'WIDGET_DOWN' ) | ( 'WIDGET_UP' ) | ( 'WIDGET_DRAG' ) | ( 'WIDGET_ENTER' ) | ( 'WIDGET_LEAVE' ) | ( 'WIDGET_HOVER' ) | ( 'INPUT_CMD_ADD' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4314:1: ( ( 'PROXIMA_ADD' ) | ( 'PROXIMA_REMOVE' ) | ( 'PROXIMA_UPDATE' ) | ( 'CURSOR_ADD' ) | ( 'CURSOR_REMOVE' ) | ( 'CURSOR_UPDATE' ) | ( 'WIDGET_SELECTION' ) | ( 'WIDGET_DOWN' ) | ( 'WIDGET_UP' ) | ( 'WIDGET_DRAG' ) | ( 'WIDGET_ENTER' ) | ( 'WIDGET_LEAVE' ) | ( 'WIDGET_HOVER' ) | ( 'INPUT_CMD_ADD' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4314:1: ( ( 'PROXIMA_ADD' ) | ( 'PROXIMA_REMOVE' ) | ( 'PROXIMA_UPDATE' ) | ( 'CURSOR_ADD' ) | ( 'CURSOR_REMOVE' ) | ( 'CURSOR_UPDATE' ) | ( 'WIDGET_SELECTION' ) | ( 'WIDGET_DOWN' ) | ( 'WIDGET_UP' ) | ( 'WIDGET_DRAG' ) | ( 'WIDGET_ENTER' ) | ( 'WIDGET_LEAVE' ) | ( 'WIDGET_HOVER' ) | ( 'INPUT_CMD_ADD' ) )
            int alt85=14;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt85=1;
                }
                break;
            case 106:
                {
                alt85=2;
                }
                break;
            case 107:
                {
                alt85=3;
                }
                break;
            case 108:
                {
                alt85=4;
                }
                break;
            case 109:
                {
                alt85=5;
                }
                break;
            case 110:
                {
                alt85=6;
                }
                break;
            case 111:
                {
                alt85=7;
                }
                break;
            case 112:
                {
                alt85=8;
                }
                break;
            case 113:
                {
                alt85=9;
                }
                break;
            case 114:
                {
                alt85=10;
                }
                break;
            case 115:
                {
                alt85=11;
                }
                break;
            case 116:
                {
                alt85=12;
                }
                break;
            case 117:
                {
                alt85=13;
                }
                break;
            case 118:
                {
                alt85=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4314:1: ( ( 'PROXIMA_ADD' ) | ( 'PROXIMA_REMOVE' ) | ( 'PROXIMA_UPDATE' ) | ( 'CURSOR_ADD' ) | ( 'CURSOR_REMOVE' ) | ( 'CURSOR_UPDATE' ) | ( 'WIDGET_SELECTION' ) | ( 'WIDGET_DOWN' ) | ( 'WIDGET_UP' ) | ( 'WIDGET_DRAG' ) | ( 'WIDGET_ENTER' ) | ( 'WIDGET_LEAVE' ) | ( 'WIDGET_HOVER' ) | ( 'INPUT_CMD_ADD' ) )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4314:2: ( 'PROXIMA_ADD' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4314:2: ( 'PROXIMA_ADD' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4314:4: 'PROXIMA_ADD'
                    {
                    match(input,105,FOLLOW_105_in_ruleUBQ_EVENTS7093); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_ADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_ADDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4320:6: ( 'PROXIMA_REMOVE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4320:6: ( 'PROXIMA_REMOVE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4320:8: 'PROXIMA_REMOVE'
                    {
                    match(input,106,FOLLOW_106_in_ruleUBQ_EVENTS7108); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_REMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_REMOVEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4326:6: ( 'PROXIMA_UPDATE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4326:6: ( 'PROXIMA_UPDATE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4326:8: 'PROXIMA_UPDATE'
                    {
                    match(input,107,FOLLOW_107_in_ruleUBQ_EVENTS7123); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_UPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getPROXIMA_UPDATEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4332:6: ( 'CURSOR_ADD' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4332:6: ( 'CURSOR_ADD' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4332:8: 'CURSOR_ADD'
                    {
                    match(input,108,FOLLOW_108_in_ruleUBQ_EVENTS7138); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getCURSOR_ADDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getCURSOR_ADDEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4338:6: ( 'CURSOR_REMOVE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4338:6: ( 'CURSOR_REMOVE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4338:8: 'CURSOR_REMOVE'
                    {
                    match(input,109,FOLLOW_109_in_ruleUBQ_EVENTS7153); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getCURSOR_REMOVEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getCURSOR_REMOVEEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4344:6: ( 'CURSOR_UPDATE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4344:6: ( 'CURSOR_UPDATE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4344:8: 'CURSOR_UPDATE'
                    {
                    match(input,110,FOLLOW_110_in_ruleUBQ_EVENTS7168); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getCURSOR_UPDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getCURSOR_UPDATEEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4350:6: ( 'WIDGET_SELECTION' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4350:6: ( 'WIDGET_SELECTION' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4350:8: 'WIDGET_SELECTION'
                    {
                    match(input,111,FOLLOW_111_in_ruleUBQ_EVENTS7183); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_SELECTIONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_SELECTIONEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4356:6: ( 'WIDGET_DOWN' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4356:6: ( 'WIDGET_DOWN' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4356:8: 'WIDGET_DOWN'
                    {
                    match(input,112,FOLLOW_112_in_ruleUBQ_EVENTS7198); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_DOWNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_DOWNEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4362:6: ( 'WIDGET_UP' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4362:6: ( 'WIDGET_UP' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4362:8: 'WIDGET_UP'
                    {
                    match(input,113,FOLLOW_113_in_ruleUBQ_EVENTS7213); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_UPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_UPEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4368:6: ( 'WIDGET_DRAG' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4368:6: ( 'WIDGET_DRAG' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4368:8: 'WIDGET_DRAG'
                    {
                    match(input,114,FOLLOW_114_in_ruleUBQ_EVENTS7228); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_DRAGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_DRAGEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4374:6: ( 'WIDGET_ENTER' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4374:6: ( 'WIDGET_ENTER' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4374:8: 'WIDGET_ENTER'
                    {
                    match(input,115,FOLLOW_115_in_ruleUBQ_EVENTS7243); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_ENTEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_ENTEREnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4380:6: ( 'WIDGET_LEAVE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4380:6: ( 'WIDGET_LEAVE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4380:8: 'WIDGET_LEAVE'
                    {
                    match(input,116,FOLLOW_116_in_ruleUBQ_EVENTS7258); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_LEAVEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_LEAVEEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4386:6: ( 'WIDGET_HOVER' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4386:6: ( 'WIDGET_HOVER' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4386:8: 'WIDGET_HOVER'
                    {
                    match(input,117,FOLLOW_117_in_ruleUBQ_EVENTS7273); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getWIDGET_HOVEREnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getWIDGET_HOVEREnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4392:6: ( 'INPUT_CMD_ADD' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4392:6: ( 'INPUT_CMD_ADD' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4392:8: 'INPUT_CMD_ADD'
                    {
                    match(input,118,FOLLOW_118_in_ruleUBQ_EVENTS7288); 

                            current = grammarAccess.getUBQ_EVENTSAccess().getINPUT_CMD_ADDEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUBQ_EVENTSAccess().getINPUT_CMD_ADDEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUBQ_EVENTS


    // $ANTLR start ruleFONT_STYLE
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4404:1: ruleFONT_STYLE returns [Enumerator current=null] : ( ( 'BOLD' ) | ( 'ITALIC' ) | ( 'STRIKED' ) | ( 'NORMAL' ) ) ;
    public final Enumerator ruleFONT_STYLE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4408:6: ( ( ( 'BOLD' ) | ( 'ITALIC' ) | ( 'STRIKED' ) | ( 'NORMAL' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4409:1: ( ( 'BOLD' ) | ( 'ITALIC' ) | ( 'STRIKED' ) | ( 'NORMAL' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4409:1: ( ( 'BOLD' ) | ( 'ITALIC' ) | ( 'STRIKED' ) | ( 'NORMAL' ) )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt86=1;
                }
                break;
            case 120:
                {
                alt86=2;
                }
                break;
            case 121:
                {
                alt86=3;
                }
                break;
            case 122:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4409:1: ( ( 'BOLD' ) | ( 'ITALIC' ) | ( 'STRIKED' ) | ( 'NORMAL' ) )", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4409:2: ( 'BOLD' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4409:2: ( 'BOLD' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4409:4: 'BOLD'
                    {
                    match(input,119,FOLLOW_119_in_ruleFONT_STYLE7333); 

                            current = grammarAccess.getFONT_STYLEAccess().getBOLDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFONT_STYLEAccess().getBOLDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4415:6: ( 'ITALIC' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4415:6: ( 'ITALIC' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4415:8: 'ITALIC'
                    {
                    match(input,120,FOLLOW_120_in_ruleFONT_STYLE7348); 

                            current = grammarAccess.getFONT_STYLEAccess().getITALICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFONT_STYLEAccess().getITALICEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4421:6: ( 'STRIKED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4421:6: ( 'STRIKED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4421:8: 'STRIKED'
                    {
                    match(input,121,FOLLOW_121_in_ruleFONT_STYLE7363); 

                            current = grammarAccess.getFONT_STYLEAccess().getSTRIKEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFONT_STYLEAccess().getSTRIKEDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4427:6: ( 'NORMAL' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4427:6: ( 'NORMAL' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4427:8: 'NORMAL'
                    {
                    match(input,122,FOLLOW_122_in_ruleFONT_STYLE7378); 

                            current = grammarAccess.getFONT_STYLEAccess().getNORMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFONT_STYLEAccess().getNORMALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFONT_STYLE


    // $ANTLR start ruleBORDER_STYLE
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4437:1: ruleBORDER_STYLE returns [Enumerator current=null] : ( ( 'DASHED' ) | ( 'NORMAL' ) ) ;
    public final Enumerator ruleBORDER_STYLE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4441:6: ( ( ( 'DASHED' ) | ( 'NORMAL' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4442:1: ( ( 'DASHED' ) | ( 'NORMAL' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4442:1: ( ( 'DASHED' ) | ( 'NORMAL' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==123) ) {
                alt87=1;
            }
            else if ( (LA87_0==122) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4442:1: ( ( 'DASHED' ) | ( 'NORMAL' ) )", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4442:2: ( 'DASHED' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4442:2: ( 'DASHED' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4442:4: 'DASHED'
                    {
                    match(input,123,FOLLOW_123_in_ruleBORDER_STYLE7421); 

                            current = grammarAccess.getBORDER_STYLEAccess().getDASHEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBORDER_STYLEAccess().getDASHEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4448:6: ( 'NORMAL' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4448:6: ( 'NORMAL' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4448:8: 'NORMAL'
                    {
                    match(input,122,FOLLOW_122_in_ruleBORDER_STYLE7436); 

                            current = grammarAccess.getBORDER_STYLEAccess().getNORMALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBORDER_STYLEAccess().getNORMALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBORDER_STYLE


    // $ANTLR start ruleDSLStrategy
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4458:1: ruleDSLStrategy returns [Enumerator current=null] : ( ( 'PICK_N_RUSH' ) | ( 'OLDEST_MOST_URGENT' ) | ( 'NEWEST_MOST_URGENT' ) | ( 'PREDICATE' ) | ( 'ROUN_ROBIN' ) | ( 'TIME_RANGE_INCLUSIVE' ) | ( 'TIME_RANGE_EXCLUSIVE' ) ) ;
    public final Enumerator ruleDSLStrategy() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4462:6: ( ( ( 'PICK_N_RUSH' ) | ( 'OLDEST_MOST_URGENT' ) | ( 'NEWEST_MOST_URGENT' ) | ( 'PREDICATE' ) | ( 'ROUN_ROBIN' ) | ( 'TIME_RANGE_INCLUSIVE' ) | ( 'TIME_RANGE_EXCLUSIVE' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4463:1: ( ( 'PICK_N_RUSH' ) | ( 'OLDEST_MOST_URGENT' ) | ( 'NEWEST_MOST_URGENT' ) | ( 'PREDICATE' ) | ( 'ROUN_ROBIN' ) | ( 'TIME_RANGE_INCLUSIVE' ) | ( 'TIME_RANGE_EXCLUSIVE' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4463:1: ( ( 'PICK_N_RUSH' ) | ( 'OLDEST_MOST_URGENT' ) | ( 'NEWEST_MOST_URGENT' ) | ( 'PREDICATE' ) | ( 'ROUN_ROBIN' ) | ( 'TIME_RANGE_INCLUSIVE' ) | ( 'TIME_RANGE_EXCLUSIVE' ) )
            int alt88=7;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt88=1;
                }
                break;
            case 125:
                {
                alt88=2;
                }
                break;
            case 126:
                {
                alt88=3;
                }
                break;
            case 127:
                {
                alt88=4;
                }
                break;
            case 128:
                {
                alt88=5;
                }
                break;
            case 129:
                {
                alt88=6;
                }
                break;
            case 130:
                {
                alt88=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4463:1: ( ( 'PICK_N_RUSH' ) | ( 'OLDEST_MOST_URGENT' ) | ( 'NEWEST_MOST_URGENT' ) | ( 'PREDICATE' ) | ( 'ROUN_ROBIN' ) | ( 'TIME_RANGE_INCLUSIVE' ) | ( 'TIME_RANGE_EXCLUSIVE' ) )", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4463:2: ( 'PICK_N_RUSH' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4463:2: ( 'PICK_N_RUSH' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4463:4: 'PICK_N_RUSH'
                    {
                    match(input,124,FOLLOW_124_in_ruleDSLStrategy7479); 

                            current = grammarAccess.getDSLStrategyAccess().getPICK_N_RUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getPICK_N_RUSHEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4469:6: ( 'OLDEST_MOST_URGENT' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4469:6: ( 'OLDEST_MOST_URGENT' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4469:8: 'OLDEST_MOST_URGENT'
                    {
                    match(input,125,FOLLOW_125_in_ruleDSLStrategy7494); 

                            current = grammarAccess.getDSLStrategyAccess().getOLDEST_MOST_URGENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getOLDEST_MOST_URGENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4475:6: ( 'NEWEST_MOST_URGENT' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4475:6: ( 'NEWEST_MOST_URGENT' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4475:8: 'NEWEST_MOST_URGENT'
                    {
                    match(input,126,FOLLOW_126_in_ruleDSLStrategy7509); 

                            current = grammarAccess.getDSLStrategyAccess().getNEWEST_MOST_URGENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getNEWEST_MOST_URGENTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4481:6: ( 'PREDICATE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4481:6: ( 'PREDICATE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4481:8: 'PREDICATE'
                    {
                    match(input,127,FOLLOW_127_in_ruleDSLStrategy7524); 

                            current = grammarAccess.getDSLStrategyAccess().getPREDICATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getPREDICATEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4487:6: ( 'ROUN_ROBIN' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4487:6: ( 'ROUN_ROBIN' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4487:8: 'ROUN_ROBIN'
                    {
                    match(input,128,FOLLOW_128_in_ruleDSLStrategy7539); 

                            current = grammarAccess.getDSLStrategyAccess().getROUN_ROBINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getROUN_ROBINEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4493:6: ( 'TIME_RANGE_INCLUSIVE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4493:6: ( 'TIME_RANGE_INCLUSIVE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4493:8: 'TIME_RANGE_INCLUSIVE'
                    {
                    match(input,129,FOLLOW_129_in_ruleDSLStrategy7554); 

                            current = grammarAccess.getDSLStrategyAccess().getTIME_RANGE_INCLUSIVEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getTIME_RANGE_INCLUSIVEEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4499:6: ( 'TIME_RANGE_EXCLUSIVE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4499:6: ( 'TIME_RANGE_EXCLUSIVE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4499:8: 'TIME_RANGE_EXCLUSIVE'
                    {
                    match(input,130,FOLLOW_130_in_ruleDSLStrategy7569); 

                            current = grammarAccess.getDSLStrategyAccess().getTIME_RANGE_EXCLUSIVEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLStrategyAccess().getTIME_RANGE_EXCLUSIVEEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDSLStrategy


    // $ANTLR start ruleDSLRate
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4509:1: ruleDSLRate returns [Enumerator current=null] : ( ( 'MAX' ) | ( 'VERY_FAST' ) | ( 'FAST' ) | ( 'AVERAGE' ) | ( 'SLOW' ) | ( 'VERY_SLOW' ) | ( 'MIN' ) ) ;
    public final Enumerator ruleDSLRate() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4513:6: ( ( ( 'MAX' ) | ( 'VERY_FAST' ) | ( 'FAST' ) | ( 'AVERAGE' ) | ( 'SLOW' ) | ( 'VERY_SLOW' ) | ( 'MIN' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4514:1: ( ( 'MAX' ) | ( 'VERY_FAST' ) | ( 'FAST' ) | ( 'AVERAGE' ) | ( 'SLOW' ) | ( 'VERY_SLOW' ) | ( 'MIN' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4514:1: ( ( 'MAX' ) | ( 'VERY_FAST' ) | ( 'FAST' ) | ( 'AVERAGE' ) | ( 'SLOW' ) | ( 'VERY_SLOW' ) | ( 'MIN' ) )
            int alt89=7;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt89=1;
                }
                break;
            case 132:
                {
                alt89=2;
                }
                break;
            case 133:
                {
                alt89=3;
                }
                break;
            case 134:
                {
                alt89=4;
                }
                break;
            case 135:
                {
                alt89=5;
                }
                break;
            case 136:
                {
                alt89=6;
                }
                break;
            case 137:
                {
                alt89=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4514:1: ( ( 'MAX' ) | ( 'VERY_FAST' ) | ( 'FAST' ) | ( 'AVERAGE' ) | ( 'SLOW' ) | ( 'VERY_SLOW' ) | ( 'MIN' ) )", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4514:2: ( 'MAX' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4514:2: ( 'MAX' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4514:4: 'MAX'
                    {
                    match(input,131,FOLLOW_131_in_ruleDSLRate7612); 

                            current = grammarAccess.getDSLRateAccess().getMAXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getMAXEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4520:6: ( 'VERY_FAST' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4520:6: ( 'VERY_FAST' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4520:8: 'VERY_FAST'
                    {
                    match(input,132,FOLLOW_132_in_ruleDSLRate7627); 

                            current = grammarAccess.getDSLRateAccess().getVERY_FASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getVERY_FASTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4526:6: ( 'FAST' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4526:6: ( 'FAST' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4526:8: 'FAST'
                    {
                    match(input,133,FOLLOW_133_in_ruleDSLRate7642); 

                            current = grammarAccess.getDSLRateAccess().getFASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getFASTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4532:6: ( 'AVERAGE' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4532:6: ( 'AVERAGE' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4532:8: 'AVERAGE'
                    {
                    match(input,134,FOLLOW_134_in_ruleDSLRate7657); 

                            current = grammarAccess.getDSLRateAccess().getAVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getAVERAGEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4538:6: ( 'SLOW' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4538:6: ( 'SLOW' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4538:8: 'SLOW'
                    {
                    match(input,135,FOLLOW_135_in_ruleDSLRate7672); 

                            current = grammarAccess.getDSLRateAccess().getSLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getSLOWEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4544:6: ( 'VERY_SLOW' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4544:6: ( 'VERY_SLOW' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4544:8: 'VERY_SLOW'
                    {
                    match(input,136,FOLLOW_136_in_ruleDSLRate7687); 

                            current = grammarAccess.getDSLRateAccess().getVERY_SLOWEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getVERY_SLOWEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4550:6: ( 'MIN' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4550:6: ( 'MIN' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4550:8: 'MIN'
                    {
                    match(input,137,FOLLOW_137_in_ruleDSLRate7702); 

                            current = grammarAccess.getDSLRateAccess().getMINEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLRateAccess().getMINEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDSLRate


    // $ANTLR start ruleDSLPriority
    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4560:1: ruleDSLPriority returns [Enumerator current=null] : ( ( 'HIGHER' ) | ( 'HIGH' ) | ( 'MEDIUM' ) | ( 'LOW' ) | ( 'LOWEST' ) ) ;
    public final Enumerator ruleDSLPriority() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4564:6: ( ( ( 'HIGHER' ) | ( 'HIGH' ) | ( 'MEDIUM' ) | ( 'LOW' ) | ( 'LOWEST' ) ) )
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4565:1: ( ( 'HIGHER' ) | ( 'HIGH' ) | ( 'MEDIUM' ) | ( 'LOW' ) | ( 'LOWEST' ) )
            {
            // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4565:1: ( ( 'HIGHER' ) | ( 'HIGH' ) | ( 'MEDIUM' ) | ( 'LOW' ) | ( 'LOWEST' ) )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt90=1;
                }
                break;
            case 139:
                {
                alt90=2;
                }
                break;
            case 140:
                {
                alt90=3;
                }
                break;
            case 141:
                {
                alt90=4;
                }
                break;
            case 142:
                {
                alt90=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4565:1: ( ( 'HIGHER' ) | ( 'HIGH' ) | ( 'MEDIUM' ) | ( 'LOW' ) | ( 'LOWEST' ) )", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4565:2: ( 'HIGHER' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4565:2: ( 'HIGHER' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4565:4: 'HIGHER'
                    {
                    match(input,138,FOLLOW_138_in_ruleDSLPriority7745); 

                            current = grammarAccess.getDSLPriorityAccess().getHIGHEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLPriorityAccess().getHIGHEREnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4571:6: ( 'HIGH' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4571:6: ( 'HIGH' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4571:8: 'HIGH'
                    {
                    match(input,139,FOLLOW_139_in_ruleDSLPriority7760); 

                            current = grammarAccess.getDSLPriorityAccess().getHIGHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLPriorityAccess().getHIGHEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4577:6: ( 'MEDIUM' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4577:6: ( 'MEDIUM' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4577:8: 'MEDIUM'
                    {
                    match(input,140,FOLLOW_140_in_ruleDSLPriority7775); 

                            current = grammarAccess.getDSLPriorityAccess().getMEDIUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLPriorityAccess().getMEDIUMEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4583:6: ( 'LOW' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4583:6: ( 'LOW' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4583:8: 'LOW'
                    {
                    match(input,141,FOLLOW_141_in_ruleDSLPriority7790); 

                            current = grammarAccess.getDSLPriorityAccess().getLOWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLPriorityAccess().getLOWEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4589:6: ( 'LOWEST' )
                    {
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4589:6: ( 'LOWEST' )
                    // ../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g:4589:8: 'LOWEST'
                    {
                    match(input,142,FOLLOW_142_in_ruleDSLPriority7805); 

                            current = grammarAccess.getDSLPriorityAccess().getLOWESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDSLPriorityAccess().getLOWESTEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDSLPriority


 

    public static final BitSet FOLLOW_ruleUbqSession_in_entryRuleUbqSession75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqSession85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetConfImport_in_ruleUbqSession131 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleOrchestrorImport_in_ruleUbqSession153 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ruleUbqDisplayMode_in_ruleUbqSession175 = new BitSet(new long[]{0x0000002801588000L});
    public static final BitSet FOLLOW_ruleUbqFiducial_in_ruleUbqSession196 = new BitSet(new long[]{0x0000002801588000L});
    public static final BitSet FOLLOW_ruleUbqAction_in_ruleUbqSession218 = new BitSet(new long[]{0x0000002801188000L});
    public static final BitSet FOLLOW_ruleUbqReaction_in_ruleUbqSession240 = new BitSet(new long[]{0x0000002801180000L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_ruleUbqSession262 = new BitSet(new long[]{0x0000002801100000L});
    public static final BitSet FOLLOW_ruleUbqHandledReactions_in_ruleUbqSession284 = new BitSet(new long[]{0x0000002001100000L});
    public static final BitSet FOLLOW_ruleUbqSlot_in_ruleUbqSession306 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_ruleUbqProxima_in_ruleUbqSession328 = new BitSet(new long[]{0x0000020001000002L});
    public static final BitSet FOLLOW_ruleUbqCursor_in_ruleUbqSession350 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleOrchestrorImport_in_entryRuleOrchestrorImport387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrchestrorImport397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleOrchestrorImport432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrchestrorImport449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrchestrorImport464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetConfImport_in_entryRuleNetConfImport500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetConfImport510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNetConfImport545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNetConfImport562 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNetConfImport577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqDisplayMode_in_entryRuleUbqDisplayMode613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqDisplayMode623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUbqDisplayMode658 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleUbqPoint_in_ruleUbqDisplayMode679 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqDisplayMode689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqAction_in_entryRuleUbqAction725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqAction735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUbqAction770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqAction787 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUbqAction802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqAction819 = new BitSet(new long[]{0x0000000000061000L});
    public static final BitSet FOLLOW_17_in_ruleUbqAction835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqAction852 = new BitSet(new long[]{0x0000000000061000L});
    public static final BitSet FOLLOW_18_in_ruleUbqAction870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqAction887 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleUbqAction903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqAction920 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleUbqAction939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqReaction_in_entryRuleUbqReaction975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqReaction985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUbqReaction1020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqReaction1037 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUbqReaction1052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqReaction1069 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_17_in_ruleUbqReaction1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqReaction1102 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_21_in_ruleUbqReaction1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqReaction1136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqReaction1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqFiducial_in_entryRuleUbqFiducial1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqFiducial1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUbqFiducial1232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqFiducial1249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUbqFiducial1264 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqFiducial1281 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqFiducial1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqProxima_in_entryRuleUbqProxima1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqProxima1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUbqProxima1377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1394 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUbqProxima1409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1427 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUbqProxima1437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1455 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUbqProxima1465 = new BitSet(new long[]{0x01000003F0001000L});
    public static final BitSet FOLLOW_ruleUbqIncrementableRange_in_ruleUbqProxima1486 = new BitSet(new long[]{0x00000003F0001000L});
    public static final BitSet FOLLOW_28_in_ruleUbqProxima1498 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleUbqBounds_in_ruleUbqProxima1519 = new BitSet(new long[]{0x00000003E0001000L});
    public static final BitSet FOLLOW_29_in_ruleUbqProxima1532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqProxima1549 = new BitSet(new long[]{0x00000003C0001000L});
    public static final BitSet FOLLOW_30_in_ruleUbqProxima1567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqProxima1584 = new BitSet(new long[]{0x0000000380001000L});
    public static final BitSet FOLLOW_31_in_ruleUbqProxima1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_rulePROXIMA_STATUS_in_ruleUbqProxima1623 = new BitSet(new long[]{0x0000000300001000L});
    public static final BitSet FOLLOW_32_in_ruleUbqProxima1636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1654 = new BitSet(new long[]{0x0000000200021000L});
    public static final BitSet FOLLOW_17_in_ruleUbqProxima1665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1683 = new BitSet(new long[]{0x0000000200021000L});
    public static final BitSet FOLLOW_33_in_ruleUbqProxima1698 = new BitSet(new long[]{0x0000000C00100020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1717 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleUbqProxima1728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqProxima1746 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleUbqProxima1758 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_ruleUbqProxima1781 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqHandledReactions_in_ruleUbqProxima1803 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleUbqProxima1814 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqProxima1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqHandledReactions_in_entryRuleUbqHandledReactions1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqHandledReactions1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUbqHandledReactions1907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqHandledReactions1925 = new BitSet(new long[]{0x0000000000221000L});
    public static final BitSet FOLLOW_17_in_ruleUbqHandledReactions1936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqHandledReactions1954 = new BitSet(new long[]{0x0000000000221000L});
    public static final BitSet FOLLOW_21_in_ruleUbqHandledReactions1967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqHandledReactions1985 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleUbqHandledReactions1996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqHandledReactions2014 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleUbqHandledReactions2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_entryRuleUbqEmmitedActions2064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqEmmitedActions2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUbqEmmitedActions2109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2127 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqEmmitedActions2138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2156 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_36_in_ruleUbqEmmitedActions2168 = new BitSet(new long[]{0x0000000000000000L,0x007FFE0000000000L});
    public static final BitSet FOLLOW_ruleUBQ_EVENTS_in_ruleUbqEmmitedActions2189 = new BitSet(new long[]{0x0000000000221000L});
    public static final BitSet FOLLOW_17_in_ruleUbqEmmitedActions2200 = new BitSet(new long[]{0x0000000000000000L,0x007FFE0000000000L});
    public static final BitSet FOLLOW_ruleUBQ_EVENTS_in_ruleUbqEmmitedActions2221 = new BitSet(new long[]{0x0000000000221000L});
    public static final BitSet FOLLOW_21_in_ruleUbqEmmitedActions2234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2252 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleUbqEmmitedActions2263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqEmmitedActions2281 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleUbqEmmitedActions2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqSlot_in_entryRuleUbqSlot2331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqSlot2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUbqSlot2376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqSlot2393 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_ruleUbqBounds_in_ruleUbqSlot2419 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUbqSlot2430 = new BitSet(new long[]{0x0000000000000000L,0x0000007FFF800000L});
    public static final BitSet FOLLOW_ruleSLOTS_in_ruleUbqSlot2451 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUbqSlot2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSLOT_KIND_in_ruleUbqSlot2482 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUbqSlot2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleSLOT_STATUS_in_ruleUbqSlot2513 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleUbqSlot2524 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_ruleUbqSlot2545 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqHandledReactions_in_ruleUbqSlot2567 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleUbqSlot2578 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqSlot2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqLayout_in_entryRuleUbqLayout2626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqLayout2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUbqLayout2671 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_ruleUBQ_LAYOUT_KIND_in_ruleUbqLayout2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqCursor_in_entryRuleUbqCursor2728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqCursor2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUbqCursor2773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqCursor2790 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleUbqPoint_in_ruleUbqCursor2816 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleUbqCursor2826 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleUbqPoint_in_ruleUbqCursor2847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqCursor2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqComposite_in_entryRuleUbqComposite2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqComposite2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUbqComposite2938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqComposite2955 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleUbqBounds_in_ruleUbqComposite2981 = new BitSet(new long[]{0x0000010200001000L});
    public static final BitSet FOLLOW_ruleUbqLayout_in_ruleUbqComposite3002 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqComposite3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleUbqComposite3031 = new BitSet(new long[]{0x000C880400000000L});
    public static final BitSet FOLLOW_ruleUbqComposite_in_ruleUbqComposite3054 = new BitSet(new long[]{0x000C880400000000L});
    public static final BitSet FOLLOW_ruleUbqWidget_in_ruleUbqComposite3073 = new BitSet(new long[]{0x000C880400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqComposite3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqPoint_in_entryRuleUbqPoint3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqPoint3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUbqPoint3170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqPoint3187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqPoint3202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqPoint3219 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleUbqPoint3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqBounds_in_entryRuleUbqBounds3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqBounds3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUbqBounds3315 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqBounds3332 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqBounds3347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqBounds3364 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqBounds3379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqBounds3396 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqBounds3411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqBounds3428 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleUbqBounds3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqWidget_in_entryRuleUbqWidget3479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqWidget3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqButton_in_ruleUbqWidget3537 = new BitSet(new long[]{0x0000504240001000L});
    public static final BitSet FOLLOW_ruleUbqLabel_in_ruleUbqWidget3564 = new BitSet(new long[]{0x0000504240001000L});
    public static final BitSet FOLLOW_ruleUbqCheckbox_in_ruleUbqWidget3591 = new BitSet(new long[]{0x0000504240001000L});
    public static final BitSet FOLLOW_38_in_ruleUbqWidget3602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqWidget3620 = new BitSet(new long[]{0x0000500240001000L});
    public static final BitSet FOLLOW_ruleUbqBounds_in_ruleUbqWidget3643 = new BitSet(new long[]{0x0000400240001000L});
    public static final BitSet FOLLOW_30_in_ruleUbqWidget3655 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqWidget3672 = new BitSet(new long[]{0x0000400200001000L});
    public static final BitSet FOLLOW_46_in_ruleUbqWidget3690 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_ruleUbqWidgetStyle_in_ruleUbqWidget3713 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqWidget3729 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleUbqWidget3745 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_ruleUbqWidget3766 = new BitSet(new long[]{0x0000000C00100000L});
    public static final BitSet FOLLOW_ruleUbqHandledReactions_in_ruleUbqWidget3788 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleUbqWidget3799 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqWidget3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqButton_in_entryRuleUbqButton3849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqButton3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUbqButton3894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqButton3911 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUbqButton3927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqButton3944 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleUbqButton3962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqButton3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqLabel_in_entryRuleUbqLabel4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqLabel4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUbqLabel4067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqLabel4084 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUbqLabel4099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqLabel4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqCheckbox_in_entryRuleUbqCheckbox4157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqCheckbox4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUbqCheckbox4202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqCheckbox4219 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUbqCheckbox4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqMenu_in_entryRuleUbqMenu4294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqMenu4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUbqMenu4339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqMenu4356 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleUbqMenu4372 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_ruleUbqMenu_in_ruleUbqMenu4395 = new BitSet(new long[]{0x0060000400000000L});
    public static final BitSet FOLLOW_ruleUbqMenuItem_in_ruleUbqMenu4414 = new BitSet(new long[]{0x0060000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqMenu4428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqMenu4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqMenuItem_in_entryRuleUbqMenuItem4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqMenuItem4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleUbqMenuItem4521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUbqMenuItem4538 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleUbqMenuItem4553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqMenuItem4570 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleUbqMenuItem4586 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleUbqEmmitedActions_in_ruleUbqMenuItem4607 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqMenuItem4618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqMenuItem4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqIncrementableRange_in_entryRuleUbqIncrementableRange4666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqIncrementableRange4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUbqIncrementableRange4711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4728 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUbqIncrementableRange4743 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4760 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleUbqIncrementableRange4776 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqIncrementableRange4793 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUbqIncrementableRange4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqWidgetStyle_in_entryRuleUbqWidgetStyle4854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqWidgetStyle4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUbqWidgetStyle4899 = new BitSet(new long[]{0x2000000400000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleUbqColorStyle_in_ruleUbqWidgetStyle4920 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleUbqFontStyle_in_ruleUbqWidgetStyle4942 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUbqBorderStyle_in_ruleUbqWidgetStyle4964 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqWidgetStyle4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqColorStyle_in_entryRuleUbqColorStyle5011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqColorStyle5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUbqColorStyle5056 = new BitSet(new long[]{0xC000000400000000L});
    public static final BitSet FOLLOW_62_in_ruleUbqColorStyle5067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleUbqColor_in_ruleUbqColorStyle5088 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqColorStyle5098 = new BitSet(new long[]{0x8000000400000000L});
    public static final BitSet FOLLOW_63_in_ruleUbqColorStyle5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleUbqColor_in_ruleUbqColorStyle5132 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqColorStyle5142 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqColorStyle5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqFontStyle_in_entryRuleUbqFontStyle5190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqFontStyle5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUbqFontStyle5235 = new BitSet(new long[]{0x0000000400000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleUbqFontStyle5246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUbqFontStyle5263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqFontStyle5278 = new BitSet(new long[]{0x0000000400000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleUbqFontStyle5291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqFontStyle5308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqFontStyle5323 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleUbqFontStyle5336 = new BitSet(new long[]{0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_ruleUbqFontStyle5357 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleUbqFontStyle5368 = new BitSet(new long[]{0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_ruleUbqFontStyle5389 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleUbqFontStyle5401 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqFontStyle5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqBorderStyle_in_entryRuleUbqBorderStyle5449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqBorderStyle5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUbqBorderStyle5494 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_70_in_ruleUbqBorderStyle5505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqBorderStyle5522 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUbqBorderStyle5537 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleUbqBorderStyle5550 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBORDER_STYLE_in_ruleUbqBorderStyle5571 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleUbqBorderStyle5582 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBORDER_STYLE_in_ruleUbqBorderStyle5603 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleUbqBorderStyle5615 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUbqBorderStyle5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqColor_in_entryRuleUbqColor5663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqColor5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqRgbColor_in_ruleUbqColor5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUbqRgbColor_in_entryRuleUbqRgbColor5755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUbqRgbColor5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUbqRgbColor5800 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleUbqRgbColor5810 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqRgbColor5827 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqRgbColor5842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqRgbColor5859 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUbqRgbColor5874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUbqRgbColor5891 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUbqRgbColor5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat5943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat5994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleFloat6013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSLCommandEngine_in_entryRuleDSLCommandEngine6077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSLCommandEngine6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDSLCommandEngine6122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSLCommandEngine6139 = new BitSet(new long[]{0x0000000000001000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_74_in_ruleDSLCommandEngine6155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_ruleDSLRate_in_ruleDSLCommandEngine6176 = new BitSet(new long[]{0x0000000000001000L,0x000000000000F800L});
    public static final BitSet FOLLOW_75_in_ruleDSLCommandEngine6189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDSLCommandEngine6206 = new BitSet(new long[]{0x0000000000001000L,0x000000000000F000L});
    public static final BitSet FOLLOW_76_in_ruleDSLCommandEngine6224 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDSLStrategy_in_ruleDSLCommandEngine6245 = new BitSet(new long[]{0x0000000000001000L,0x000000000000E000L});
    public static final BitSet FOLLOW_77_in_ruleDSLCommandEngine6258 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDSLCommandEngine6275 = new BitSet(new long[]{0x0000000000001000L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleDSLCommandEngine6293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_ruleDSLPriority_in_ruleDSLCommandEngine6314 = new BitSet(new long[]{0x0000000000001000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleDSLCommandEngine6327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDSLCommandEngine6344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDSLCommandEngine6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSLEngineClient_in_entryRuleDSLEngineClient6397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSLEngineClient6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDSLEngineClient6442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSLEngineClient6459 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleDSLEngineClient6475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_ruleDSLRate_in_ruleDSLEngineClient6496 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDSLEngineClient6508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSLEngineClient6526 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_ruleDSLEngineClient6537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDSLEngineClient6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSLOT_STATUS6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSLOT_STATUS6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSLOT_KIND6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rulePROXIMA_STATUS6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rulePROXIMA_STATUS6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rulePROXIMA_STATUS6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleSLOTS6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleSLOTS6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleSLOTS6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleSLOTS6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleSLOTS6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleSLOTS6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSLOTS6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleSLOTS6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleSLOTS6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleSLOTS6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleSLOTS6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleSLOTS6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleSLOTS6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleSLOTS6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSLOTS6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleSLOTS6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleUBQ_LAYOUT_KIND7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleUBQ_LAYOUT_KIND7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleUBQ_EVENTS7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleUBQ_EVENTS7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleUBQ_EVENTS7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleUBQ_EVENTS7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleUBQ_EVENTS7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleUBQ_EVENTS7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleUBQ_EVENTS7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleUBQ_EVENTS7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleUBQ_EVENTS7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleUBQ_EVENTS7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleUBQ_EVENTS7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleUBQ_EVENTS7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleUBQ_EVENTS7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleUBQ_EVENTS7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFONT_STYLE7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFONT_STYLE7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFONT_STYLE7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFONT_STYLE7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleBORDER_STYLE7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleBORDER_STYLE7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleDSLStrategy7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleDSLStrategy7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleDSLStrategy7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleDSLStrategy7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleDSLStrategy7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleDSLStrategy7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleDSLStrategy7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleDSLRate7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleDSLRate7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleDSLRate7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleDSLRate7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleDSLRate7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleDSLRate7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleDSLRate7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleDSLPriority7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleDSLPriority7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleDSLPriority7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleDSLPriority7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleDSLPriority7805 = new BitSet(new long[]{0x0000000000000002L});

}