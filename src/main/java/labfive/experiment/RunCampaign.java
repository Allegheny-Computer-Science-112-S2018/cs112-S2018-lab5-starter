package labfive.experiment;

import labfive.data.ResultsTable;
import labfive.sort.Sorter;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a Sorter.
 *
 * @author Gregory M. Kapfhammer
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 250;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The total number of input size doubles to perform for an experiment campaign. */
  private static final int CAMPAIGN_LENGTH = 10;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Randomly generate data to use for an experiment. */
  public int[] generateRandomData(int size) {
    Random random = new Random();
    int[] generated = new int[size];
    // TODO: Iteratively generate the values in the int[] array
    return generated;
  }

  /** Run a Sorter in an experiment campaign. */
  public ResultsTable run(Sorter sort) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);
    System.out.println("Starting a campaign of experiments with " + sort.getName() + " ...");
    while (campaignRound < CAMPAIGN_LENGTH) {
      // TODO: Generate the input array of the required size
      // TODO: Sort the array, using Code Fragment 4.1's strategy for recording timings
      // TODO: Add the result to the instance of the ResultsTable
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      // TODO: Grow to the next size for the input
      // TODO: Go to the next round of the experiment campaign
    }
    System.out.println("... Finishing a campaign of experiments with " + sort.getName());
    return results;
  }

}
