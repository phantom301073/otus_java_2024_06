package homework;

import java.util.*;

public class CustomerService {

    private final NavigableMap<Customer, String> customerStringNavigableMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        return getCustomerStringSimpleEntry(customerStringNavigableMap.firstEntry());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        if (customerStringNavigableMap.higherEntry(customer) == null) {
            return null;
        }
        return getCustomerStringSimpleEntry(customerStringNavigableMap.higherEntry(customer));
    }

    public void add(Customer customer, String data) {
        customerStringNavigableMap.put(customer, data);
    }

    private AbstractMap.SimpleEntry<Customer, String> getCustomerStringSimpleEntry(Map.Entry<Customer, String> entry) {
        return new AbstractMap.SimpleEntry<>(new Customer(entry.getKey()), entry.getValue());
    }
}
