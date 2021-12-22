# Compile-Time-Errors
Salaj Rijal, Michael Kamela, Ariel Fuchs

## Tests Performed
We tested 10 trials for 3 data sets (of sizes 1M, 10M and 50M). For each trial we generated a random target and measured the time it would take for search to find said target in the array. In order to make sure that binary search yielded a significant result, we multiplied 

## Results
Linear search takes on average several milliseconds to complete. The binary search is completed much faster, to the point that for most data sets measuring milliseconds does not yield significant results. To counteract this, we used a while loop that kept on repeating binary search until the result became significant, and then multiplied how many iterations it took to the result of the linear search. Binary search taking significantly less time is to be expected; looking from a mathematical perspective, the worst case scenarios for the number of guesses needed are given by the functions y=x (for lin search) and y=log_2(x) (for bin search). While the growth of a linear search is, well, linear, the growth of a binary search is represented by a logarithm. Logarithmic functions are very slow to grow, and as a result even the largest data sets take a fraction of the time used on a linear search to perform a binary search.

## Conclusions
Relative to the size of the dataset, performing a binary search is significantly faster than performing a linear search.

CREDIT TO TEAM PUNTY FOR MULTIPLER IDEA

CREDIT TO TEAM JAVACOFFE FOR BETTER PRINT STATEMENTS IDEA

CREDIT TO UPTOWN LEAPORD ROCK FOR WORST CASE IDEA (ALTHOUGH WE ALTERED)
