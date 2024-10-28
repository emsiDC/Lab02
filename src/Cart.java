public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            this.itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Add success!");
        } else {
            System.out.println("Cart is full. Cannot add more DVDs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null && itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = null;
                qtyOrdered--;
                System.out.println("Remove success!");
                return; // exit method after removing the disc
            }
        }
        System.out.println("DVD not found in the cart.");
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                totalCost += this.itemsOrdered[i].getCost();
            }
        }
        return totalCost;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }
}
