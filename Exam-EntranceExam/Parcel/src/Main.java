
public class Main
{
    public enum l_enumFileCreation
    {
        CREATED,
        EXISTING,
        ERROR
    }
    public static void main(String[] args)
    {
        /* Amount of books to add */
        int l_intTotalParcels = 3;

        Parcel[] l_classParcel = new Parcel[l_intTotalParcels];

        /*
        * House equals TRUE
        * Flat equals FALSE
        */
        Address l_classAddressDeparture0 = new Address("Mexico", "Guadalajara", "Lopez Mateos", 108, true);
        Address l_classAddressArrival0 = new Address("Aguascalientes", "Aguascalientes", "Mariano Otero", 136, true);

        /*
         * House equals TRUE
         * Flat equals FALSE
         */
        Address l_classAddressDeparture1 = new Address("Aguascalientes", "Aguascalientes", "Mariano Otero", 136, true);
        Address l_classAddressArrival1 = new Address("Mexico", "Guadalajara", "Lopez Mateos", 108, true);
        /*
         * House equals TRUE
         * Flat equals FALSE
         */
        Address l_classAddressDeparture2 = new Address("Germany", "Berlin", "Main Strasse", 23, false);
        Address l_classAddressArrival2 = new Address("Germany", "Dortmund", "Main Strasse", 60, false);


        Date l_classDeparture0 = new Date(20,10,2023);
        Date l_classArrival0 = new Date(20,01,2024);
        Date l_classDeparture1 = new Date(20,11,2023);
        Date l_classArrival1 = new Date(05,03,2024);
        Date l_classDeparture2 = new Date(14,02,2024);
        Date l_classArrival2 = new Date(28,06,2024);

        l_classParcel[0] = new Parcel(20368, l_classDeparture0, l_classArrival0, l_classAddressDeparture0, l_classAddressArrival0);
        l_classParcel[1] = new Parcel(54682, l_classDeparture1, l_classArrival1, l_classAddressDeparture1, l_classAddressArrival1);
        l_classParcel[2] = new Parcel(23654, l_classDeparture2, l_classArrival2, l_classAddressDeparture2, l_classAddressArrival2);

        do
        {
            l_intTotalParcels--;
            System.out.println("----------------------------------------------------------------");
            System.out.println("Package ID... " + Integer.toString(l_classParcel[l_intTotalParcels].get_intID()));
            System.out.println("Package Arrive @: " + Integer.toString(l_classParcel[l_intTotalParcels].get_classDateOfArrival().get_intDate()) + "/" + Integer.toString(l_classParcel[l_intTotalParcels].get_classDateOfArrival().get_intMonth()) + "/" + Integer.toString(l_classParcel[l_intTotalParcels].get_classDateOfArrival().get_intYear()));
            l_classParcel[l_intTotalParcels].get_classAddressOfDeparture().get_stringAddress();
            l_classParcel[l_intTotalParcels].get_classAddressOfArrival().get_stringAddress();
        }while(l_intTotalParcels != 0);

    }

}