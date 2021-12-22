# Compile-Time-Errors
Salaj Rijal, Michael Kamela, Ariel Fuchs

## Tests Performed
We tested 10 trials for 3 data sets (of sizes 5M, 25M and 50M) and 1 trail for the worst possible case. For each trial we generated a random target and measured the time it would take for search to find said target in the array. In order to make sure that binary search yielded a significant result, we performed the binary search multiple times until the time taken became significant. Then, in order to maintain integrity of the result, we multiplied the linear search result by how many times we performed the binary search.

## Results
According to our results, binary search takes significantly less time to find a target in an array than linear search on average for all the data sets. In some peculiar test cases, however,
binary search for some reason took more time than linear search. However we believe this to be a mistake in our design of the experiment.

## Conclusions
We can confidently state that "relative to the size of the dataset, performing a binary search is significantly faster than performing a linear search". If we take a look at this statement with a mathematical perspective, the worst case scenarios for the number of guesses needed are given by the functions y=x (for lin search) and y=log_2(x) (for bin search). While the growth of a linear search is, well, linear, the growth of a binary search is represented by a logarithm. Logarithmic functions are very slow to grow, and as a result even the largest data sets take a fraction of the time used on a linear search to perform a binary search.
