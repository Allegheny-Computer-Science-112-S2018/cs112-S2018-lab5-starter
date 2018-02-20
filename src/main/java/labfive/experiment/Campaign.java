package labfive.experiment;

import labfive.data.ResultsTable;
import labfive.sort.Sorter;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a Sorter in an experiment. */
  public ResultsTable run(Sorter sort);

}
