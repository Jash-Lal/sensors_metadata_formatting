import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.sns.model.PublishResult;
import org.elasticsearch.action.index.IndexResponse;

public class Handler implements RequestHandler<SQSEvent, String> {

    /**
     * Gets invoked when an SQS message is received.
     * SQS message is sent when object is added to sensorspublicingest S3 bucket
     * The object is accessed and its information is sent to the MetadataSender and the Detector
     *
     * @param event is the S3Event that occurred
     * @param ctx   is the information about the event
     * @return null
     */
    public String handleRequest(SQSEvent event, Context ctx) {

        LambdaLogger logger = ctx.getLogger();

        for (SQSEvent.SQSMessage msg : event.getRecords()) {

        }
        return null;
    }
}