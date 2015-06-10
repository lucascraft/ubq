lexer grammar InternalUbqt;
@header {
package net.sf.ubq.script.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'PUSH' ;
T12 : ';' ;
T13 : 'SELECTED' ;
T14 : 'UNSELECTED' ;
T15 : 'DEACTIVATED' ;
T16 : 'ACTIVATED' ;
T17 : 'DISABLED' ;
T18 : 'P0' ;
T19 : 'P23' ;
T20 : 'P45' ;
T21 : 'P67' ;
T22 : 'P90' ;
T23 : 'P113' ;
T24 : 'P135' ;
T25 : 'P157' ;
T26 : 'P180' ;
T27 : 'P203' ;
T28 : 'P225' ;
T29 : 'P247' ;
T30 : 'P270' ;
T31 : 'P293' ;
T32 : 'P315' ;
T33 : 'P337' ;
T34 : 'UBQ_ROW_LAYOUT' ;
T35 : 'UBQ_FILL_LAYOUT' ;
T36 : 'PROXIMA_ADD' ;
T37 : 'PROXIMA_REMOVE' ;
T38 : 'PROXIMA_UPDATE' ;
T39 : 'CURSOR_ADD' ;
T40 : 'CURSOR_REMOVE' ;
T41 : 'CURSOR_UPDATE' ;
T42 : 'WIDGET_SELECTION' ;
T43 : 'WIDGET_DOWN' ;
T44 : 'WIDGET_UP' ;
T45 : 'WIDGET_DRAG' ;
T46 : 'WIDGET_ENTER' ;
T47 : 'WIDGET_LEAVE' ;
T48 : 'WIDGET_HOVER' ;
T49 : 'INPUT_CMD_ADD' ;
T50 : 'BOLD' ;
T51 : 'ITALIC' ;
T52 : 'STRIKED' ;
T53 : 'NORMAL' ;
T54 : 'DASHED' ;
T55 : 'PICK_N_RUSH' ;
T56 : 'OLDEST_MOST_URGENT' ;
T57 : 'NEWEST_MOST_URGENT' ;
T58 : 'PREDICATE' ;
T59 : 'ROUN_ROBIN' ;
T60 : 'TIME_RANGE_INCLUSIVE' ;
T61 : 'TIME_RANGE_EXCLUSIVE' ;
T62 : 'MAX' ;
T63 : 'VERY_FAST' ;
T64 : 'FAST' ;
T65 : 'AVERAGE' ;
T66 : 'SLOW' ;
T67 : 'VERY_SLOW' ;
T68 : 'MIN' ;
T69 : 'HIGHER' ;
T70 : 'HIGH' ;
T71 : 'MEDIUM' ;
T72 : 'LOW' ;
T73 : 'LOWEST' ;
T74 : 'orchestror' ;
T75 : 'netconf' ;
T76 : 'display' ;
T77 : 'action' ;
T78 : 'trigger' ;
T79 : ',' ;
T80 : 'args' ;
T81 : 'reaction' ;
T82 : 'handles' ;
T83 : 'with' ;
T84 : 'fiducial' ;
T85 : 'code' ;
T86 : 'proxima' ;
T87 : 'maps' ;
T88 : 'to' ;
T89 : 'range' ;
T90 : 'bounds' ;
T91 : 'radius' ;
T92 : 'angle' ;
T93 : 'status' ;
T94 : 'requires' ;
T95 : '{' ;
T96 : '}' ;
T97 : 'emits' ;
T98 : 'on' ;
T99 : 'slot' ;
T100 : 'in' ;
T101 : 'kind' ;
T102 : 'layout' ;
T103 : 'cursor' ;
T104 : 'dimension' ;
T105 : 'composite' ;
T106 : '(' ;
T107 : ')' ;
T108 : 'style' ;
T109 : 'button' ;
T110 : 'text' ;
T111 : 'image' ;
T112 : 'label' ;
T113 : 'checkbox' ;
T114 : 'menu' ;
T115 : 'menuitem' ;
T116 : 'title' ;
T117 : '[' ;
T118 : '..' ;
T119 : ']' ;
T120 : 'init' ;
T121 : 'widget:style {' ;
T122 : 'style:color {' ;
T123 : 'foreground:' ;
T124 : 'background:' ;
T125 : 'style:font {' ;
T126 : 'font:' ;
T127 : 'height:' ;
T128 : 'style:' ;
T129 : '|' ;
T130 : 'style:border {' ;
T131 : 'tickness:' ;
T132 : 'rgb' ;
T133 : '.' ;
T134 : 'engine' ;
T135 : 'speed' ;
T136 : 'ttl' ;
T137 : 'strategy' ;
T138 : 'threshold' ;
T139 : 'priority' ;
T140 : 'filter' ;
T141 : 'client' ;
T142 : 'checked' ;

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13332
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13334
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13336
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13338
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13340
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13342
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.ubq.script.ui/src-gen/net/sf/ubq/script/ui/contentassist/antlr/internal/InternalUbqt.g" 13344
RULE_ANY_OTHER : .;


