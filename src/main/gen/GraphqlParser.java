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
		T__17=18, BooleanValue=19, NullValue=20, FRAGMENT=21, QUERY=22, MUTATION=23, 
		SUBSCRIPTION=24, SCHEMA=25, SCALAR=26, TYPE=27, INTERFACE=28, IMPLEMENTS=29, 
		ENUM=30, UNION=31, INPUT=32, EXTEND=33, DIRECTIVE=34, NAME=35, IntValue=36, 
		FloatValue=37, Sign=38, IntegerPart=39, NonZeroDigit=40, ExponentPart=41, 
		Digit=42, StringValue=43, TripleQuotedStringValue=44, Comment=45, Ignored=46;
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
		RULE_fieldTransformation = 48, RULE_targetFieldDefinition = 49, RULE_argumentsDefinition = 50, 
		RULE_inputValueDefinition = 51, RULE_interfaceTypeDefinition = 52, RULE_unionTypeDefinition = 53, 
		RULE_unionMembers = 54, RULE_enumTypeDefinition = 55, RULE_enumValueDefinition = 56, 
		RULE_inputObjectTypeDefinition = 57, RULE_typeExtensionDefinition = 58, 
		RULE_directiveDefinition = 59, RULE_directiveLocation = 60, RULE_directiveLocations = 61;
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
		"fieldsDefinition", "fieldDefinition", "fieldTransformation", "targetFieldDefinition", 
		"argumentsDefinition", "inputValueDefinition", "interfaceTypeDefinition", 
		"unionTypeDefinition", "unionMembers", "enumTypeDefinition", "enumValueDefinition", 
		"inputObjectTypeDefinition", "typeExtensionDefinition", "directiveDefinition", 
		"directiveLocation", "directiveLocations"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'service'", "'{'", "'}'", "'url'", "':'", "'('", "')'", "'$'", 
		"'='", "'...'", "'on'", "'['", "']'", "'@'", "'!'", "'&'", "'=>'", "'|'", 
		null, "'null'", "'fragment'", "'query'", "'mutation'", "'subscription'", 
		"'schema'", "'scalar'", "'type'", "'interface'", "'implements'", "'enum'", 
		"'union'", "'input'", "'extend'", "'directive'", null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "BooleanValue", "NullValue", 
		"FRAGMENT", "QUERY", "MUTATION", "SUBSCRIPTION", "SCHEMA", "SCALAR", "TYPE", 
		"INTERFACE", "IMPLEMENTS", "ENUM", "UNION", "INPUT", "EXTEND", "DIRECTIVE", 
		"NAME", "IntValue", "FloatValue", "Sign", "IntegerPart", "NonZeroDigit", 
		"ExponentPart", "Digit", "StringValue", "TripleQuotedStringValue", "Comment", 
		"Ignored"
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
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				definition();
				}
				}
				setState(127); 
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				operationDefinition();
				}
				break;
			case FRAGMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
				setState(131);
				typeSystemDefinition();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
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
			setState(135);
			match(T__0);
			setState(136);
			name();
			setState(137);
			match(T__1);
			setState(138);
			serviceUrl();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(139);
				typeSystemDefinition();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
			setState(147);
			match(T__3);
			setState(148);
			match(T__4);
			setState(149);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				selectionSet();
				}
				break;
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				operationType();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
					{
					setState(153);
					name();
					}
				}

				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(156);
					variableDefinitions();
					}
				}

				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(159);
					directives();
					}
				}

				setState(162);
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
			setState(166);
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
			setState(168);
			match(T__5);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				variableDefinition();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(174);
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
			setState(176);
			variable();
			setState(177);
			match(T__4);
			setState(178);
			type();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(179);
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
			setState(182);
			match(T__7);
			setState(183);
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
			setState(185);
			match(T__8);
			setState(186);
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
			setState(188);
			match(T__1);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				selection();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0) );
			setState(194);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				fragmentSpread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(201);
				alias();
				}
				break;
			}
			setState(204);
			name();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(205);
				arguments();
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(208);
				directives();
				}
			}

			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(211);
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
			setState(214);
			name();
			setState(215);
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
			setState(217);
			match(T__5);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				argument();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0) );
			setState(223);
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
			setState(225);
			name();
			setState(226);
			match(T__4);
			setState(227);
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
			setState(229);
			match(T__9);
			setState(230);
			fragmentName();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(231);
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
			setState(234);
			match(T__9);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(235);
				typeCondition();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(238);
				directives();
				}
			}

			setState(241);
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
			setState(243);
			match(FRAGMENT);
			setState(244);
			fragmentName();
			setState(245);
			typeCondition();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(246);
				directives();
				}
			}

			setState(249);
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
			setState(251);
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
			setState(253);
			match(T__10);
			setState(254);
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
			setState(256);
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
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringValue:
			case TripleQuotedStringValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				stringValue();
				}
				break;
			case IntValue:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IntValue);
				}
				break;
			case FloatValue:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(FloatValue);
				}
				break;
			case BooleanValue:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(BooleanValue);
				}
				break;
			case NullValue:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
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
				setState(263);
				enumValue();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				arrayValue();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				variable();
				}
				break;
			case StringValue:
			case TripleQuotedStringValue:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				stringValue();
				}
				break;
			case IntValue:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(IntValue);
				}
				break;
			case FloatValue:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(FloatValue);
				}
				break;
			case BooleanValue:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(BooleanValue);
				}
				break;
			case NullValue:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
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
				setState(274);
				enumValue();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				arrayValueWithVariable();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
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
			setState(279);
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
			setState(281);
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
			setState(283);
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
			setState(285);
			match(T__11);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << BooleanValue) | (1L << NullValue) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << IntValue) | (1L << FloatValue) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(286);
				value();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
			setState(294);
			match(T__11);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << BooleanValue) | (1L << NullValue) | (1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << IntValue) | (1L << FloatValue) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0)) {
				{
				{
				setState(295);
				valueWithVariable();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
			setState(303);
			match(T__1);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
				{
				{
				setState(304);
				objectField();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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
			setState(312);
			match(T__1);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME))) != 0)) {
				{
				{
				setState(313);
				objectFieldWithVariable();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
			setState(321);
			name();
			setState(322);
			match(T__4);
			setState(323);
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
			setState(325);
			name();
			setState(326);
			match(T__4);
			setState(327);
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
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				directive();
				}
				}
				setState(332); 
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
			setState(334);
			match(T__13);
			setState(335);
			name();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(336);
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
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				listType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
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
			setState(344);
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
			setState(346);
			match(T__11);
			setState(347);
			type();
			setState(348);
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
			setState(356);
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
				setState(350);
				typeName();
				setState(351);
				match(T__14);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				listType();
				setState(354);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(358);
					description();
					}
					break;
				}
				setState(361);
				schemaDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				typeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				typeExtensionDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
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
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(367);
				description();
				}
			}

			setState(370);
			match(SCHEMA);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(371);
				directives();
				}
			}

			setState(374);
			match(T__1);
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				operationTypeDefinition();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(380);
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
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(382);
				description();
				}
			}

			setState(385);
			operationType();
			setState(386);
			match(T__4);
			setState(387);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				scalarTypeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				objectTypeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				interfaceTypeDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				unionTypeDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				enumTypeDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(397);
				description();
				}
			}

			setState(400);
			match(SCALAR);
			setState(401);
			name();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(402);
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
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(405);
				description();
				}
			}

			setState(408);
			match(TYPE);
			setState(409);
			name();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(410);
				implementsInterfaces(0);
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(413);
				directives();
				}
			}

			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(416);
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
			setState(420);
			match(IMPLEMENTS);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(421);
				match(T__15);
				}
			}

			setState(425); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(424);
					typeName();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
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
					setState(429);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(430);
					match(T__15);
					setState(431);
					typeName();
					}
					} 
				}
				setState(436);
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
			setState(437);
			match(T__1);
			setState(439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438);
				fieldDefinition();
				}
				}
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(443);
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
		public FieldTransformationContext fieldTransformation() {
			return getRuleContext(FieldTransformationContext.class,0);
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
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(445);
				description();
				}
			}

			setState(448);
			name();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(449);
				argumentsDefinition();
				}
			}

			setState(452);
			match(T__4);
			setState(453);
			type();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(454);
				fieldTransformation();
				}
			}

			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(457);
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

	public static class FieldTransformationContext extends ParserRuleContext {
		public TargetFieldDefinitionContext targetFieldDefinition() {
			return getRuleContext(TargetFieldDefinitionContext.class,0);
		}
		public FieldTransformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldTransformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterFieldTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitFieldTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitFieldTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTransformationContext fieldTransformation() throws RecognitionException {
		FieldTransformationContext _localctx = new FieldTransformationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldTransformation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__16);
			setState(461);
			targetFieldDefinition();
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

	public static class TargetFieldDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TargetFieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetFieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).enterTargetFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphqlListener ) ((GraphqlListener)listener).exitTargetFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphqlVisitor ) return ((GraphqlVisitor<? extends T>)visitor).visitTargetFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetFieldDefinitionContext targetFieldDefinition() throws RecognitionException {
		TargetFieldDefinitionContext _localctx = new TargetFieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_targetFieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			name();
			setState(464);
			match(T__4);
			setState(465);
			type();
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
		enterRule(_localctx, 100, RULE_argumentsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__5);
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(468);
				inputValueDefinition();
				}
				}
				setState(471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(473);
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
		enterRule(_localctx, 102, RULE_inputValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(475);
				description();
				}
			}

			setState(478);
			name();
			setState(479);
			match(T__4);
			setState(480);
			type();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(481);
				defaultValue();
				}
			}

			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(484);
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
		enterRule(_localctx, 104, RULE_interfaceTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(487);
				description();
				}
			}

			setState(490);
			match(INTERFACE);
			setState(491);
			name();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(492);
				directives();
				}
			}

			setState(495);
			match(T__1);
			setState(497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(496);
				fieldDefinition();
				}
				}
				setState(499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(501);
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
		enterRule(_localctx, 106, RULE_unionTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(503);
				description();
				}
			}

			setState(506);
			match(UNION);
			setState(507);
			name();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(508);
				directives();
				}
			}

			setState(511);
			match(T__8);
			setState(512);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_unionMembers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(515);
			typeName();
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnionMembersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unionMembers);
					setState(517);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(518);
					match(T__17);
					setState(519);
					typeName();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 110, RULE_enumTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(525);
				description();
				}
			}

			setState(528);
			match(ENUM);
			setState(529);
			name();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(530);
				directives();
				}
			}

			setState(533);
			match(T__1);
			setState(535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(534);
				enumValueDefinition();
				}
				}
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(539);
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
		enterRule(_localctx, 112, RULE_enumValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(541);
				description();
				}
			}

			setState(544);
			enumValue();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(545);
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
		enterRule(_localctx, 114, RULE_inputObjectTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(548);
				description();
				}
			}

			setState(551);
			match(INPUT);
			setState(552);
			name();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(553);
				directives();
				}
			}

			setState(556);
			match(T__1);
			setState(558); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557);
				inputValueDefinition();
				}
				}
				setState(560); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << SCHEMA) | (1L << SCALAR) | (1L << TYPE) | (1L << INTERFACE) | (1L << IMPLEMENTS) | (1L << ENUM) | (1L << UNION) | (1L << INPUT) | (1L << EXTEND) | (1L << DIRECTIVE) | (1L << NAME) | (1L << StringValue) | (1L << TripleQuotedStringValue))) != 0) );
			setState(562);
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
		enterRule(_localctx, 116, RULE_typeExtensionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(EXTEND);
			setState(565);
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
		enterRule(_localctx, 118, RULE_directiveDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringValue || _la==TripleQuotedStringValue) {
				{
				setState(567);
				description();
				}
			}

			setState(570);
			match(DIRECTIVE);
			setState(571);
			match(T__13);
			setState(572);
			name();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(573);
				argumentsDefinition();
				}
			}

			setState(576);
			match(T__10);
			setState(577);
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
		enterRule(_localctx, 120, RULE_directiveLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_directiveLocations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(582);
			directiveLocation();
			}
			_ctx.stop = _input.LT(-1);
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectiveLocationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_directiveLocations);
					setState(584);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(585);
					match(T__17);
					setState(586);
					directiveLocation();
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		case 54:
			return unionMembers_sempred((UnionMembersContext)_localctx, predIndex);
		case 61:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0253\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\6\2\u0080\n\2\r\2\16\2\u0081\3\3\3\3\3\3\3\3\5\3\u0088"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u009d\n\6\3\6\5\6\u00a0\n\6\3\6\5\6\u00a3"+
		"\n\6\3\6\3\6\5\6\u00a7\n\6\3\7\3\7\3\b\3\b\6\b\u00ad\n\b\r\b\16\b\u00ae"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\6\f\u00c1\n\f\r\f\16\f\u00c2\3\f\3\f\3\r\3\r\3\r\5\r\u00ca\n\r\3"+
		"\16\5\16\u00cd\n\16\3\16\3\16\5\16\u00d1\n\16\3\16\5\16\u00d4\n\16\3\16"+
		"\5\16\u00d7\n\16\3\17\3\17\3\17\3\20\3\20\6\20\u00de\n\20\r\20\16\20\u00df"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23"+
		"\5\23\u00ef\n\23\3\23\5\23\u00f2\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5"+
		"\24\u00fa\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0118\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\7\35\u0122\n\35\f\35\16\35\u0125\13\35\3\35\3\35\3\36\3\36\7\36"+
		"\u012b\n\36\f\36\16\36\u012e\13\36\3\36\3\36\3\37\3\37\7\37\u0134\n\37"+
		"\f\37\16\37\u0137\13\37\3\37\3\37\3 \3 \7 \u013d\n \f \16 \u0140\13 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\6#\u014d\n#\r#\16#\u014e\3$\3$\3$"+
		"\5$\u0154\n$\3%\3%\3%\5%\u0159\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\5(\u0167\n(\3)\5)\u016a\n)\3)\3)\3)\3)\5)\u0170\n)\3*\5*\u0173\n"+
		"*\3*\3*\5*\u0177\n*\3*\3*\6*\u017b\n*\r*\16*\u017c\3*\3*\3+\5+\u0182\n"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u018e\n,\3-\5-\u0191\n-\3-\3-\3-\5"+
		"-\u0196\n-\3.\5.\u0199\n.\3.\3.\3.\5.\u019e\n.\3.\5.\u01a1\n.\3.\5.\u01a4"+
		"\n.\3/\3/\3/\5/\u01a9\n/\3/\6/\u01ac\n/\r/\16/\u01ad\3/\3/\3/\7/\u01b3"+
		"\n/\f/\16/\u01b6\13/\3\60\3\60\6\60\u01ba\n\60\r\60\16\60\u01bb\3\60\3"+
		"\60\3\61\5\61\u01c1\n\61\3\61\3\61\5\61\u01c5\n\61\3\61\3\61\3\61\5\61"+
		"\u01ca\n\61\3\61\5\61\u01cd\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\6\64\u01d8\n\64\r\64\16\64\u01d9\3\64\3\64\3\65\5\65\u01df\n"+
		"\65\3\65\3\65\3\65\3\65\5\65\u01e5\n\65\3\65\5\65\u01e8\n\65\3\66\5\66"+
		"\u01eb\n\66\3\66\3\66\3\66\5\66\u01f0\n\66\3\66\3\66\6\66\u01f4\n\66\r"+
		"\66\16\66\u01f5\3\66\3\66\3\67\5\67\u01fb\n\67\3\67\3\67\3\67\5\67\u0200"+
		"\n\67\3\67\3\67\3\67\38\38\38\38\38\38\78\u020b\n8\f8\168\u020e\138\3"+
		"9\59\u0211\n9\39\39\39\59\u0216\n9\39\39\69\u021a\n9\r9\169\u021b\39\3"+
		"9\3:\5:\u0221\n:\3:\3:\5:\u0225\n:\3;\5;\u0228\n;\3;\3;\3;\5;\u022d\n"+
		";\3;\3;\6;\u0231\n;\r;\16;\u0232\3;\3;\3<\3<\3<\3=\5=\u023b\n=\3=\3=\3"+
		"=\3=\5=\u0241\n=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\7?\u024e\n?\f?\16?\u0251"+
		"\13?\3?\2\5\\n|@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\5\3\2\30\32\3\2\27%\3\2-"+
		".\2\u0273\2\177\3\2\2\2\4\u0087\3\2\2\2\6\u0089\3\2\2\2\b\u0095\3\2\2"+
		"\2\n\u00a6\3\2\2\2\f\u00a8\3\2\2\2\16\u00aa\3\2\2\2\20\u00b2\3\2\2\2\22"+
		"\u00b8\3\2\2\2\24\u00bb\3\2\2\2\26\u00be\3\2\2\2\30\u00c9\3\2\2\2\32\u00cc"+
		"\3\2\2\2\34\u00d8\3\2\2\2\36\u00db\3\2\2\2 \u00e3\3\2\2\2\"\u00e7\3\2"+
		"\2\2$\u00ec\3\2\2\2&\u00f5\3\2\2\2(\u00fd\3\2\2\2*\u00ff\3\2\2\2,\u0102"+
		"\3\2\2\2.\u010c\3\2\2\2\60\u0117\3\2\2\2\62\u0119\3\2\2\2\64\u011b\3\2"+
		"\2\2\66\u011d\3\2\2\28\u011f\3\2\2\2:\u0128\3\2\2\2<\u0131\3\2\2\2>\u013a"+
		"\3\2\2\2@\u0143\3\2\2\2B\u0147\3\2\2\2D\u014c\3\2\2\2F\u0150\3\2\2\2H"+
		"\u0158\3\2\2\2J\u015a\3\2\2\2L\u015c\3\2\2\2N\u0166\3\2\2\2P\u016f\3\2"+
		"\2\2R\u0172\3\2\2\2T\u0181\3\2\2\2V\u018d\3\2\2\2X\u0190\3\2\2\2Z\u0198"+
		"\3\2\2\2\\\u01a5\3\2\2\2^\u01b7\3\2\2\2`\u01c0\3\2\2\2b\u01ce\3\2\2\2"+
		"d\u01d1\3\2\2\2f\u01d5\3\2\2\2h\u01de\3\2\2\2j\u01ea\3\2\2\2l\u01fa\3"+
		"\2\2\2n\u0204\3\2\2\2p\u0210\3\2\2\2r\u0220\3\2\2\2t\u0227\3\2\2\2v\u0236"+
		"\3\2\2\2x\u023a\3\2\2\2z\u0245\3\2\2\2|\u0247\3\2\2\2~\u0080\5\4\3\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\3\3\2\2\2\u0083\u0088\5\n\6\2\u0084\u0088\5&\24\2\u0085\u0088\5P)\2\u0086"+
		"\u0088\5\6\4\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\5\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b"+
		"\5,\27\2\u008b\u008c\7\4\2\2\u008c\u0090\5\b\5\2\u008d\u008f\5P)\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\5\2\2\u0094"+
		"\7\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7\7\2\2\u0097\u0098\5\62\32"+
		"\2\u0098\t\3\2\2\2\u0099\u00a7\5\26\f\2\u009a\u009c\5\f\7\2\u009b\u009d"+
		"\5,\27\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\5\16\b\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u00a3\5D#\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a7\3\2\2\2\u00a6\u0099\3"+
		"\2\2\2\u00a6\u009a\3\2\2\2\u00a7\13\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9"+
		"\r\3\2\2\2\u00aa\u00ac\7\b\2\2\u00ab\u00ad\5\20\t\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\7\t\2\2\u00b1\17\3\2\2\2\u00b2\u00b3\5\22\n\2\u00b3"+
		"\u00b4\7\7\2\2\u00b4\u00b6\5H%\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba"+
		"\5,\27\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\5.\30\2\u00bd"+
		"\25\3\2\2\2\u00be\u00c0\7\4\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\7\5\2\2\u00c5\27\3\2\2\2\u00c6\u00ca\5\32\16\2\u00c7"+
		"\u00ca\5\"\22\2\u00c8\u00ca\5$\23\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cd\5\34\17\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5,"+
		"\27\2\u00cf\u00d1\5\36\20\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\5D#\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\26\f\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\7\7\2"+
		"\2\u00da\35\3\2\2\2\u00db\u00dd\7\b\2\2\u00dc\u00de\5 \21\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\5,\27"+
		"\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\5\60\31\2\u00e6!\3\2\2\2\u00e7\u00e8"+
		"\7\f\2\2\u00e8\u00ea\5(\25\2\u00e9\u00eb\5D#\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ee\7\f\2\2\u00ed\u00ef\5*\26\2"+
		"\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2"+
		"\5D#\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\5\26\f\2\u00f4%\3\2\2\2\u00f5\u00f6\7\27\2\2\u00f6\u00f7\5(\25"+
		"\2\u00f7\u00f9\5*\26\2\u00f8\u00fa\5D#\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\26\f\2\u00fc\'\3\2\2\2\u00fd"+
		"\u00fe\5,\27\2\u00fe)\3\2\2\2\u00ff\u0100\7\r\2\2\u0100\u0101\5J&\2\u0101"+
		"+\3\2\2\2\u0102\u0103\t\3\2\2\u0103-\3\2\2\2\u0104\u010d\5\62\32\2\u0105"+
		"\u010d\7&\2\2\u0106\u010d\7\'\2\2\u0107\u010d\7\25\2\2\u0108\u010d\7\26"+
		"\2\2\u0109\u010d\5\66\34\2\u010a\u010d\58\35\2\u010b\u010d\5<\37\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d/\3\2\2\2\u010e\u0118\5\22\n\2\u010f\u0118\5\62\32"+
		"\2\u0110\u0118\7&\2\2\u0111\u0118\7\'\2\2\u0112\u0118\7\25\2\2\u0113\u0118"+
		"\7\26\2\2\u0114\u0118\5\66\34\2\u0115\u0118\5:\36\2\u0116\u0118\5> \2"+
		"\u0117\u010e\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0111"+
		"\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\61\3\2\2\2\u0119\u011a\t\4\2"+
		"\2\u011a\63\3\2\2\2\u011b\u011c\5\62\32\2\u011c\65\3\2\2\2\u011d\u011e"+
		"\5,\27\2\u011e\67\3\2\2\2\u011f\u0123\7\16\2\2\u0120\u0122\5.\30\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\17\2\2\u0127"+
		"9\3\2\2\2\u0128\u012c\7\16\2\2\u0129\u012b\5\60\31\2\u012a\u0129\3\2\2"+
		"\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\17\2\2\u0130;\3\2\2\2\u0131"+
		"\u0135\7\4\2\2\u0132\u0134\5@!\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\7\5\2\2\u0139=\3\2\2\2\u013a\u013e\7\4\2\2\u013b"+
		"\u013d\5B\"\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7\5\2\2\u0142?\3\2\2\2\u0143\u0144\5,\27\2\u0144\u0145\7\7\2\2"+
		"\u0145\u0146\5.\30\2\u0146A\3\2\2\2\u0147\u0148\5,\27\2\u0148\u0149\7"+
		"\7\2\2\u0149\u014a\5\60\31\2\u014aC\3\2\2\2\u014b\u014d\5F$\2\u014c\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"E\3\2\2\2\u0150\u0151\7\20\2\2\u0151\u0153\5,\27\2\u0152\u0154\5\36\20"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154G\3\2\2\2\u0155\u0159"+
		"\5J&\2\u0156\u0159\5L\'\2\u0157\u0159\5N(\2\u0158\u0155\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159I\3\2\2\2\u015a\u015b\5,\27\2"+
		"\u015bK\3\2\2\2\u015c\u015d\7\16\2\2\u015d\u015e\5H%\2\u015e\u015f\7\17"+
		"\2\2\u015fM\3\2\2\2\u0160\u0161\5J&\2\u0161\u0162\7\21\2\2\u0162\u0167"+
		"\3\2\2\2\u0163\u0164\5L\'\2\u0164\u0165\7\21\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0160\3\2\2\2\u0166\u0163\3\2\2\2\u0167O\3\2\2\2\u0168\u016a\5\64\33"+
		"\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0170"+
		"\5R*\2\u016c\u0170\5V,\2\u016d\u0170\5v<\2\u016e\u0170\5x=\2\u016f\u0169"+
		"\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"Q\3\2\2\2\u0171\u0173\5\64\33\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174\u0176\7\33\2\2\u0175\u0177\5D#\2\u0176\u0175"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\7\4\2\2\u0179"+
		"\u017b\5T+\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\5\2\2\u017fS"+
		"\3\2\2\2\u0180\u0182\5\64\33\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\5\f\7\2\u0184\u0185\7\7\2\2\u0185\u0186"+
		"\5J&\2\u0186U\3\2\2\2\u0187\u018e\5X-\2\u0188\u018e\5Z.\2\u0189\u018e"+
		"\5j\66\2\u018a\u018e\5l\67\2\u018b\u018e\5p9\2\u018c\u018e\5t;\2\u018d"+
		"\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eW\3\2\2\2\u018f\u0191"+
		"\5\64\33\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2"+
		"\u0192\u0193\7\34\2\2\u0193\u0195\5,\27\2\u0194\u0196\5D#\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196Y\3\2\2\2\u0197\u0199\5\64\33\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\35"+
		"\2\2\u019b\u019d\5,\27\2\u019c\u019e\5\\/\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5D#\2\u01a0\u019f\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5^\60\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4[\3\2\2\2\u01a5\u01a6\b/\1\2\u01a6\u01a8"+
		"\7\37\2\2\u01a7\u01a9\7\22\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2"+
		"\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5J&\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b4\3\2\2\2\u01af"+
		"\u01b0\f\3\2\2\u01b0\u01b1\7\22\2\2\u01b1\u01b3\5J&\2\u01b2\u01af\3\2"+
		"\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"]\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\7\4\2\2\u01b8\u01ba\5`\61\2"+
		"\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\5\2\2\u01be_\3\2\2\2\u01bf"+
		"\u01c1\5\64\33\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c4\5,\27\2\u01c3\u01c5\5f\64\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\7\2\2\u01c7\u01c9\5H"+
		"%\2\u01c8\u01ca\5b\62\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cc\3\2\2\2\u01cb\u01cd\5D#\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cda\3\2\2\2\u01ce\u01cf\7\23\2\2\u01cf\u01d0\5d\63\2\u01d0c\3\2"+
		"\2\2\u01d1\u01d2\5,\27\2\u01d2\u01d3\7\7\2\2\u01d3\u01d4\5H%\2\u01d4e"+
		"\3\2\2\2\u01d5\u01d7\7\b\2\2\u01d6\u01d8\5h\65\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\7\t\2\2\u01dcg\3\2\2\2\u01dd\u01df\5\64\33\2\u01de\u01dd"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5,\27\2\u01e1"+
		"\u01e2\7\7\2\2\u01e2\u01e4\5H%\2\u01e3\u01e5\5\24\13\2\u01e4\u01e3\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8\5D#\2\u01e7\u01e6"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8i\3\2\2\2\u01e9\u01eb\5\64\33\2\u01ea"+
		"\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\36"+
		"\2\2\u01ed\u01ef\5,\27\2\u01ee\u01f0\5D#\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\7\4\2\2\u01f2\u01f4\5`\61\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\5\2\2\u01f8k\3\2\2\2\u01f9\u01fb"+
		"\5\64\33\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2"+
		"\u01fc\u01fd\7!\2\2\u01fd\u01ff\5,\27\2\u01fe\u0200\5D#\2\u01ff\u01fe"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\13\2\2"+
		"\u0202\u0203\5n8\2\u0203m\3\2\2\2\u0204\u0205\b8\1\2\u0205\u0206\5J&\2"+
		"\u0206\u020c\3\2\2\2\u0207\u0208\f\3\2\2\u0208\u0209\7\24\2\2\u0209\u020b"+
		"\5J&\2\u020a\u0207\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020do\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\64\33"+
		"\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213"+
		"\7 \2\2\u0213\u0215\5,\27\2\u0214\u0216\5D#\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\7\4\2\2\u0218\u021a\5r"+
		":\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7\5\2\2\u021eq\3\2\2\2"+
		"\u021f\u0221\5\64\33\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0224\5\66\34\2\u0223\u0225\5D#\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225s\3\2\2\2\u0226\u0228\5\64\33\2\u0227\u0226\3\2\2"+
		"\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7\"\2\2\u022a\u022c"+
		"\5,\27\2\u022b\u022d\5D#\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0230\7\4\2\2\u022f\u0231\5h\65\2\u0230\u022f\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\7\5\2\2\u0235u\3\2\2\2\u0236\u0237\7#\2\2\u0237"+
		"\u0238\5Z.\2\u0238w\3\2\2\2\u0239\u023b\5\64\33\2\u023a\u0239\3\2\2\2"+
		"\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7$\2\2\u023d\u023e"+
		"\7\20\2\2\u023e\u0240\5,\27\2\u023f\u0241\5f\64\2\u0240\u023f\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7\r\2\2\u0243\u0244"+
		"\5|?\2\u0244y\3\2\2\2\u0245\u0246\5,\27\2\u0246{\3\2\2\2\u0247\u0248\b"+
		"?\1\2\u0248\u0249\5z>\2\u0249\u024f\3\2\2\2\u024a\u024b\f\3\2\2\u024b"+
		"\u024c\7\24\2\2\u024c\u024e\5z>\2\u024d\u024a\3\2\2\2\u024e\u0251\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250}\3\2\2\2\u0251\u024f"+
		"\3\2\2\2J\u0081\u0087\u0090\u009c\u009f\u00a2\u00a6\u00ae\u00b6\u00c2"+
		"\u00c9\u00cc\u00d0\u00d3\u00d6\u00df\u00ea\u00ee\u00f1\u00f9\u010c\u0117"+
		"\u0123\u012c\u0135\u013e\u014e\u0153\u0158\u0166\u0169\u016f\u0172\u0176"+
		"\u017c\u0181\u018d\u0190\u0195\u0198\u019d\u01a0\u01a3\u01a8\u01ad\u01b4"+
		"\u01bb\u01c0\u01c4\u01c9\u01cc\u01d9\u01de\u01e4\u01e7\u01ea\u01ef\u01f5"+
		"\u01fa\u01ff\u020c\u0210\u0215\u021b\u0220\u0224\u0227\u022c\u0232\u023a"+
		"\u0240\u024f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}