package homework;

import java.util.*;

public class CustomerReverseOrder {
    LinkedHashSet<Customer> customerSet = new LinkedHashSet<>();

    public void add(Customer customer) {
        customerSet.add(customer);
    }

    public Customer take() {
        return customerSet.reversed().removeFirst();
    }
}
