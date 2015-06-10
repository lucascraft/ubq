lexer grammar InternalUbqt;
@header {
package net.sf.ubq.script.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'orchestror' ;
T12 : ';' ;
T13 : 'netconf' ;
T14 : 'display' ;
T15 : 'action' ;
T16 : 'trigger' ;
T17 : ',' ;
T18 : 'args' ;
T19 : 'reaction' ;
T20 : 'handles' ;
T21 : 'with' ;
T22 : 'fiducial' ;
T23 : 'code' ;
T24 : 'proxima' ;
T25 : 'maps' ;
T26 : 'to' ;
T27 : 'range' ;
T28 : 'bounds' ;
T29 : 'radius' ;
T30 : 'angle' ;
T31 : 'status' ;
T32 : 'requires' ;
T33 : '{' ;
T34 : '}' ;
T35 : 'emits' ;
T36 : 'on' ;
T37 : 'slot' ;
T38 : 'in' ;
T39 : 'kind' ;
T40 : 'layout' ;
T41 : 'cursor' ;
T42 : 'dimension' ;
T43 : 'composite' ;
T44 : '(' ;
T45 : ')' ;
T46 : 'style' ;
T47 : 'button' ;
T48 : 'text' ;
T49 : 'image' ;
T50 : 'label' ;
T51 : 'checkbox' ;
T52 : 'checked' ;
T53 : 'menu' ;
T54 : 'menuitem' ;
T55 : 'title' ;
T56 : '[' ;
T57 : '..' ;
T58 : 'init' ;
T59 : ']' ;
T60 : 'widget:style {' ;
T61 : 'style:color {' ;
T62 : 'foreground:' ;
T63 : 'background:' ;
T64 : 'style:font {' ;
T65 : 'font:' ;
T66 : 'height:' ;
T67 : 'style:' ;
T68 : '|' ;
T69 : 'style:border {' ;
T70 : 'tickness:' ;
T71 : 'rgb' ;
T72 : '.' ;
T73 : 'engine' ;
T74 : 'speed' ;
T75 : 'ttl' ;
T76 : 'strategy' ;
T77 : 'threshold' ;
T78 : 'priority' ;
T79 : 'filter' ;
T80 : 'client' ;
T81 : 'SELECTED' ;
T82 : 'UNSELECTED' ;
T83 : 'PUSH' ;
T84 : 'DEACTIVATED' ;
T85 : 'ACTIVATED' ;
T86 : 'DISABLED' ;
T87 : 'P0' ;
T88 : 'P23' ;
T89 : 'P45' ;
T90 : 'P67' ;
T91 : 'P90' ;
T92 : 'P113' ;
T93 : 'P135' ;
T94 : 'P157' ;
T95 : 'P180' ;
T96 : 'P203' ;
T97 : 'P225' ;
T98 : 'P247' ;
T99 : 'P270' ;
T100 : 'P293' ;
T101 : 'P315' ;
T102 : 'P337' ;
T103 : 'UBQ_ROW_LAYOUT' ;
T104 : 'UBQ_FILL_LAYOUT' ;
T105 : 'PROXIMA_ADD' ;
T106 : 'PROXIMA_REMOVE' ;
T107 : 'PROXIMA_UPDATE' ;
T108 : 'CURSOR_ADD' ;
T109 : 'CURSOR_REMOVE' ;
T110 : 'CURSOR_UPDATE' ;
T111 : 'WIDGET_SELECTION' ;
T112 : 'WIDGET_DOWN' ;
T113 : 'WIDGET_UP' ;
T114 : 'WIDGET_DRAG' ;
T115 : 'WIDGET_ENTER' ;
T116 : 'WIDGET_LEAVE' ;
T117 : 'WIDGET_HOVER' ;
T118 : 'INPUT_CMD_ADD' ;
T119 : 'BOLD' ;
T120 : 'ITALIC' ;
T121 : 'STRIKED' ;
T122 : 'NORMAL' ;
T123 : 'DASHED' ;
T124 : 'PICK_N_RUSH' ;
T125 : 'OLDEST_MOST_URGENT' ;
T126 : 'NEWEST_MOST_URGENT' ;
T127 : 'PREDICATE' ;
T128 : 'ROUN_ROBIN' ;
T129 : 'TIME_RANGE_INCLUSIVE' ;
T130 : 'TIME_RANGE_EXCLUSIVE' ;
T131 : 'MAX' ;
T132 : 'VERY_FAST' ;
T133 : 'FAST' ;
T134 : 'AVERAGE' ;
T135 : 'SLOW' ;
T136 : 'VERY_SLOW' ;
T137 : 'MIN' ;
T138 : 'HIGHER' ;
T139 : 'HIGH' ;
T140 : 'MEDIUM' ;
T141 : 'LOW' ;
T142 : 'LOWEST' ;

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4598
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4600
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4602
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4604
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4606
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4608
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.ubq.script/src-gen/net/sf/ubq/script/parser/antlr/internal/InternalUbqt.g" 4610
RULE_ANY_OTHER : .;


