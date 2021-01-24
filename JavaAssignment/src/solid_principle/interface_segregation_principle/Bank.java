package solid_principle.interface_segregation_principle;

public interface Bank extends Payment {
    void initiatePayments();
}