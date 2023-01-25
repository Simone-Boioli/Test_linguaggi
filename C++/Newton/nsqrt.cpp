#include "nsqrt.h"


double nsqrt(double x, double epsilon)
{
  double s = x / 2;
  double diff;

  if (x == 0)
    return 0;

  do {
    s = (s*s + x) / (2 * s);
    diff = s*s - x;
  } while (diff < -epsilon || diff > epsilon);

  return s;
}
