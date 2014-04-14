public class Cell {
    private boolean status;

    public Cell(boolean aliveOrDead)
    {
        status = aliveOrDead;
    }

    public void setStatus(boolean aliveOrDead)
    {
        status  = aliveOrDead;
    }

    public boolean getStatus()
    {
        return this.status;
    }
}
