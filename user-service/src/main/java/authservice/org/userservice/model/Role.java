package authservice.org.userservice.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBDocument
public class Role implements Serializable {

        private static final long serialVersionUID = 1L;

        private String role;


}
