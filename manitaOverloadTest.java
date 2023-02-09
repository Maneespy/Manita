public class manitaOverloadTest {
    public static void main(String[] args) {
        House houseobj = new House();
        int house = 9031;
        byte street =6;

        houseobj.location();
        houseobj.location("NewYork");
        houseobj.location(house);
        houseobj.location(house, street);
        houseobj.location(street, house);

    }
}
class House
{
    void location()
    {
        System.out.println(" House purchasing ");
    }
    void location (String city)
    {
        System.out.println("House is located in :"+city);
    }
    void location (int houseNumber)
    {
        System.out.println("The house number designated is :"+houseNumber);
    }
    void location ( int houseNumber, byte streetNumber)
    {
        System.out.println("Designated house number "+houseNumber+ " and on street :"+streetNumber);
    }
    void location (byte houseNumber, int streetNumber)
    {
        System.out.println("Designated house number "+houseNumber+ " and on street :"+streetNumber);
    }
}
