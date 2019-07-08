package com.verimatrix.kafka.consumer.data;

import java.sql.Timestamp;

//Background: Dispatching connector while serializing the VoaEvent object, set the mapper property to generate lower case JSON, 
//which creates a problem when we tried consuming and deserializing it because the property names were case different in coming json and mapper.
//So to enable the mapper to do so, created a VoaEventDup by changing case to small.

//Duplicate Class for VoaEvent, is differs only in terms of it has Lower case attributes names.
public class VoaEventDup {

	protected Long calsid = null;
	protected String version = null;
	protected Timestamp rec_create_time;
	protected Timestamp rec_modify_time;
	private long event_sid = 0;
	private long modify_load_sid;
	private long create_load_sid;
	private Integer event_metadata_sid;
	private Long stream_sid;
	private Long odsession_sid;
	private Integer menu_session_sid;
	private Integer content_asset_sid;
	private Integer service_group_sid;
	private Integer qam_sid;
	private Integer stream_pump_sid;
	private Integer resource_mgr_sid;
	private Integer source_device_sid;
	private Integer application_type_sid;
	private Integer stream_output_port_sid;
	private String source_data_key;
	private String asset_source_data_key;
	private String stream_source_data_key;
	private String session_id;
	private String stream_id;
	private String content_file_name;
	private String provider;
	private String product;
	private String asset_name;
	private String asset_class;
	private Timestamp event_tstamp;
	private String description;
	private String description_long;
	private String source_event_code;
	private String launch_category;
	private boolean trap_received_flag;
	private boolean application_created_flag;
	private String mac_address;
	private boolean needs_stream_matching_flag;
	private String service_group_source_data_key;
	private String event_name;
	private String event_type_name;
	private String event_code;
	private String vendor;
	private Timestamp stream_start_tstamp;

	public VoaEventDup() {

	}

	public Long getCalsid() {
		return calsid;
	}

	public void setCalsid(Long calsid) {
		this.calsid = calsid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Timestamp getRec_create_time() {
		return rec_create_time;
	}

	public void setRec_create_time(Timestamp rec_create_time) {
		this.rec_create_time = rec_create_time;
	}

	public Timestamp getRec_modify_time() {
		return rec_modify_time;
	}

	public void setRec_modify_time(Timestamp rec_modify_time) {
		this.rec_modify_time = rec_modify_time;
	}

	public long getEvent_sid() {
		return event_sid;
	}

	public void setEvent_sid(long event_sid) {
		this.event_sid = event_sid;
	}

	public long getModify_load_sid() {
		return modify_load_sid;
	}

	public void setModify_load_sid(long modify_load_sid) {
		this.modify_load_sid = modify_load_sid;
	}

	public long getCreate_load_sid() {
		return create_load_sid;
	}

	public void setCreate_load_sid(long create_load_sid) {
		this.create_load_sid = create_load_sid;
	}

	public Integer getEvent_metadata_sid() {
		return event_metadata_sid;
	}

	public void setEvent_metadata_sid(Integer event_metadata_sid) {
		this.event_metadata_sid = event_metadata_sid;
	}

	public Long getStream_sid() {
		return stream_sid;
	}

	public void setStream_sid(Long stream_sid) {
		this.stream_sid = stream_sid;
	}

	public Long getOdsession_sid() {
		return odsession_sid;
	}

	public void setOdsession_sid(Long odsession_sid) {
		this.odsession_sid = odsession_sid;
	}

	public Integer getMenu_session_sid() {
		return menu_session_sid;
	}

	public void setMenu_session_sid(Integer menu_session_sid) {
		this.menu_session_sid = menu_session_sid;
	}

	public Integer getContent_asset_sid() {
		return content_asset_sid;
	}

	public void setContent_asset_sid(Integer content_asset_sid) {
		this.content_asset_sid = content_asset_sid;
	}

	public Integer getService_group_sid() {
		return service_group_sid;
	}

	public void setService_group_sid(Integer service_group_sid) {
		this.service_group_sid = service_group_sid;
	}

	public Integer getQam_sid() {
		return qam_sid;
	}

	public void setQam_sid(Integer qam_sid) {
		this.qam_sid = qam_sid;
	}

	public Integer getStream_pump_sid() {
		return stream_pump_sid;
	}

	public void setStream_pump_sid(Integer stream_pump_sid) {
		this.stream_pump_sid = stream_pump_sid;
	}

	public Integer getResource_mgr_sid() {
		return resource_mgr_sid;
	}

	public void setResource_mgr_sid(Integer resource_mgr_sid) {
		this.resource_mgr_sid = resource_mgr_sid;
	}

	public Integer getSource_device_sid() {
		return source_device_sid;
	}

	public void setSource_device_sid(Integer source_device_sid) {
		this.source_device_sid = source_device_sid;
	}

	public Integer getApplication_type_sid() {
		return application_type_sid;
	}

	public void setApplication_type_sid(Integer application_type_sid) {
		this.application_type_sid = application_type_sid;
	}

	public Integer getStream_output_port_sid() {
		return stream_output_port_sid;
	}

	public void setStream_output_port_sid(Integer stream_output_port_sid) {
		this.stream_output_port_sid = stream_output_port_sid;
	}

	public String getSource_data_key() {
		return source_data_key;
	}

	public void setSource_data_key(String source_data_key) {
		this.source_data_key = source_data_key;
	}

	public String getAsset_source_data_key() {
		return asset_source_data_key;
	}

	public void setAsset_source_data_key(String asset_source_data_key) {
		this.asset_source_data_key = asset_source_data_key;
	}

	public String getStream_source_data_key() {
		return stream_source_data_key;
	}

	public void setStream_source_data_key(String stream_source_data_key) {
		this.stream_source_data_key = stream_source_data_key;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getStream_id() {
		return stream_id;
	}

	public void setStream_id(String stream_id) {
		this.stream_id = stream_id;
	}

	public String getContent_file_name() {
		return content_file_name;
	}

	public void setContent_file_name(String content_file_name) {
		this.content_file_name = content_file_name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getAsset_class() {
		return asset_class;
	}

	public void setAsset_class(String asset_class) {
		this.asset_class = asset_class;
	}

	public Timestamp getEvent_tstamp() {
		return event_tstamp;
	}

	public void setEvent_tstamp(Timestamp event_tstamp) {
		this.event_tstamp = event_tstamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription_long() {
		return description_long;
	}

	public void setDescription_long(String description_long) {
		this.description_long = description_long;
	}

	public String getSource_event_code() {
		return source_event_code;
	}

	public void setSource_event_code(String source_event_code) {
		this.source_event_code = source_event_code;
	}

	public String getLaunch_category() {
		return launch_category;
	}

	public void setLaunch_category(String launch_category) {
		this.launch_category = launch_category;
	}

	public boolean isTrap_received_flag() {
		return trap_received_flag;
	}

	public void setTrap_received_flag(boolean trap_received_flag) {
		this.trap_received_flag = trap_received_flag;
	}

	public boolean isApplication_created_flag() {
		return application_created_flag;
	}

	public void setApplication_created_flag(boolean application_created_flag) {
		this.application_created_flag = application_created_flag;
	}

	public String getMac_address() {
		return mac_address;
	}

	public void setMac_address(String mac_address) {
		this.mac_address = mac_address;
	}

	public boolean isNeeds_stream_matching_flag() {
		return needs_stream_matching_flag;
	}

	public void setNeeds_stream_matching_flag(boolean needs_stream_matching_flag) {
		this.needs_stream_matching_flag = needs_stream_matching_flag;
	}

	public String getService_group_source_data_key() {
		return service_group_source_data_key;
	}

	public void setService_group_source_data_key(String service_group_source_data_key) {
		this.service_group_source_data_key = service_group_source_data_key;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_type_name() {
		return event_type_name;
	}

	public void setEvent_type_name(String event_type_name) {
		this.event_type_name = event_type_name;
	}

	public String getEvent_code() {
		return event_code;
	}

	public void setEvent_code(String event_code) {
		this.event_code = event_code;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Timestamp getStream_start_tstamp() {
		return stream_start_tstamp;
	}

	public void setStream_start_tstamp(Timestamp stream_start_tstamp) {
		this.stream_start_tstamp = stream_start_tstamp;
	}

}
