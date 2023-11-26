class PrinterAdapter implements PrintingDevice {
    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String document) {
        printer.printDocument(document);
    }
}
