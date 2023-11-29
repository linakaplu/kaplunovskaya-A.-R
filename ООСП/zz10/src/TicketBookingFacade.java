class TicketBookingFacade {
    private Events events;
    private PaymentSubsystem paymentSubsystem;

    public TicketBookingFacade() {
        this.events = new Events();
        this.paymentSubsystem = new PaymentSubsystem();
    }

    public void displayAvailableEvents() {
        events.displayEvents();
    }

    public void selectEvent(String eventName) {
        events.bookSeat(eventName);
    }

    public void payForTicket(int paymentOption) {
        switch (paymentOption) {
            case 1:
                paymentSubsystem.payByCash();
                break;
            case 2:
                paymentSubsystem.payByCard();
                break;
            default:
                System.out.println("Такого способа нет");
                break;
        }
    }
}
