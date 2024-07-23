package homework;

import java.util.*;

public class CustomerService {

    private final NavigableMap<Customer, String> customerStringTreeMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        return getCustomerStringSimpleEntry(customerStringTreeMap.firstEntry());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        if (customerStringTreeMap.higherEntry(customer) == null) {
            return null;
        }
        return getCustomerStringSimpleEntry(customerStringTreeMap.higherEntry(customer));
    }

    public void add(Customer customer, String data) {
        customerStringTreeMap.put(customer, data);
    }

    private AbstractMap.SimpleEntry<Customer, String> getCustomerStringSimpleEntry(Map.Entry<Customer, String> entry) {
        return new AbstractMap.SimpleEntry<>(new Customer(entry.getKey()),entry.getValue());
    }
}
