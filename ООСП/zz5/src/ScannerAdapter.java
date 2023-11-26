class ScannerAdapter implements PrintingDevice {
    private DocumentScanner scanner;

    public ScannerAdapter(DocumentScanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void print(String document) {
        scanner.scanDocument(document);
    }
}