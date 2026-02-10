//832. Flipping an Image
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int C = image[0].length;
        for (int[] row : image) {
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - i - 1] ^ 1;
                row[C - i - 1] = tmp;
            }
        }
        return image;
    }
}