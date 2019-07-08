package com.verimatrix.kafka.consumer.process;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.verimatrix.kafka.consumer.data.VoaEventDup;

public class EventMsgValidator {

	public static void main(String[] args) throws InterruptedException {
		// to load application's properties, we use this class
		Properties props = new Properties();
		FileInputStream file;
		// the base folder is ./, the root of the main.properties file
		String path = "./config.properties";
		try {
			// load the file handle for main.properties
			file = new FileInputStream(path);
			// load all the properties from this file
			props.load(file);
			// we have loaded the properties, so close the file handle
			file.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props)) {
			consumer.subscribe(Collections.singletonList(props.getProperty("topic")));
			ObjectMapper mapper = new ObjectMapper();
			while (true) {
				ConsumerRecords<String, String> messages = consumer.poll(100);
				for (ConsumerRecord<String, String> message : messages) {
					System.out.println("Event JSON on KAFKA: \n" + message.value() + "\n");
					JsonNode actualObj = mapper.readTree(message.value());
					// Move pointer to Event Array in JSON
					JsonNode rootNode = actualObj.withArray("EVENT");
					if (rootNode != null && rootNode.isArray()) {
						ArrayNode arrayNode = (ArrayNode) rootNode;
						for (int i = 0; i < arrayNode.size(); i++) {
							JsonNode individualElement = arrayNode.get(i);
							// Deserialize the kafka json message to an object
							VoaEventDup result = mapper.readValue(individualElement.toString(),
									TypeFactory.defaultInstance().constructType(VoaEventDup.class));
							// Display all attributes of each events in topic
							displayAttributes(result);

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Print all the attributes of Event
	public static void displayAttributes(VoaEventDup result) {
		System.out.println("###########################################################################");
		System.out.println("# Event attributes for Event with event_sid: >>> " + result.getEvent_sid());
		System.out.println("###########################################################################");
		System.out.println("event_sid: " + result.getEvent_sid());
		System.out.println("event_metadata_sid: " + result.getEvent_metadata_sid());
		System.out.println("stream_sid: " + result.getStream_sid());
		System.out.println("odsession_sid: " + result.getOdsession_sid());
		System.out.println("content_asset_sid: " + result.getContent_asset_sid());
		System.out.println("service_group_sid: " + result.getService_group_sid());
		System.out.println("qam_sid: " + result.getQam_sid());
		System.out.println("stream_pump_sid: " + result.getStream_pump_sid());
		System.out.println("resource_mgr_sid: " + result.getResource_mgr_sid());
		System.out.println("source_device_sid: " + result.getSource_device_sid());
		System.out.println("application_type_sid: " + result.getApplication_type_sid());
		System.out.println("stream_output_port_sid: " + result.getStream_output_port_sid());
		System.out.println("menu_session_sid: " + result.getMenu_session_sid());
		System.out.println("source_data_key: " + result.getSource_data_key());
		System.out.println("stream_source_data_key: " + result.getStream_source_data_key());
		System.out.println("asset_source_data_key: " + result.getAsset_source_data_key());
		System.out.println("service_group_source_data_key: " + result.getService_group_source_data_key());
		System.out.println("content_file_name: " + result.getContent_file_name());
		System.out.println("asset_name: " + result.getAsset_name());
		System.out.println("provider: " + result.getProvider());
		System.out.println("product: " + result.getProduct());
		System.out.println("asset_class: " + result.getAsset_class());
		System.out.println("event_tstamp: " + result.getEvent_tstamp());
		System.out.println("description: " + result.getDescription());
		System.out.println("description_long: " + result.getDescription_long());
		System.out.println("source_event_code: " + result.getSource_event_code());
		System.out.println("trap_received_flag: " + result.isTrap_received_flag());
		System.out.println("application_created_flag: " + result.isApplication_created_flag());
		System.out.println("needs_stream_matching_flag: " + result.isNeeds_stream_matching_flag());
		System.out.println("mac_address: " + result.getMac_address());
		System.out.println("launch_category: " + result.getLaunch_category());
		System.out.println("session_id: " + result.getSession_id());
		System.out.println("stream_id: " + result.getStream_id());
		System.out.println("rec_create_time: " + result.getRec_create_time());
		System.out.println("rec_modify_time: " + result.getRec_modify_time());
		System.out.println("create_load_sid: " + result.getCreate_load_sid());
		System.out.println("modify_load_sid: " + result.getModify_load_sid());
		System.out.println("calsid: " + result.getCalsid());
		System.out.println("version: " + result.getVersion());
		System.out.println("source_event_code: " + result.getLaunch_category());
		System.out.println("event_name: " + result.getEvent_name());
		System.out.println("event_type_name: " + result.getEvent_type_name());
		System.out.println("event_code: " + result.getEvent_code());
		System.out.println("vendor: " + result.getVendor());
		System.out.println("stream_start_tstamp: " + result.getStream_start_tstamp());
		System.out.println("\n###########################################################################");
	}

}
