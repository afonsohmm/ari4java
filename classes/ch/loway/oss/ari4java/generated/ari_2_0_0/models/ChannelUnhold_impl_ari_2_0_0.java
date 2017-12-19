package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Dec 19 09:55:49 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * A channel initiated a media unhold.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelUnhold_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ChannelUnhold, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel that initiated the unhold event.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_2_0_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

