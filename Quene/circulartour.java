package Quene;

class circulartour {
    public int circularTour(int[] petrol, int[] dist) {
        int total = 0;
        int curr = 0;
        int start = 0;

        for(int i = 0; i < petrol.length; i++){
            int diff = petrol[i] - dist[i];

            total += diff;
            curr += diff;

            // agar current negative ho gaya → reset
            if(curr < 0){
                start = i + 1;
                curr = 0;
            }
        }

        // agar total negative hai → possible nahi
        return (total >= 0) ? start : -1;
    }
    public static void main(String[] args){
        circulartour tour = new circulartour();
        int[] petrol = {4, 6, 7, 4};
        int[] dist = {6, 5, 3, 5};

        int startPoint = tour.circularTour(petrol, dist);
        if(startPoint != -1){
            System.out.println("Circular tour can start at index: " + startPoint);
        } else {
            System.out.println("No circular tour possible.");
        }
    }
}