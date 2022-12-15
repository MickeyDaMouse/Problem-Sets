public class RottenPotato {

    public static void main(String[] args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7}};

        System.out.println(movieAvgRating(ratings, 0));
        System.out.println(reviewerAvgRating(ratings, 0));
        System.out.println(avgRating2022(ratings));
        System.out.println(hardestRater2022(ratings));
        System.out.println(worstMovie2022(ratings));
        System.out.println(isFresh(ratings, 1));
    }

    public static double movieAvgRating(int[][] ratings, int movie)
    {
        double avg = 0;
        for(int i=0; i<ratings.length; i++)
        {
            avg += ratings[i][movie];
        }

        avg/= ratings.length;
        return avg;
    }

    public static double reviewerAvgRating(int[][] ratings, int reviewer)
    {
        double avg = 0;
        for(int i=0; i<ratings[0].length; i++)
        {
            avg += ratings[reviewer][i];
        }

        avg/=ratings[0].length;
        return avg;
    }

    public static double avgRating2022(int[][] ratings)
    {
        double avg = 0;
        for(int[] i : ratings)
        {
            for(int j : i)
            {
                avg += j;
            }
        }

        avg/=(ratings[0].length*ratings.length);
        return avg;
    }

    public static int hardestRater2022(int[][] ratings)
    {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i=0; i<ratings.length; i++) {
            if (reviewerAvgRating(ratings, i) < min)
            {
                min = reviewerAvgRating(ratings, i);
                index = i;
            }
        }
        return index;
    }

    public static int worstMovie2022 (int[][] ratings)
    {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i=0; i<ratings[0].length; i++) {
            if (movieAvgRating(ratings, i) < min)
            {
                min = movieAvgRating(ratings, i);
                index = i;
            }
        }
        return index;
    }

    public static boolean isFresh(int[][] ratings, int movie)
    {
        return (movieAvgRating(ratings, movie) > avgRating2022(ratings));
    }

}
