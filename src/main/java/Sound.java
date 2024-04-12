import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    //returns total number of values changed. 
    int nums = 0;
  for(int i = 0; i < samples.length; i++){
    if(samples[i] > 0 && samples[i] > limit){
      samples[i] = limit;
      nums++;
    }
    else if(samples[i] < 0 && samples[i] < -limit){
      samples[i] = -limit;
      nums++;
    }
  }
    return nums;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int i  = 0; 
    while(samples[i] == 0){
      i++;
    }
    int[] newSamples = new int[samples.length - i];
    for(int k = 0; k < newSamples.length; i++){
      newSamples[k] = samples[k+1];
    }
  }
}
