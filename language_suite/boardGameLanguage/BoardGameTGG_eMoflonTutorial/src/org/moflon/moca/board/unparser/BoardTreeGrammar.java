// $ANTLR 3.5.2 C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g 2014-12-22 12:23:20

package org.moflon.moca.board.unparser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class BoardTreeGrammar extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "ID", "STRING", "'BOARD'", 
		"'BOARD_SPEC'", "'COLS'", "'COLUMN'", "'DIMENSIONS'", "'ROW'", "'ROWS'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ATTRIBUTE=4;
	public static final int ID=5;
	public static final int STRING=6;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public BoardTreeGrammar(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public BoardTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("BoardTreeGrammarTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return BoardTreeGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g"; }


		public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)	throws RecognitionException  {
			try {
	        		return super.recoverFromMismatchedToken(input, ttype, follow);
	            } catch(java.util.NoSuchElementException e){
	                throw new IllegalArgumentException("Your tree does not comply with your tree grammar!\n"
	                		+ " Problems encountered at: [" + "..." + getTreeNodeStream().LT(-1) + " " 
	                		+ getTreeNodeStream().LT(1) + "..." + "] in tree.");
			}
	    }


	public static class main_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main"
	// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:1: main : ^( 'BOARD_SPEC' ( dimensions )? ^( 'BOARD' (rows+= row )+ ) ) -> board(rows=$rows);
	public final BoardTreeGrammar.main_return main() throws RecognitionException {
		BoardTreeGrammar.main_return retval = new BoardTreeGrammar.main_return();
		retval.start = input.LT(1);

		List<Object> list_rows=null;
		RuleReturnScope rows = null;
		try {
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:5: ( ^( 'BOARD_SPEC' ( dimensions )? ^( 'BOARD' (rows+= row )+ ) ) -> board(rows=$rows))
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:7: ^( 'BOARD_SPEC' ( dimensions )? ^( 'BOARD' (rows+= row )+ ) )
			{
			match(input,8,FOLLOW_8_in_main85); 
			match(input, Token.DOWN, null); 
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:22: ( dimensions )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==11) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:22: dimensions
					{
					pushFollow(FOLLOW_dimensions_in_main87);
					dimensions();
					state._fsp--;

					}
					break;

			}

			match(input,7,FOLLOW_7_in_main91); 
			match(input, Token.DOWN, null); 
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:48: (rows+= row )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==12) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:36:48: rows+= row
					{
					pushFollow(FOLLOW_row_in_main95);
					rows=row();
					state._fsp--;

					if (list_rows==null) list_rows=new ArrayList<Object>();
					list_rows.add(rows.getTemplate());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 36:57: -> board(rows=$rows)
			{
				retval.st = templateLib.getInstanceOf("board",new STAttrMap().put("rows", list_rows));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"


	public static class dimensions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dimensions"
	// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:38:1: dimensions : ^( 'DIMENSIONS' ^( 'ROWS' STRING ) ^( 'COLS' STRING ) ) ;
	public final BoardTreeGrammar.dimensions_return dimensions() throws RecognitionException {
		BoardTreeGrammar.dimensions_return retval = new BoardTreeGrammar.dimensions_return();
		retval.start = input.LT(1);

		try {
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:38:11: ( ^( 'DIMENSIONS' ^( 'ROWS' STRING ) ^( 'COLS' STRING ) ) )
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:38:13: ^( 'DIMENSIONS' ^( 'ROWS' STRING ) ^( 'COLS' STRING ) )
			{
			match(input,11,FOLLOW_11_in_dimensions115); 
			match(input, Token.DOWN, null); 
			match(input,13,FOLLOW_13_in_dimensions118); 
			match(input, Token.DOWN, null); 
			match(input,STRING,FOLLOW_STRING_in_dimensions120); 
			match(input, Token.UP, null); 

			match(input,9,FOLLOW_9_in_dimensions124); 
			match(input, Token.DOWN, null); 
			match(input,STRING,FOLLOW_STRING_in_dimensions126); 
			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dimensions"


	public static class row_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "row"
	// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:40:1: row : ^( 'ROW' (columns+= column )+ ) -> row(columns=$columns);
	public final BoardTreeGrammar.row_return row() throws RecognitionException {
		BoardTreeGrammar.row_return retval = new BoardTreeGrammar.row_return();
		retval.start = input.LT(1);

		List<Object> list_columns=null;
		RuleReturnScope columns = null;
		try {
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:40:4: ( ^( 'ROW' (columns+= column )+ ) -> row(columns=$columns))
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:40:6: ^( 'ROW' (columns+= column )+ )
			{
			match(input,12,FOLLOW_12_in_row136); 
			match(input, Token.DOWN, null); 
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:40:21: (columns+= column )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==10) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:40:21: columns+= column
					{
					pushFollow(FOLLOW_column_in_row140);
					columns=column();
					state._fsp--;

					if (list_columns==null) list_columns=new ArrayList<Object>();
					list_columns.add(columns.getTemplate());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 40:32: -> row(columns=$columns)
			{
				retval.st = templateLib.getInstanceOf("row",new STAttrMap().put("columns", list_columns));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "row"


	public static class column_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "column"
	// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:42:1: column : ^( 'COLUMN' (t+= STRING )? ) -> column(type=$t);
	public final BoardTreeGrammar.column_return column() throws RecognitionException {
		BoardTreeGrammar.column_return retval = new BoardTreeGrammar.column_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		List<Object> list_t=null;

		try {
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:42:7: ( ^( 'COLUMN' (t+= STRING )? ) -> column(type=$t))
			// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:42:9: ^( 'COLUMN' (t+= STRING )? )
			{
			match(input,10,FOLLOW_10_in_column159); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:42:21: (t+= STRING )?
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==STRING) ) {
					alt4=1;
				}
				switch (alt4) {
					case 1 :
						// C:\\Workspace\\TestWorkspace_17_12_14\\TrafoZoo0\\BoardGameTGG_eMoflonTutorial\\src\\org\\moflon\\moca\\board\\unparser\\BoardTreeGrammar.g:42:21: t+= STRING
						{
						t=(CommonTree)match(input,STRING,FOLLOW_STRING_in_column163); 
						if (list_t==null) list_t=new ArrayList<Object>();
						list_t.add(t);
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 42:32: -> column(type=$t)
			{
				retval.st = templateLib.getInstanceOf("column",new STAttrMap().put("type", list_t));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column"

	// Delegated rules



	public static final BitSet FOLLOW_8_in_main85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dimensions_in_main87 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_main91 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_row_in_main95 = new BitSet(new long[]{0x0000000000001008L});
	public static final BitSet FOLLOW_11_in_dimensions115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_13_in_dimensions118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_dimensions120 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_9_in_dimensions124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_dimensions126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_12_in_row136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_in_row140 = new BitSet(new long[]{0x0000000000000408L});
	public static final BitSet FOLLOW_10_in_column159 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_column163 = new BitSet(new long[]{0x0000000000000008L});
}
