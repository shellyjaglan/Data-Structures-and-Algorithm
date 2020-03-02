//MatrixSpiralPrintUsingDirection
class Node{
    int first, second; 
    Node(int i, int j){
        first = i;
        second = j;
    }
}

class MatrixSpiralPrintUsingDirection{
    String direction = "east";
    public static void main(String[] args) {
        MatrixSpiralPrintUsingDirection obj = new MatrixSpiralPrintUsingDirection();

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
       
        obj.printMatrix(arr, 4, 4);
    }

    void printMatrix(int[][] arr, int row, int col){
        int count = 0;
        int mini = 0, minj = 0, maxi = row-1, maxj = col-1, i = 0, j = 0;

        while(count < (row*col)){
            System.out.println("count "+ count);
            System.out.println("i and j "+i+" "+ j);

            System.out.print(arr[i][j] + " ");
            count++;

            Node p = next(i, j, direction);

            if(!isValid(p.first, p.second, row, col) || alreadyVisited(p.first, p.second, mini, minj, maxi, maxj)){
                if (!alreadyVisited(i, j, mini, minj, maxi, maxj)) 
                    ConstraintWalls(mini, minj, maxi, maxj, direction); 

                turnright(direction);
                p = next(i, j, direction);
            }
            i = p.first;
            j = p.second;
        }
    }

    Node next(int i, int j, String direction){
        switch(direction){
            case "east":
                j++;
                break;
            case "south":
                i++;
                break;
            case "west":
                j--;
                break;
            case "north":
                i--;
                break;
        }

        return new Node(i,j);
    }

    boolean isValid(int i, int j, int row, int col){
        if (i < row && i >= 0 && j >= 0 && j < col) 
            return true; 
        return false; 
    }

    boolean alreadyVisited(int i, int j, int mini, int minj, int maxi, int maxj){
        if (i >= mini && i <= maxi && j >= minj && j <= maxj) 
            return false; 
        return true;
    }

    void ConstraintWalls(int mini, int minj, int  maxi, int  maxj, String direction) { 
        // Update the constraints according 
        // to the direction 
        switch (direction) { 
            case "east": 
                mini++; 
                break; 
            case "west": 
                maxi--; 
                break; 
            case "north": 
                minj++; 
                break; 
            case "south": 
                maxj--; 
                break; 
        } 
    }

    void turnright(String direction){ 
        switch (direction) { 
            case "east": 
                direction = "south"; 
                break; 
            case "west": 
                direction = "north"; 
                break; 
            case "north": 
                direction = "east"; 
                break; 
            case "south": 
                direction = "west"; 
                break; 
        } 
    } 
}