package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
public class BoardTest {
    @Test void testInvariant(){
        Square row = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = row;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void testSquareAt(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(null);
    }
}
