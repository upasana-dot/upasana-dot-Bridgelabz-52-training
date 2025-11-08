interface DataExporter {
    void exportToCSV();
    void exportToJSON();
}
class UserDataExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting user data to CSV format");
    }

    public void exportToJSON() {
        System.out.println("Exporting user data to JSON format");
    }
}
class ProductDataExporter implements DataExporter {
    public void exportToCSV() {                         
        System.out.println("Exporting product data to CSV format");
    }           
}