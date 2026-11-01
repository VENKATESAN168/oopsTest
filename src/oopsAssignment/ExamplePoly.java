package oopsAssignment;

	class Payment {
	    void pay() {
	        System.out.println("Payment");
	    }
	}

	class UPIPayment extends Payment {
	    void pay() {
	        System.out.println("Paid using UPI");
	    }
	}

	class CardPayment extends Payment {
	    void pay() {
	        System.out.println("Paid using Card");
	    }
	}

	class CashPayment extends Payment {
	    void pay() {
	        System.out.println("Paid using Cash");
	    }
	}

	class ExamplePoly {
	    public static void main(String[] args) {
	        Payment p;

	        p = new UPIPayment();
	        p.pay();

	        p = new CardPayment();
	        p.pay();

	        p = new CashPayment();
	        p.pay();
	    }
	}


