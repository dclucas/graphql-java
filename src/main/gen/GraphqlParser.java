// Generated from /Users/dlucas/src/oss/graphql-java/src/main/antlr/Graphql.g4 by ANTLR 4.7

    package graphql.parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BooleanValue=18, NullValue=19, FRAGMENT=20, QUERY=21, MUTATION=22, SUBSCRIPTION=23, 
		SCHEMA=24, SCALAR=25, TYPE=26, INTERFACE=27, IMPLEMENTS=28, ENUM=29, UNION=30, 
		INPUT=31, EXTEND=32, DIRECTIVE=33, NAME=34, IntValue=35, FloatValue=36, 
		Sign=37, IntegerPart=38, NonZeroDigit=39, ExponentPart=40, Digit=41, StringValue=42, 
		TripleQuotedStringValue=43, Comment=44, Ignored=45;
	public static final int
		RULE_document = 0, RULE_definition = 1, RULE_serviceDefinition = 2, RULE_serviceUrl = 3, 
		RULE_operationDefinition = 4, RULE_operationType = 5, RULE_variableDefinitions = 6, 
		RULE_variableDefinition = 7, RULE_variable = 8, RULE_defaultValue = 9, 
		RULE_selectionSet = 10, RULE_selection = 11, RULE_field = 12, RULE_alias = 13, 
		RULE_arguments = 14, RULE_argument = 15, RULE_fragmentSpread = 16, RULE_inlineFragment = 17, 
		RULE_fragmentDefinition = 18, RULE_fragmentName = 19, RULE_typeCondition = 20, 
		RULE_name = 21, RULE_value = 22, RULE_valueWithVariable = 23, RULE_stringValue = 24, 
		RULE_description = 25, RULE_enumValue = 26, RULE_arrayValue = 27, RULE_arrayValueWithVariable = 28, 
		RULE_objectValue = 29, RULE_objectValueWithVariable = 30, RULE_objectField = 31, 
		RULE_objectFieldWithVariable = 32, RULE_directives = 33, RULE_directive = 34, 
		RULE_type = 35, RULE_typeName = 36, RULE_listType = 37, RULE_nonNullType = 38, 
		RULE_typeSystemDefinition = 39, RULE_schemaDefinition = 40, RULE_operationTypeDefinition = 41, 
		RULE_typeDefinition = 42, RULE_scalarTypeDefinition = 43, RULE_objectTypeDefinition = 44, 
		RULE_implementsInterfaces = 45, RULE_fieldsDefinition = 46, RULE_fieldDefinition = 47, 
		RULE_argumentsDefinition = 48, RULE_inputValueDefinition = 49, RULE_interfaceTypeDefinition = 50, 
		RULE_unionTypeDefinition = 51, RULE_unionMembers = 52, RULE_enumTypeDefinition = 53, 
		RULE_enumValueDefinition = 54, RULE_inputObjectTypeDefinition = 55, RULE_typeExtensionDefinition = 56, 
		RULE_directiveDefinition = 57, RULE_directiveLocation = 58, RULE_directiveLocations = 59;
	public static final String[] ruleNames = {
		"document", "definition", "serviceDefinition", "serviceUrl", "operationDefinition", 
		"operationType", "variableDefinitions", "variableDefinition", "variable", 
		"defaultValue", "selectionSet", "selection", "field", "alias", "arguments", 
		"argument", "fragmentSpread", "inlineFragment", "fragmentDefinition", 
		"fragmentName", "typeCondition", "name", "value", "valueWithVariable", 
		"stringValue", "description", "enumValue", "arrayValue", "arrayValueWithVariable", 
		"objectValue", "objectValueWithVariable", "objectField", "objectFieldWithVariable", 
		"directives", "directive", "type", "typeName", "listType", "nonNullType", 
		"typeSystemDefinition", "schemaDefinition", "operationTypeDefinition", 
		"typeDefinition", "scalarTypeDefinition", "objectTypeDefinition", "implementsInterfaces", 
		"fieldsDefinition", "fieldDefinition", "argumentsDefinition", "inputValueDefinition", 
		"interfaceTypeDefinition", "unionTypeDefinition", "unionMembers", "enumTypeDefinition", 
		"enumValueDefinition", "inputObjectTypeDefinition", "typeExtensionDefinition", 
		"directiveDefinition", "directiveLocation", "directiveLocations"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'service'", "'{'", "'}'", "'url'", "':'", "'('", "')'", "'$'", 
		"'='", "'...'", "'on'", "'['", "']'", "'@'", "'!'", "'&'", "'|'", null, 
		"'null'", "'fragment'", "'query'", "'mutation'", "'subscription'", "'schema'", 
		"'scalar'", "'type'", "'interface'", "'implements'", "'enum'", "'union'", 
		"'input'", "'extend'", "'directive'", null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BooleanValue", "NullValue", "FRAGMENT", 
		"QUERY", "MUTATION", "SUBSCRIPTION", "SCHEMA", "SCALAR", "TYPE", "INTERFACE", 
		"IMPLEMENTS", "ENUM", "UNION", "INPUT", "EXTEND", "DIRECTIVE", "NAME", 
		"IntValue", "FloatValue", "Sign", "IntegerPart", "NonZeroDigit", "ExponentPart", 
		"Digit", "StringValue", "TripleQuotedStringValue", "Comment", "Ignored"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Graphql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				definition();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public OperationDefinitionContext operationDefinition() {
			return getRuleContext(OperationDefinitionContext.class,0);
		}
		public FragmentDefinitionContext fragmentDefinition() {
			return getRuleContext(FragmentDefinitionContext.class,0);
		}
		public TypeSystemDefinitionContext typeSystemDefinition() {
			return getRuleContext(TypeSystemDefinitionContext.class,0);
		}
		public ServiceDefinitionContext serviceDefinition() {
			return getRuleContext(ServiceDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				operationDefinition();
				}
				break;
			case FRAGMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				fragmentDefinition();
				}
				break;
			case SCHEMA:
			case SCALAR:
			case TYPE:
			case INTERFACE:
			case ENUM:
			case UNION:
			case INPUT:
			case EXTEND:
			case DIRECTIVE:
			case StringValue:
			case TripleQuotedStringValue:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				typeSystemDefinition();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				serviceDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ServiceUrlContext serviceUrl() {
			return getRuleContext(ServiceUrlContext.class,0);
		}
		public List<TypeSystemDefinitionContext> typeSystemDefinition() {
			return getRuleContexts(TypeSystemDefinitionContext.class);
		}
		public TypeSystemDefinitionContext typeSystemDefinition(int i) {
			return getRuleContext(TypeSystemDefinitionContext.class,i);
		}
		public ServiceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterServiceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitServiceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitServiceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDefinitionContext serviceDefinition() throws RecognitionException {
		ServiceDefinitionContext _localctx = new ServiceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_serviceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__0);
			setState(132);
			name();
			setState(133);
			match(T__1);
			setState(134);
			serviceUrl();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(135);
				typeSystemDefinition();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceUrlContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public ServiceUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterServiceUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitServiceUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitServiceUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceUrlContext serviceUrl() throws RecognitionException {
		ServiceUrlContext _localctx = new ServiceUrlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_serviceUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__3);
			setState(144);
			match(T__4);
			setState(145);
			stringValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationDefinitionContext extends ParserRuleContext {
		public SelectionSetContext selectionSet() {
			return getRuleContext(SelectionSetContext.class,0);
		}
		public OperationTypeContext operationType() {
			return getRuleContext(OperationTypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableDefinitionsContext variableDefinitions() {
			return getRuleContext(VariableDefinitionsContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public OperationDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterOperationDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitOperationDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitOperationDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationDefinitionContext operationDefinition() throws RecognitionException {
		OperationDefinitionContext _localctx = new OperationDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operationDefinition);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				selectionSet();
				}
				break;
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				operationType();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
					{
					setState(149);
					name();
					}
				}

				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(152);
					variableDefinitions();
					}
				}

				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(155);
					directives();
					}
				}

				setState(158);
				selectionSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTypeContext extends ParserRuleContext {
		public TerminalNode SUBSCRIPTION() { return getToken(GraphqlParser.SUBSCRIPTION, 0); }
		public TerminalNode MUTATION() { return getToken(GraphqlParser.MUTATION, 0); }
		public TerminalNode QUERY() { return getToken(GraphqlParser.QUERY, 0); }
		public OperationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterOperationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitOperationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitOperationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationTypeContext operationType() throws RecognitionException {
		OperationTypeContext _localctx = new OperationTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionsContext extends ParserRuleContext {
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public VariableDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterVariableDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitVariableDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitVariableDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionsContext variableDefinitions() throws RecognitionException {
		VariableDefinitionsContext _localctx = new VariableDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__5);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				variableDefinition();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(170);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			variable();
			setState(173);
			match(T__4);
			setState(174);
			type();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(175);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__7);
			setState(179);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__8);
			setState(182);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionSetContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public SelectionSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterSelectionSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitSelectionSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitSelectionSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionSetContext selectionSet() throws RecognitionException {
		SelectionSetContext _localctx = new SelectionSetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectionSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__1);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				selection();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0) );
			setState(190);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FragmentSpreadContext fragmentSpread() {
			return getRuleContext(FragmentSpreadContext.class,0);
		}
		public InlineFragmentContext inlineFragment() {
			return getRuleContext(InlineFragmentContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selection);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				fragmentSpread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				inlineFragment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public SelectionSetContext selectionSet() {
			return getRuleContext(SelectionSetContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(197);
				alias();
				}
				break;
			}
			setState(200);
			name();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(201);
				arguments();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(204);
				directives();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(207);
				selectionSet();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			name();
			setState(211);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__5);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				argument();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0) );
			setState(219);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueWithVariableContext valueWithVariable() {
			return getRuleContext(ValueWithVariableContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			name();
			setState(222);
			match(T__4);
			setState(223);
			valueWithVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentSpreadContext extends ParserRuleContext {
		public FragmentNameContext fragmentName() {
			return getRuleContext(FragmentNameContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FragmentSpreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentSpread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFragmentSpread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFragmentSpread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFragmentSpread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentSpreadContext fragmentSpread() throws RecognitionException {
		FragmentSpreadContext _localctx = new FragmentSpreadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fragmentSpread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__9);
			setState(226);
			fragmentName();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(227);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineFragmentContext extends ParserRuleContext {
		public SelectionSetContext selectionSet() {
			return getRuleContext(SelectionSetContext.class,0);
		}
		public TypeConditionContext typeCondition() {
			return getRuleContext(TypeConditionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InlineFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterInlineFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitInlineFragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitInlineFragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineFragmentContext inlineFragment() throws RecognitionException {
		InlineFragmentContext _localctx = new InlineFragmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inlineFragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__9);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(231);
				typeCondition();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(234);
				directives();
				}
			}

			setState(237);
			selectionSet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentDefinitionContext extends ParserRuleContext {
		public FragmentNameContext fragmentName() {
			return getRuleContext(FragmentNameContext.class,0);
		}
		public TypeConditionContext typeCondition() {
			return getRuleContext(TypeConditionContext.class,0);
		}
		public SelectionSetContext selectionSet() {
			return getRuleContext(SelectionSetContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FragmentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFragmentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFragmentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFragmentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentDefinitionContext fragmentDefinition() throws RecognitionException {
		FragmentDefinitionContext _localctx = new FragmentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fragmentDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(FRAGMENT);
			setState(240);
			fragmentName();
			setState(241);
			typeCondition();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(242);
				directives();
				}
			}

			setState(245);
			selectionSet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FragmentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFragmentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFragmentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFragmentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentNameContext fragmentName() throws RecognitionException {
		FragmentNameContext _localctx = new FragmentNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fragmentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConditionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTypeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTypeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTypeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConditionContext typeCondition() throws RecognitionException {
		TypeConditionContext _localctx = new TypeConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__10);
			setState(250);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphqlParser.NAME, 0); }
		public TerminalNode FRAGMENT() { return getToken(GraphqlParser.FRAGMENT, 0); }
		public TerminalNode QUERY() { return getToken(GraphqlParser.QUERY, 0); }
		public TerminalNode MUTATION() { return getToken(GraphqlParser.MUTATION, 0); }
		public TerminalNode SUBSCRIPTION() { return getToken(GraphqlParser.SUBSCRIPTION, 0); }
		public TerminalNode SCHEMA() { return getToken(GraphqlParser.SCHEMA, 0); }
		public TerminalNode SCALAR() { return getToken(GraphqlParser.SCALAR, 0); }
		public TerminalNode TYPE() { return getToken(GraphqlParser.TYPE, 0); }
		public TerminalNode INTERFACE() { return getToken(GraphqlParser.INTERFACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GraphqlParser.IMPLEMENTS, 0); }
		public TerminalNode ENUM() { return getToken(GraphqlParser.ENUM, 0); }
		public TerminalNode UNION() { return getToken(GraphqlParser.UNION, 0); }
		public TerminalNode INPUT() { return getToken(GraphqlParser.INPUT, 0); }
		public TerminalNode EXTEND() { return getToken(GraphqlParser.EXTEND, 0); }
		public TerminalNode DIRECTIVE() { return getToken(GraphqlParser.DIRECTIVE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public TerminalNode IntValue() { return getToken(GraphqlParser.IntValue, 0); }
		public TerminalNode FloatValue() { return getToken(GraphqlParser.FloatValue, 0); }
		public TerminalNode BooleanValue() { return getToken(GraphqlParser.BooleanValue, 0); }
		public TerminalNode NullValue() { return getToken(GraphqlParser.NullValue, 0); }
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringValue:
			case TripleQuotedStringValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				stringValue();
				}
				break;
			case IntValue:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(IntValue);
				}
				break;
			case FloatValue:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(FloatValue);
				}
				break;
			case BooleanValue:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(BooleanValue);
				}
				break;
			case NullValue:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(NullValue);
				}
				break;
			case FRAGMENT:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
			case SCHEMA:
			case SCALAR:
			case TYPE:
			case INTERFACE:
			case IMPLEMENTS:
			case ENUM:
			case UNION:
			case INPUT:
			case EXTEND:
			case DIRECTIVE:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				enumValue();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				arrayValue();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				objectValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueWithVariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public TerminalNode IntValue() { return getToken(GraphqlParser.IntValue, 0); }
		public TerminalNode FloatValue() { return getToken(GraphqlParser.FloatValue, 0); }
		public TerminalNode BooleanValue() { return getToken(GraphqlParser.BooleanValue, 0); }
		public TerminalNode NullValue() { return getToken(GraphqlParser.NullValue, 0); }
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public ArrayValueWithVariableContext arrayValueWithVariable() {
			return getRuleContext(ArrayValueWithVariableContext.class,0);
		}
		public ObjectValueWithVariableContext objectValueWithVariable() {
			return getRuleContext(ObjectValueWithVariableContext.class,0);
		}
		public ValueWithVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueWithVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterValueWithVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitValueWithVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitValueWithVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueWithVariableContext valueWithVariable() throws RecognitionException {
		ValueWithVariableContext _localctx = new ValueWithVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valueWithVariable);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				variable();
				}
				break;
			case StringValue:
			case TripleQuotedStringValue:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				stringValue();
				}
				break;
			case IntValue:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(IntValue);
				}
				break;
			case FloatValue:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(FloatValue);
				}
				break;
			case BooleanValue:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(BooleanValue);
				}
				break;
			case NullValue:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(NullValue);
				}
				break;
			case FRAGMENT:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
			case SCHEMA:
			case SCALAR:
			case TYPE:
			case INTERFACE:
			case IMPLEMENTS:
			case ENUM:
			case UNION:
			case INPUT:
			case EXTEND:
			case DIRECTIVE:
			case NAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				enumValue();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				arrayValueWithVariable();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				objectValueWithVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode TripleQuotedStringValue() { return getToken(GraphqlParser.TripleQuotedStringValue, 0); }
		public TerminalNode StringValue() { return getToken(GraphqlParser.StringValue, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==StringValue || _la==TripleQuotedStringValue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			stringValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayValueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__11);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << BooleanValue) | (1L << NullValue) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << IntValue) | (1L << FloatValue) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(282);
				value();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayValueWithVariableContext extends ParserRuleContext {
		public List<ValueWithVariableContext> valueWithVariable() {
			return getRuleContexts(ValueWithVariableContext.class);
		}
		public ValueWithVariableContext valueWithVariable(int i) {
			return getRuleContext(ValueWithVariableContext.class,i);
		}
		public ArrayValueWithVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValueWithVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterArrayValueWithVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitArrayValueWithVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitArrayValueWithVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueWithVariableContext arrayValueWithVariable() throws RecognitionException {
		ArrayValueWithVariableContext _localctx = new ArrayValueWithVariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayValueWithVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__11);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << BooleanValue) | (1L << NullValue) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << IntValue) | (1L << FloatValue) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(291);
				valueWithVariable();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectValueContext extends ParserRuleContext {
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public ObjectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectValueContext objectValue() throws RecognitionException {
		ObjectValueContext _localctx = new ObjectValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__1);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
				{
				{
				setState(300);
				objectField();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectValueWithVariableContext extends ParserRuleContext {
		public List<ObjectFieldWithVariableContext> objectFieldWithVariable() {
			return getRuleContexts(ObjectFieldWithVariableContext.class);
		}
		public ObjectFieldWithVariableContext objectFieldWithVariable(int i) {
			return getRuleContext(ObjectFieldWithVariableContext.class,i);
		}
		public ObjectValueWithVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectValueWithVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterObjectValueWithVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitObjectValueWithVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitObjectValueWithVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectValueWithVariableContext objectValueWithVariable() throws RecognitionException {
		ObjectValueWithVariableContext _localctx = new ObjectValueWithVariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectValueWithVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__1);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
				{
				{
				setState(309);
				objectFieldWithVariable();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectFieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitObjectField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			name();
			setState(318);
			match(T__4);
			setState(319);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectFieldWithVariableContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueWithVariableContext valueWithVariable() {
			return getRuleContext(ValueWithVariableContext.class,0);
		}
		public ObjectFieldWithVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldWithVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterObjectFieldWithVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitObjectFieldWithVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitObjectFieldWithVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldWithVariableContext objectFieldWithVariable() throws RecognitionException {
		ObjectFieldWithVariableContext _localctx = new ObjectFieldWithVariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objectFieldWithVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			name();
			setState(322);
			match(T__4);
			setState(323);
			valueWithVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectivesContext extends ParserRuleContext {
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDirectives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDirectives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				directive();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__13);
			setState(331);
			name();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(332);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public NonNullTypeContext nonNullType() {
			return getRuleContext(NonNullTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				listType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				nonNullType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__11);
			setState(343);
			type();
			setState(344);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonNullTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public NonNullTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNullType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterNonNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitNonNullType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitNonNullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonNullTypeContext nonNullType() throws RecognitionException {
		NonNullTypeContext _localctx = new NonNullTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nonNullType);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRAGMENT:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
			case SCHEMA:
			case SCALAR:
			case TYPE:
			case INTERFACE:
			case IMPLEMENTS:
			case ENUM:
			case UNION:
			case INPUT:
			case EXTEND:
			case DIRECTIVE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				typeName();
				setState(347);
				match(T__14);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				listType();
				setState(350);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSystemDefinitionContext extends ParserRuleContext {
		public SchemaDefinitionContext schemaDefinition() {
			return getRuleContext(SchemaDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public TypeExtensionDefinitionContext typeExtensionDefinition() {
			return getRuleContext(TypeExtensionDefinitionContext.class,0);
		}
		public DirectiveDefinitionContext directiveDefinition() {
			return getRuleContext(DirectiveDefinitionContext.class,0);
		}
		public TypeSystemDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSystemDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTypeSystemDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTypeSystemDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTypeSystemDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSystemDefinitionContext typeSystemDefinition() throws RecognitionException {
		TypeSystemDefinitionContext _localctx = new TypeSystemDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeSystemDefinition);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(354);
					description();
					}
					break;
				}
				setState(357);
				schemaDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				typeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				typeExtensionDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				directiveDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaDefinitionContext extends ParserRuleContext {
		public TerminalNode SCHEMA() { return getToken(GraphqlParser.SCHEMA, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public List<OperationTypeDefinitionContext> operationTypeDefinition() {
			return getRuleContexts(OperationTypeDefinitionContext.class);
		}
		public OperationTypeDefinitionContext operationTypeDefinition(int i) {
			return getRuleContext(OperationTypeDefinitionContext.class,i);
		}
		public SchemaDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterSchemaDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitSchemaDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitSchemaDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaDefinitionContext schemaDefinition() throws RecognitionException {
		SchemaDefinitionContext _localctx = new SchemaDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_schemaDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(363);
				description();
				}
			}

			setState(366);
			match(SCHEMA);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(367);
				directives();
				}
			}

			setState(370);
			match(T__1);
			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(371);
				operationTypeDefinition();
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(376);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTypeDefinitionContext extends ParserRuleContext {
		public OperationTypeContext operationType() {
			return getRuleContext(OperationTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public OperationTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterOperationTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitOperationTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitOperationTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationTypeDefinitionContext operationTypeDefinition() throws RecognitionException {
		OperationTypeDefinitionContext _localctx = new OperationTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operationTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(378);
				description();
				}
			}

			setState(381);
			operationType();
			setState(382);
			match(T__4);
			setState(383);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public ScalarTypeDefinitionContext scalarTypeDefinition() {
			return getRuleContext(ScalarTypeDefinitionContext.class,0);
		}
		public ObjectTypeDefinitionContext objectTypeDefinition() {
			return getRuleContext(ObjectTypeDefinitionContext.class,0);
		}
		public InterfaceTypeDefinitionContext interfaceTypeDefinition() {
			return getRuleContext(InterfaceTypeDefinitionContext.class,0);
		}
		public UnionTypeDefinitionContext unionTypeDefinition() {
			return getRuleContext(UnionTypeDefinitionContext.class,0);
		}
		public EnumTypeDefinitionContext enumTypeDefinition() {
			return getRuleContext(EnumTypeDefinitionContext.class,0);
		}
		public InputObjectTypeDefinitionContext inputObjectTypeDefinition() {
			return getRuleContext(InputObjectTypeDefinitionContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeDefinition);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				scalarTypeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				objectTypeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				interfaceTypeDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				unionTypeDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				enumTypeDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				inputObjectTypeDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(GraphqlParser.SCALAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ScalarTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterScalarTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitScalarTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitScalarTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeDefinitionContext scalarTypeDefinition() throws RecognitionException {
		ScalarTypeDefinitionContext _localctx = new ScalarTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_scalarTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(393);
				description();
				}
			}

			setState(396);
			match(SCALAR);
			setState(397);
			name();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(398);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GraphqlParser.TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ImplementsInterfacesContext implementsInterfaces() {
			return getRuleContext(ImplementsInterfacesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FieldsDefinitionContext fieldsDefinition() {
			return getRuleContext(FieldsDefinitionContext.class,0);
		}
		public ObjectTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterObjectTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitObjectTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitObjectTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeDefinitionContext objectTypeDefinition() throws RecognitionException {
		ObjectTypeDefinitionContext _localctx = new ObjectTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_objectTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(401);
				description();
				}
			}

			setState(404);
			match(TYPE);
			setState(405);
			name();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(406);
				implementsInterfaces(0);
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(409);
				directives();
				}
			}

			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(412);
				fieldsDefinition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsInterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(GraphqlParser.IMPLEMENTS, 0); }
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public ImplementsInterfacesContext implementsInterfaces() {
			return getRuleContext(ImplementsInterfacesContext.class,0);
		}
		public ImplementsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterImplementsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitImplementsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitImplementsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsInterfacesContext implementsInterfaces() throws RecognitionException {
		return implementsInterfaces(0);
	}

	private ImplementsInterfacesContext implementsInterfaces(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplementsInterfacesContext _localctx = new ImplementsInterfacesContext(_ctx, _parentState);
		ImplementsInterfacesContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_implementsInterfaces, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(416);
			match(IMPLEMENTS);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(417);
				match(T__15);
				}
			}

			setState(421); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(420);
					typeName();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(423); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImplementsInterfacesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implementsInterfaces);
					setState(425);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(426);
					match(T__15);
					setState(427);
					typeName();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldsDefinitionContext extends ParserRuleContext {
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public FieldsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFieldsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFieldsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFieldsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsDefinitionContext fieldsDefinition() throws RecognitionException {
		FieldsDefinitionContext _localctx = new FieldsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__1);
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434);
				fieldDefinition();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(439);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ArgumentsDefinitionContext argumentsDefinition() {
			return getRuleContext(ArgumentsDefinitionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(441);
				description();
				}
			}

			setState(444);
			name();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(445);
				argumentsDefinition();
				}
			}

			setState(448);
			match(T__4);
			setState(449);
			type();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(450);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsDefinitionContext extends ParserRuleContext {
		public List<InputValueDefinitionContext> inputValueDefinition() {
			return getRuleContexts(InputValueDefinitionContext.class);
		}
		public InputValueDefinitionContext inputValueDefinition(int i) {
			return getRuleContext(InputValueDefinitionContext.class,i);
		}
		public ArgumentsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterArgumentsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitArgumentsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitArgumentsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDefinitionContext argumentsDefinition() throws RecognitionException {
		ArgumentsDefinitionContext _localctx = new ArgumentsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__5);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				inputValueDefinition();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(459);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputValueDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InputValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterInputValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitInputValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitInputValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputValueDefinitionContext inputValueDefinition() throws RecognitionException {
		InputValueDefinitionContext _localctx = new InputValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inputValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(461);
				description();
				}
			}

			setState(464);
			name();
			setState(465);
			match(T__4);
			setState(466);
			type();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(467);
				defaultValue();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(470);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(GraphqlParser.INTERFACE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public InterfaceTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterInterfaceTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitInterfaceTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitInterfaceTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeDefinitionContext interfaceTypeDefinition() throws RecognitionException {
		InterfaceTypeDefinitionContext _localctx = new InterfaceTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interfaceTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(473);
				description();
				}
			}

			setState(476);
			match(INTERFACE);
			setState(477);
			name();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(478);
				directives();
				}
			}

			setState(481);
			match(T__1);
			setState(483); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(482);
				fieldDefinition();
				}
				}
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(487);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(GraphqlParser.UNION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UnionMembersContext unionMembers() {
			return getRuleContext(UnionMembersContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public UnionTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterUnionTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitUnionTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitUnionTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeDefinitionContext unionTypeDefinition() throws RecognitionException {
		UnionTypeDefinitionContext _localctx = new UnionTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unionTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(489);
				description();
				}
			}

			setState(492);
			match(UNION);
			setState(493);
			name();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(494);
				directives();
				}
			}

			setState(497);
			match(T__8);
			setState(498);
			unionMembers(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionMembersContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnionMembersContext unionMembers() {
			return getRuleContext(UnionMembersContext.class,0);
		}
		public UnionMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterUnionMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitUnionMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitUnionMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionMembersContext unionMembers() throws RecognitionException {
		return unionMembers(0);
	}

	private UnionMembersContext unionMembers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionMembersContext _localctx = new UnionMembersContext(_ctx, _parentState);
		UnionMembersContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_unionMembers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(501);
			typeName();
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnionMembersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unionMembers);
					setState(503);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(504);
					match(T__16);
					setState(505);
					typeName();
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(GraphqlParser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public List<EnumValueDefinitionContext> enumValueDefinition() {
			return getRuleContexts(EnumValueDefinitionContext.class);
		}
		public EnumValueDefinitionContext enumValueDefinition(int i) {
			return getRuleContext(EnumValueDefinitionContext.class,i);
		}
		public EnumTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterEnumTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitEnumTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitEnumTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeDefinitionContext enumTypeDefinition() throws RecognitionException {
		EnumTypeDefinitionContext _localctx = new EnumTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(511);
				description();
				}
			}

			setState(514);
			match(ENUM);
			setState(515);
			name();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(516);
				directives();
				}
			}

			setState(519);
			match(T__1);
			setState(521); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				enumValueDefinition();
				}
				}
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(525);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueDefinitionContext extends ParserRuleContext {
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public EnumValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterEnumValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitEnumValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitEnumValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueDefinitionContext enumValueDefinition() throws RecognitionException {
		EnumValueDefinitionContext _localctx = new EnumValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(527);
				description();
				}
			}

			setState(530);
			enumValue();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(531);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputObjectTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(GraphqlParser.INPUT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public List<InputValueDefinitionContext> inputValueDefinition() {
			return getRuleContexts(InputValueDefinitionContext.class);
		}
		public InputValueDefinitionContext inputValueDefinition(int i) {
			return getRuleContext(InputValueDefinitionContext.class,i);
		}
		public InputObjectTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputObjectTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterInputObjectTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitInputObjectTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitInputObjectTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputObjectTypeDefinitionContext inputObjectTypeDefinition() throws RecognitionException {
		InputObjectTypeDefinitionContext _localctx = new InputObjectTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_inputObjectTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(534);
				description();
				}
			}

			setState(537);
			match(INPUT);
			setState(538);
			name();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(539);
				directives();
				}
			}

			setState(542);
			match(T__1);
			setState(544); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(543);
				inputValueDefinition();
				}
				}
				setState(546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(548);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphqlParser.EXTEND, 0); }
		public ObjectTypeDefinitionContext objectTypeDefinition() {
			return getRuleContext(ObjectTypeDefinitionContext.class,0);
		}
		public TypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTypeExtensionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTypeExtensionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExtensionDefinitionContext typeExtensionDefinition() throws RecognitionException {
		TypeExtensionDefinitionContext _localctx = new TypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeExtensionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(EXTEND);
			setState(551);
			objectTypeDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveDefinitionContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(GraphqlParser.DIRECTIVE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DirectiveLocationsContext directiveLocations() {
			return getRuleContext(DirectiveLocationsContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ArgumentsDefinitionContext argumentsDefinition() {
			return getRuleContext(ArgumentsDefinitionContext.class,0);
		}
		public DirectiveDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveDefinitionContext directiveDefinition() throws RecognitionException {
		DirectiveDefinitionContext _localctx = new DirectiveDefinitionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_directiveDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(553);
				description();
				}
			}

			setState(556);
			match(DIRECTIVE);
			setState(557);
			match(T__13);
			setState(558);
			name();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(559);
				argumentsDefinition();
				}
			}

			setState(562);
			match(T__10);
			setState(563);
			directiveLocations(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveLocationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DirectiveLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDirectiveLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDirectiveLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDirectiveLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveLocationContext directiveLocation() throws RecognitionException {
		DirectiveLocationContext _localctx = new DirectiveLocationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_directiveLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveLocationsContext extends ParserRuleContext {
		public DirectiveLocationContext directiveLocation() {
			return getRuleContext(DirectiveLocationContext.class,0);
		}
		public DirectiveLocationsContext directiveLocations() {
			return getRuleContext(DirectiveLocationsContext.class,0);
		}
		public DirectiveLocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveLocations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterDirectiveLocations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitDirectiveLocations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitDirectiveLocations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveLocationsContext directiveLocations() throws RecognitionException {
		return directiveLocations(0);
	}

	private DirectiveLocationsContext directiveLocations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectiveLocationsContext _localctx = new DirectiveLocationsContext(_ctx, _parentState);
		DirectiveLocationsContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_directiveLocations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568);
			directiveLocation();
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectiveLocationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_directiveLocations);
					setState(570);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(571);
					match(T__16);
					setState(572);
					directiveLocation();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return implementsInterfaces_sempred((ImplementsInterfacesContext)_localctx, predIndex);
		case 52:
			return unionMembers_sempred((UnionMembersContext)_localctx, predIndex);
		case 59:
			return directiveLocations_sempred((DirectiveLocationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean implementsInterfaces_sempred(ImplementsInterfacesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unionMembers_sempred(UnionMembersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directiveLocations_sempred(DirectiveLocationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0245\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2|\n\2\r\2\16\2}\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\5\6\u0099\n\6\3\6\5\6\u009c\n\6\3\6\5\6\u009f\n\6\3\6\3\6\5\6\u00a3"+
		"\n\6\3\7\3\7\3\b\3\b\6\b\u00a9\n\b\r\b\16\b\u00aa\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\6\f\u00bd\n\f\r"+
		"\f\16\f\u00be\3\f\3\f\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\5\16\u00c9\n\16\3"+
		"\16\3\16\5\16\u00cd\n\16\3\16\5\16\u00d0\n\16\3\16\5\16\u00d3\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\6\20\u00da\n\20\r\20\16\20\u00db\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\5\22\u00e7\n\22\3\23\3\23\5\23\u00eb\n\23"+
		"\3\23\5\23\u00ee\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00f6\n\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0109\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0114\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u011e"+
		"\n\35\f\35\16\35\u0121\13\35\3\35\3\35\3\36\3\36\7\36\u0127\n\36\f\36"+
		"\16\36\u012a\13\36\3\36\3\36\3\37\3\37\7\37\u0130\n\37\f\37\16\37\u0133"+
		"\13\37\3\37\3\37\3 \3 \7 \u0139\n \f \16 \u013c\13 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\6#\u0149\n#\r#\16#\u014a\3$\3$\3$\5$\u0150\n$\3%\3"+
		"%\3%\5%\u0155\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u0163\n(\3"+
		")\5)\u0166\n)\3)\3)\3)\3)\5)\u016c\n)\3*\5*\u016f\n*\3*\3*\5*\u0173\n"+
		"*\3*\3*\6*\u0177\n*\r*\16*\u0178\3*\3*\3+\5+\u017e\n+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\5,\u018a\n,\3-\5-\u018d\n-\3-\3-\3-\5-\u0192\n-\3.\5.\u0195"+
		"\n.\3.\3.\3.\5.\u019a\n.\3.\5.\u019d\n.\3.\5.\u01a0\n.\3/\3/\3/\5/\u01a5"+
		"\n/\3/\6/\u01a8\n/\r/\16/\u01a9\3/\3/\3/\7/\u01af\n/\f/\16/\u01b2\13/"+
		"\3\60\3\60\6\60\u01b6\n\60\r\60\16\60\u01b7\3\60\3\60\3\61\5\61\u01bd"+
		"\n\61\3\61\3\61\5\61\u01c1\n\61\3\61\3\61\3\61\5\61\u01c6\n\61\3\62\3"+
		"\62\6\62\u01ca\n\62\r\62\16\62\u01cb\3\62\3\62\3\63\5\63\u01d1\n\63\3"+
		"\63\3\63\3\63\3\63\5\63\u01d7\n\63\3\63\5\63\u01da\n\63\3\64\5\64\u01dd"+
		"\n\64\3\64\3\64\3\64\5\64\u01e2\n\64\3\64\3\64\6\64\u01e6\n\64\r\64\16"+
		"\64\u01e7\3\64\3\64\3\65\5\65\u01ed\n\65\3\65\3\65\3\65\5\65\u01f2\n\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u01fd\n\66\f\66\16"+
		"\66\u0200\13\66\3\67\5\67\u0203\n\67\3\67\3\67\3\67\5\67\u0208\n\67\3"+
		"\67\3\67\6\67\u020c\n\67\r\67\16\67\u020d\3\67\3\67\38\58\u0213\n8\38"+
		"\38\58\u0217\n8\39\59\u021a\n9\39\39\39\59\u021f\n9\39\39\69\u0223\n9"+
		"\r9\169\u0224\39\39\3:\3:\3:\3;\5;\u022d\n;\3;\3;\3;\3;\5;\u0233\n;\3"+
		";\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\7=\u0240\n=\f=\16=\u0243\13=\3=\2\5\\"+
		"jx>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\5\3\2\27\31\3\2\26$\3\2,-\2\u0266\2{\3"+
		"\2\2\2\4\u0083\3\2\2\2\6\u0085\3\2\2\2\b\u0091\3\2\2\2\n\u00a2\3\2\2\2"+
		"\f\u00a4\3\2\2\2\16\u00a6\3\2\2\2\20\u00ae\3\2\2\2\22\u00b4\3\2\2\2\24"+
		"\u00b7\3\2\2\2\26\u00ba\3\2\2\2\30\u00c5\3\2\2\2\32\u00c8\3\2\2\2\34\u00d4"+
		"\3\2\2\2\36\u00d7\3\2\2\2 \u00df\3\2\2\2\"\u00e3\3\2\2\2$\u00e8\3\2\2"+
		"\2&\u00f1\3\2\2\2(\u00f9\3\2\2\2*\u00fb\3\2\2\2,\u00fe\3\2\2\2.\u0108"+
		"\3\2\2\2\60\u0113\3\2\2\2\62\u0115\3\2\2\2\64\u0117\3\2\2\2\66\u0119\3"+
		"\2\2\28\u011b\3\2\2\2:\u0124\3\2\2\2<\u012d\3\2\2\2>\u0136\3\2\2\2@\u013f"+
		"\3\2\2\2B\u0143\3\2\2\2D\u0148\3\2\2\2F\u014c\3\2\2\2H\u0154\3\2\2\2J"+
		"\u0156\3\2\2\2L\u0158\3\2\2\2N\u0162\3\2\2\2P\u016b\3\2\2\2R\u016e\3\2"+
		"\2\2T\u017d\3\2\2\2V\u0189\3\2\2\2X\u018c\3\2\2\2Z\u0194\3\2\2\2\\\u01a1"+
		"\3\2\2\2^\u01b3\3\2\2\2`\u01bc\3\2\2\2b\u01c7\3\2\2\2d\u01d0\3\2\2\2f"+
		"\u01dc\3\2\2\2h\u01ec\3\2\2\2j\u01f6\3\2\2\2l\u0202\3\2\2\2n\u0212\3\2"+
		"\2\2p\u0219\3\2\2\2r\u0228\3\2\2\2t\u022c\3\2\2\2v\u0237\3\2\2\2x\u0239"+
		"\3\2\2\2z|\5\4\3\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\3\3\2\2\2"+
		"\177\u0084\5\n\6\2\u0080\u0084\5&\24\2\u0081\u0084\5P)\2\u0082\u0084\5"+
		"\6\4\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\5\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\5,\27\2"+
		"\u0087\u0088\7\4\2\2\u0088\u008c\5\b\5\2\u0089\u008b\5P)\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\5\2\2\u0090\7\3\2\2\2"+
		"\u0091\u0092\7\6\2\2\u0092\u0093\7\7\2\2\u0093\u0094\5\62\32\2\u0094\t"+
		"\3\2\2\2\u0095\u00a3\5\26\f\2\u0096\u0098\5\f\7\2\u0097\u0099\5,\27\2"+
		"\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c"+
		"\5\16\b\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2"+
		"\u009d\u009f\5D#\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a3\3\2\2\2\u00a2\u0095\3\2\2\2"+
		"\u00a2\u0096\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\r\3\2"+
		"\2\2\u00a6\u00a8\7\b\2\2\u00a7\u00a9\5\20\t\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7\t\2\2\u00ad\17\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0"+
		"\7\7\2\2\u00b0\u00b2\5H%\2\u00b1\u00b3\5\24\13\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5,\27"+
		"\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\5.\30\2\u00b9\25"+
		"\3\2\2\2\u00ba\u00bc\7\4\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1\27\3\2\2\2\u00c2\u00c6\5\32\16\2\u00c3"+
		"\u00c6\5\"\22\2\u00c4\u00c6\5$\23\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c9\5\34\17\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5,"+
		"\27\2\u00cb\u00cd\5\36\20\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00d0\5D#\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2"+
		"\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\5\26\f\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\7\7\2"+
		"\2\u00d6\35\3\2\2\2\u00d7\u00d9\7\b\2\2\u00d8\u00da\5 \21\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\t\2\2\u00de\37\3\2\2\2\u00df\u00e0\5,\27"+
		"\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\5\60\31\2\u00e2!\3\2\2\2\u00e3\u00e4"+
		"\7\f\2\2\u00e4\u00e6\5(\25\2\u00e5\u00e7\5D#\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00ea\7\f\2\2\u00e9\u00eb\5*\26\2"+
		"\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee"+
		"\5D#\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\5\26\f\2\u00f0%\3\2\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\5(\25"+
		"\2\u00f3\u00f5\5*\26\2\u00f4\u00f6\5D#\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5\26\f\2\u00f8\'\3\2\2\2\u00f9"+
		"\u00fa\5,\27\2\u00fa)\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5J&\2\u00fd"+
		"+\3\2\2\2\u00fe\u00ff\t\3\2\2\u00ff-\3\2\2\2\u0100\u0109\5\62\32\2\u0101"+
		"\u0109\7%\2\2\u0102\u0109\7&\2\2\u0103\u0109\7\24\2\2\u0104\u0109\7\25"+
		"\2\2\u0105\u0109\5\66\34\2\u0106\u0109\58\35\2\u0107\u0109\5<\37\2\u0108"+
		"\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2"+
		"\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109/\3\2\2\2\u010a\u0114\5\22\n\2\u010b\u0114\5\62\32"+
		"\2\u010c\u0114\7%\2\2\u010d\u0114\7&\2\2\u010e\u0114\7\24\2\2\u010f\u0114"+
		"\7\25\2\2\u0110\u0114\5\66\34\2\u0111\u0114\5:\36\2\u0112\u0114\5> \2"+
		"\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d"+
		"\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\61\3\2\2\2\u0115\u0116\t\4\2"+
		"\2\u0116\63\3\2\2\2\u0117\u0118\5\62\32\2\u0118\65\3\2\2\2\u0119\u011a"+
		"\5,\27\2\u011a\67\3\2\2\2\u011b\u011f\7\16\2\2\u011c\u011e\5.\30\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\17\2\2\u0123"+
		"9\3\2\2\2\u0124\u0128\7\16\2\2\u0125\u0127\5\60\31\2\u0126\u0125\3\2\2"+
		"\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\17\2\2\u012c;\3\2\2\2\u012d"+
		"\u0131\7\4\2\2\u012e\u0130\5@!\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\7\5\2\2\u0135=\3\2\2\2\u0136\u013a\7\4\2\2\u0137"+
		"\u0139\5B\"\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\7\5\2\2\u013e?\3\2\2\2\u013f\u0140\5,\27\2\u0140\u0141\7\7\2\2"+
		"\u0141\u0142\5.\30\2\u0142A\3\2\2\2\u0143\u0144\5,\27\2\u0144\u0145\7"+
		"\7\2\2\u0145\u0146\5\60\31\2\u0146C\3\2\2\2\u0147\u0149\5F$\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"E\3\2\2\2\u014c\u014d\7\20\2\2\u014d\u014f\5,\27\2\u014e\u0150\5\36\20"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150G\3\2\2\2\u0151\u0155"+
		"\5J&\2\u0152\u0155\5L\'\2\u0153\u0155\5N(\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155I\3\2\2\2\u0156\u0157\5,\27\2"+
		"\u0157K\3\2\2\2\u0158\u0159\7\16\2\2\u0159\u015a\5H%\2\u015a\u015b\7\17"+
		"\2\2\u015bM\3\2\2\2\u015c\u015d\5J&\2\u015d\u015e\7\21\2\2\u015e\u0163"+
		"\3\2\2\2\u015f\u0160\5L\'\2\u0160\u0161\7\21\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0163O\3\2\2\2\u0164\u0166\5\64\33"+
		"\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016c"+
		"\5R*\2\u0168\u016c\5V,\2\u0169\u016c\5r:\2\u016a\u016c\5t;\2\u016b\u0165"+
		"\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"Q\3\2\2\2\u016d\u016f\5\64\33\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170\u0172\7\32\2\2\u0171\u0173\5D#\2\u0172\u0171"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\7\4\2\2\u0175"+
		"\u0177\5T+\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\5\2\2\u017bS"+
		"\3\2\2\2\u017c\u017e\5\64\33\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0180\5\f\7\2\u0180\u0181\7\7\2\2\u0181\u0182"+
		"\5J&\2\u0182U\3\2\2\2\u0183\u018a\5X-\2\u0184\u018a\5Z.\2\u0185\u018a"+
		"\5f\64\2\u0186\u018a\5h\65\2\u0187\u018a\5l\67\2\u0188\u018a\5p9\2\u0189"+
		"\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aW\3\2\2\2\u018b\u018d"+
		"\5\64\33\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018f\7\33\2\2\u018f\u0191\5,\27\2\u0190\u0192\5D#\2\u0191\u0190"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192Y\3\2\2\2\u0193\u0195\5\64\33\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7\34"+
		"\2\2\u0197\u0199\5,\27\2\u0198\u019a\5\\/\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\5D#\2\u019c\u019b\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\5^\60\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0[\3\2\2\2\u01a1\u01a2\b/\1\2\u01a2\u01a4"+
		"\7\36\2\2\u01a3\u01a5\7\22\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2"+
		"\u01a5\u01a7\3\2\2\2\u01a6\u01a8\5J&\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01b0\3\2\2\2\u01ab"+
		"\u01ac\f\3\2\2\u01ac\u01ad\7\22\2\2\u01ad\u01af\5J&\2\u01ae\u01ab\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"]\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\4\2\2\u01b4\u01b6\5`\61\2"+
		"\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\5\2\2\u01ba_\3\2\2\2\u01bb"+
		"\u01bd\5\64\33\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01c0\5,\27\2\u01bf\u01c1\5b\62\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\7\2\2\u01c3\u01c5\5H"+
		"%\2\u01c4\u01c6\5D#\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6a\3"+
		"\2\2\2\u01c7\u01c9\7\b\2\2\u01c8\u01ca\5d\63\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\7\t\2\2\u01cec\3\2\2\2\u01cf\u01d1\5\64\33\2\u01d0\u01cf"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5,\27\2\u01d3"+
		"\u01d4\7\7\2\2\u01d4\u01d6\5H%\2\u01d5\u01d7\5\24\13\2\u01d6\u01d5\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5D#\2\u01d9\u01d8"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01dae\3\2\2\2\u01db\u01dd\5\64\33\2\u01dc"+
		"\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\35"+
		"\2\2\u01df\u01e1\5,\27\2\u01e0\u01e2\5D#\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\7\4\2\2\u01e4\u01e6\5`\61\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\5\2\2\u01eag\3\2\2\2\u01eb\u01ed"+
		"\5\64\33\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2"+
		"\u01ee\u01ef\7 \2\2\u01ef\u01f1\5,\27\2\u01f0\u01f2\5D#\2\u01f1\u01f0"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\13\2\2"+
		"\u01f4\u01f5\5j\66\2\u01f5i\3\2\2\2\u01f6\u01f7\b\66\1\2\u01f7\u01f8\5"+
		"J&\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa\f\3\2\2\u01fa\u01fb\7\23\2\2\u01fb"+
		"\u01fd\5J&\2\u01fc\u01f9\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ffk\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203"+
		"\5\64\33\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2"+
		"\u0204\u0205\7\37\2\2\u0205\u0207\5,\27\2\u0206\u0208\5D#\2\u0207\u0206"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\7\4\2\2\u020a"+
		"\u020c\5n8\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2"+
		"\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7\5\2\2\u0210m"+
		"\3\2\2\2\u0211\u0213\5\64\33\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2"+
		"\u0213\u0214\3\2\2\2\u0214\u0216\5\66\34\2\u0215\u0217\5D#\2\u0216\u0215"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217o\3\2\2\2\u0218\u021a\5\64\33\2\u0219"+
		"\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7!"+
		"\2\2\u021c\u021e\5,\27\2\u021d\u021f\5D#\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7\4\2\2\u0221\u0223\5d\63\2\u0222"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7\5\2\2\u0227q\3\2\2\2\u0228\u0229"+
		"\7\"\2\2\u0229\u022a\5Z.\2\u022as\3\2\2\2\u022b\u022d\5\64\33\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7#"+
		"\2\2\u022f\u0230\7\20\2\2\u0230\u0232\5,\27\2\u0231\u0233\5b\62\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\r"+
		"\2\2\u0235\u0236\5x=\2\u0236u\3\2\2\2\u0237\u0238\5,\27\2\u0238w\3\2\2"+
		"\2\u0239\u023a\b=\1\2\u023a\u023b\5v<\2\u023b\u0241\3\2\2\2\u023c\u023d"+
		"\f\3\2\2\u023d\u023e\7\23\2\2\u023e\u0240\5v<\2\u023f\u023c\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242y\3\2\2\2"+
		"\u0243\u0241\3\2\2\2I}\u0083\u008c\u0098\u009b\u009e\u00a2\u00aa\u00b2"+
		"\u00be\u00c5\u00c8\u00cc\u00cf\u00d2\u00db\u00e6\u00ea\u00ed\u00f5\u0108"+
		"\u0113\u011f\u0128\u0131\u013a\u014a\u014f\u0154\u0162\u0165\u016b\u016e"+
		"\u0172\u0178\u017d\u0189\u018c\u0191\u0194\u0199\u019c\u019f\u01a4\u01a9"+
		"\u01b0\u01b7\u01bc\u01c0\u01c5\u01cb\u01d0\u01d6\u01d9\u01dc\u01e1\u01e7"+
		"\u01ec\u01f1\u01fe\u0202\u0207\u020d\u0212\u0216\u0219\u021e\u0224\u022c"+
		"\u0232\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}