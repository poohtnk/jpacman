package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Thanakorn Limpanawuthi
 */
public class BoardTest {
    /**
     * TestInvariant
     */
    @Test 
    void testInvariant() {
        Square row = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = row;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void testSquareAt() {
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(null);
    }
    @Test
    void testGetWidth() {
        Square row = new BasicSquare();
        Square[][] grid = new Square[2][2];
        grid[0][0] = row;
        grid[0][1] = row;
        grid[1][0] = row;
        grid[1][1] = row;
        Board board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(2);
    }
    @Test
    void testGetHeight() {
        Square row = new BasicSquare();
        Square[][] grid = new Square[2][2];
        grid[0][0] = row;
        grid[0][1] = row;
        grid[1][0] = row;
        grid[1][1] = row;
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(2);
    }
}
