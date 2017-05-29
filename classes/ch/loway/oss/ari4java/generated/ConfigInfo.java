package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Feb 04 15:23:09 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ConfigInfo {

// String getName
/**********************************************************
 * Asterisk system name.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getName();



// double getMax_load
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public double getMax_load();



// SetId getSetid
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public SetId getSetid();



// void setMax_channels int
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_channels(int val );



// int getMax_channels
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public int getMax_channels();



// void setDefault_language String
/**********************************************************
 * Default language for media playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDefault_language(String val );



// void setSetid SetId
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setSetid(SetId val );



// String getDefault_language
/**********************************************************
 * Default language for media playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDefault_language();



// int getMax_open_files
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since ari_0_0_1
 *********************************************************/
 public int getMax_open_files();



// void setMax_open_files int
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_open_files(int val );



// void setName String
/**********************************************************
 * Asterisk system name.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(String val );



// void setMax_load double
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_load(double val );


}
;
