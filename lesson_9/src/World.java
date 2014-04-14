public class World {
    private Cell [][] board;
    private int rows;
    private int cols;

    public World(int rows, int cols)
    {
        int row, col;
        this.rows = rows;
        this.cols = cols;
        board = new Cell[this.rows][this.cols];
        for (row = 0; row < this.rows; row++)
        {
            for (col = 0; col < this.cols; col++)
            {
                board[row][col] = new Cell(false);
            }
        }
    }

    public void nextGen()
    {
        int row, col, neighbors;
        World nextOne = new World(this.rows, this.cols);

        for(row = 1; row < this.rows - 1; row++)
        {
            for (col = 1; col < this.cols - 1; col++)
            {
                neighbors = this.countNeighbors(row, col);
                if(3 == neighbors) {
                    nextOne.makeAlive(row, col);
                } else if (2 == neighbors) {
                    nextOne.setStatus(row, col, this.getStatus(row, col));
                }
            }
        }

        for (row = 0; row < this.rows; row++) {
            for (col = 0; col < this.cols; col++)  {
                board[row][col].setStatus(nextOne.board[row][col].getStatus());
            }
        }
    }

    private int countNeighbors(int curRow, int curCol)
    {
        int row, col, neighbors = 0;
        for (row = curRow - 1; row <= curRow + 1; row++) {
            for (col = curCol - 1; col <= curCol + 1; col++) {
                if(board[row][col].getStatus()) {
                    neighbors++;
                }
            }
        }
        if (board[curRow][curCol].getStatus()) {
            neighbors--;
        }
        return neighbors;
    }

	public String toString()
	{
		String boardPic = "";
		int row, col;

		for (row = 0; row < rows; row++) {
			for (col = 0; col < cols; col++) {
				if(board[row][col].getStatus()) {
					boardPic += "X";
				} else {
					boardPic += ".";
				}
			}
			boardPic += "\n";
		}
		return boardPic;
	}

	public boolean getStatus(int row, int col)
	{
		return board[row][col].getStatus();
	}

	public void setStatus(int row, int col, boolean status)
	{
		board[row][col].setStatus(status);
	}

	public void makeAlive(int row, int col)
	{
		board[row][col].setStatus(true);
	}

	public void makeDead(int row, int col)
	{
		board[row][col].setStatus(false);
	}

	public boolean checker(boolean statement)
	{
		int row, col;
		boolean innerChecker = false;
		for (row = 0; row < this.rows; row++) {
			for (col = 0; col < this.cols; col++) {
				if (board[row][col].getStatus()) {
					innerChecker = true;
				}
			}
		}
		statement = innerChecker;
		return statement;
	}

}
