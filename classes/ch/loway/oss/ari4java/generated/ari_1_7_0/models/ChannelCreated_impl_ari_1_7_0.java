package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Feb 04 15:23:09 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that a channel has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelCreated_impl_ari_1_7_0 extends Event_impl_ari_1_7_0 implements ChannelCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_7_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

