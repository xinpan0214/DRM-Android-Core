package org.nypl.drm.core;

import com.io7m.jnull.NullCheck;

/**
 * <p>An Adobe device ID, typically in {@code urn:} form. This is <i>not</i> an
 * "Adobe ID", but is the internal representation that Adobe use to represent
 * device identifiers. These are exposed to the programmer via on-disk device
 * activation records, or when attempting to join accounts.</p>
 *
 * <p>This type exists to reduce the "everything is a string" aspect of the
 * native code API, and therefore to reduce any possibility of accidentally
 * mixing up values when calling functions.</p>
 */

public final class AdobeDeviceID
{
  private final String value;

  /**
   * Wrap a device ID.
   *
   * @param in_value The raw device ID.
   */

  public AdobeDeviceID(
    final String in_value)
  {
    this.value = NullCheck.notNull(in_value);
  }

  /**
   * @return The raw device ID value
   */

  public String getValue()
  {
    return this.value;
  }

  @Override public boolean equals(final Object o)
  {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    final AdobeDeviceID that = (AdobeDeviceID) o;
    return this.value.equals(that.value);
  }

  @Override public int hashCode()
  {
    return this.value.hashCode();
  }

  @Override public String toString()
  {
    return this.value;
  }
}
