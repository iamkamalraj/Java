package day33;

//48. Rotate Image

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
// 
//
//Example 1:
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Example 2:
//
//
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// 
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 20
//-1000 <= matrix[i][j] <= 1000

The rotate method starts by initializing the variable n to the length of the matrix, assuming it's a square matrix (number of rows = number of columns).
It then iterates over each column j from 0 to n-1, and for each column, it reverses the elements in that column. This is done by calling the reverse method, passing the start and end indices of the column to be reversed.
After reversing the columns, it iterates over each diagonal line of the matrix and swaps the elements along the diagonal. This is done by calling the diagonal method, passing the indices of the diagonal elements to be swapped.
Finally, the rotation process is completed, and the matrix is rotated by 90 degrees clockwise.

The reverse, diagonal, and swap methods are helper methods used within the rotate method to perform specific tasks such as reversing elements in a column, swapping elements, and rotating the diagonal elements.

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int j= 0;
        while(j<n){
            reverse(matrix, 0, j, n-1, j);
            j++;
        }
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;
        while(i1<n){
            daignol(matrix, i1, i2, j1, j2);
            i1++;
            j2++;
        }
        j2--;
        i1--;
        while(i2<n){
            i2++;
            j1++;
            if(i2>=n){
                break;
            }
            daignol(matrix, i1, i2, j1, j2);
        }
       
    }
    public void daignol(int[][] matrix, int i1, int j1, int i2, int j2){
        while(i2<i1){
            swap(matrix, i1, i2,j1,j2);
            i1--;
            j1++;
            i2++;
            j2--;
        }
    }
    public void reverse(int[][] matrix, int i1, int j1, int i2, int j2){
        while(i1<i2){
            swap(matrix, i1, i2,j1,j2);
            i1++;
            i2--;
        }
    }
    public void swap(int[][] matrix, int i1, int i2, int j1, int j2){
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}

