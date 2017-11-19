public class Record {
    public int id;
    public String name;
    public float volume;
    public int  price;
    public String date;

    public Record(String name, float volume, int price, String date)
    {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.date = date;

        //Add the record to the SQLite table
        int id = DatabaseManager.addRecord(name, volume, price, date);
        this.id = id;
    }

    public void remove()
    {
        DatabaseManager.remove(id);
    }
}
