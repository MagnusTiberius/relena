// Generated from Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UMINUS}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUMINUS(CalculatorParser.UMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UMINUS}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUMINUS(CalculatorParser.UMINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENGRP(CalculatorParser.PARENGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENGRP(CalculatorParser.PARENGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDOUBLE(CalculatorParser.DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDOUBLE(CalculatorParser.DOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULOPGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULOPGRP(CalculatorParser.MULOPGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULOPGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULOPGRP(CalculatorParser.MULOPGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDOPGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDOPGRP(CalculatorParser.ADDOPGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDOPGRP}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDOPGRP(CalculatorParser.ADDOPGRPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(CalculatorParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(CalculatorParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CalculatorParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CalculatorParser.MulopContext ctx);
}