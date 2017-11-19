public class Record {
    public int id;
    public String name;
    public float volume;
    public int  price;
    public String date;

    /**
     * Call this to create a record object
     * @param id
     * @param name
     * @param volume
     * @param price
     * @param date
     */
    public Record(int id, String name, float volume, int price, String date)
    {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.date = date;

    }

    public void remove()
    {
        DatabaseManager.remove(id);
    }

    public String toString()
    {
        return name;
    }
}
