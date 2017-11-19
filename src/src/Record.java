public class Record {
    public int id;
    public String name;
    public float volume;
    public int  price;
    public String date;

    public Record(int id, String name, float volume, int price, String date)
    {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.date = date;

        //Add the record to the SQLite table
    }
}
