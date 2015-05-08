import com.sitewhere.common.*;
import com.sitewhere.bluvision.bluzone.*;

ScanData scan = MarshalUtils.unmarshalJson(payload.getBytes(), ScanData.class);
if (scan.getBlufiId() != null) {
	BluFiData blufi = (new BluZoneClient()).getBluFiData(scan.getProjectId(), scan.getBlufiId());
	logger.info(MarshalUtils.marshalJsonAsString(blufi));
}

// logger.info("type:"  + scan.getAdvData()[0].getType() + " blufiId:" + scan.getBlufiId());

// logger.info(MarshalUtils.marshalJsonAsString(scan));
