package labfive.experiment;

import labfive.data.ResultsTable;
import labfive.sort.BubbleSort;
import labfive.sort.InsertionSort;
import labfive.sort.Sorter;

/**
 * An Experiment class that can run a campaign of experiments.
 *
 * @author Gregory M. Kapfhammer
 */

public class Experiment {

  /** Run a Sorter in an experiment campaign. */
  public static void main(String[] args) {
    RunCampaign runSorterCampaign = new RunCampaign();
    // Create a BubbleSort and run it in a campaign
    BubbleSort bubbleSort = new BubbleSort();
    ResultsTable bubbleSortResultsTable = runSorterCampaign.run(bubbleSort);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + bubbleSort.getName() + ":\n");
    System.out.println(bubbleSortResultsTable.toString());
    System.out.println();
    // Create an InsertionSort and run it in a campaign
    // TODO: Follow the strategy in the above exaple to evaluate InsertionSort
  }

}
