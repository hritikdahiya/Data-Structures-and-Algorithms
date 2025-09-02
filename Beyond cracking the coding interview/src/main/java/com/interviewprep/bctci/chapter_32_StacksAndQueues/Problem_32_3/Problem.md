# VIEWER COUNTER CLASS

## Problem statement

Streamers make money based on the number of views they receive while streaming. Implement a ViewerCounter class that
tracks the number of viewers within a configurable time window for a live stream event. Viewer types may be "guest", "
follower", or "subscriber".

```
ViewerCounter:
  __init__(window): establishes a window size ≥ 1.
  join(t, v): registers that a viewer of type v joined at time t.
  get_viewers(t, v): gets the viewer count of viewer type v within the time
window of length 'window' ending at timestamp t: [t - window, t], with both
endpoints included.
```

Both methods accept a timestamp t represented by an integer. It is guaranteed that each method call receives a time that
is greater than or equal to any timestamp used in previous calls to either join() or get_viewers().

## Constraints

- The number of join and get_viewers operations is at most 10^5
- 1 ≤ window ≤ 10^5

## Example 1

```
counter = ViewerCounter(10)
counter.join(1, "subscriber")
counter.join(1, "guest")
counter.join(2, "follower")
counter.join(2, "follower")
counter.join(2, "follower")
counter.join(3, "follower")
counter.get_viewers(10, "subscriber")  # Returns 1
counter.get_viewers(10, "guest")       # Returns 1
counter.get_viewers(10, "follower")    # Returns 4
counter.get_viewers(13, "follower")    # Returns 1
```