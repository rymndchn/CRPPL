// Generated from CRPPL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CRPPLParser}.
 */
public interface CRPPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpr(CRPPLParser.MultiexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpr(CRPPLParser.MultiexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#validexpr}.
	 * @param ctx the parse tree
	 */
	void enterValidexpr(CRPPLParser.ValidexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#validexpr}.
	 * @param ctx the parse tree
	 */
	void exitValidexpr(CRPPLParser.ValidexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CRPPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CRPPLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#generalquery}.
	 * @param ctx the parse tree
	 */
	void enterGeneralquery(CRPPLParser.GeneralqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#generalquery}.
	 * @param ctx the parse tree
	 */
	void exitGeneralquery(CRPPLParser.GeneralqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#importfile}.
	 * @param ctx the parse tree
	 */
	void enterImportfile(CRPPLParser.ImportfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#importfile}.
	 * @param ctx the parse tree
	 */
	void exitImportfile(CRPPLParser.ImportfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#defineconstant}.
	 * @param ctx the parse tree
	 */
	void enterDefineconstant(CRPPLParser.DefineconstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#defineconstant}.
	 * @param ctx the parse tree
	 */
	void exitDefineconstant(CRPPLParser.DefineconstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#altercolumn}.
	 * @param ctx the parse tree
	 */
	void enterAltercolumn(CRPPLParser.AltercolumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#altercolumn}.
	 * @param ctx the parse tree
	 */
	void exitAltercolumn(CRPPLParser.AltercolumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#graphquery}.
	 * @param ctx the parse tree
	 */
	void enterGraphquery(CRPPLParser.GraphqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#graphquery}.
	 * @param ctx the parse tree
	 */
	void exitGraphquery(CRPPLParser.GraphqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#createfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunction(CRPPLParser.CreatefunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#createfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunction(CRPPLParser.CreatefunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(CRPPLParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(CRPPLParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#functionprototype}.
	 * @param ctx the parse tree
	 */
	void enterFunctionprototype(CRPPLParser.FunctionprototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#functionprototype}.
	 * @param ctx the parse tree
	 */
	void exitFunctionprototype(CRPPLParser.FunctionprototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#conditionalstatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalstatement(CRPPLParser.ConditionalstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#conditionalstatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalstatement(CRPPLParser.ConditionalstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRPPLParser#booleanstatement}.
	 * @param ctx the parse tree
	 */
	void enterBooleanstatement(CRPPLParser.BooleanstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRPPLParser#booleanstatement}.
	 * @param ctx the parse tree
	 */
	void exitBooleanstatement(CRPPLParser.BooleanstatementContext ctx);
}