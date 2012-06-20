

package jp.redmine.redmineclient.entity;

import java.util.Date;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class RedmineIssue {
	public final static String ID = "id";
	public final static String CONNECTION = "connection_id";
	public final static String PROJECT_ID = "project_id";
	public final static String ISSUE_ID = "issue_id";
	public final static String NAME = "name";

    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField(uniqueIndexName="issue_target")
    private Integer connection_id;
    @DatabaseField(foreign = true,foreignColumnName="project_id", columnName= "project_id", foreignAutoRefresh = true)
    private RedmineProject project;
    @DatabaseField(uniqueIndexName="issue_target")
    private Integer issue_id;
    @DatabaseField(foreign = true,foreignColumnName="tracker_id", columnName= "tracker_id", foreignAutoRefresh = true)
    private RedmineTracker tracker;
    @DatabaseField(foreign = true,foreignColumnName="status_id", columnName= "status_id", foreignAutoRefresh = true)
    private RedmineStatus status;
    @DatabaseField(foreign = true,foreignColumnName="priority_id", columnName= "priority_id", foreignAutoRefresh = true)
    private RedminePriority priority;
    @DatabaseField(foreign = true,foreignColumnName="user_id", columnName= "author_id", foreignAutoRefresh = true)
    private RedmineUser author;
    @DatabaseField(foreign = true,foreignColumnName="user_id", columnName= "assign_id", foreignAutoRefresh = true)
    private RedmineUser assigned;
    @DatabaseField(foreign = true,foreignColumnName="category_id", columnName= "category_id", foreignAutoRefresh = true)
    private RedmineProjectCategory category;
    @DatabaseField(foreign = true,foreignColumnName="version_id", columnName= "version_id", foreignAutoRefresh = true)
    private RedmineProjectVersion version;
    @DatabaseField
    private int parent_id;
    @DatabaseField
    private String subject;
    @DatabaseField
    private String description;
    @DatabaseField
    private Date start_date;
    @DatabaseField
    private Date due_date;
    @DatabaseField
    private short progress_rate;
    @DatabaseField
    private short done_rate;
    @DatabaseField
    private double estimated_hours;
    @DatabaseField
    private boolean is_private;
    @DatabaseField
    private Date created;
    @DatabaseField
    private Date modified;


    @Override
    public String toString(){
    	return subject;
    }


    /**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	////////////////////////////////////////////////////////
	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param connection セットする connection
	 */
	public void RedmineConnection(RedmineConnection connection) {
		this.connection_id = connection.getId();
	}
	/**
	 * @param created セットする created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * @return created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param modified セットする modified
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}
	/**
	 * @return modified
	 */
	public Date getModified() {
		return modified;
	}


	/**
	 * @param project セットする project
	 */
	public void setProject(RedmineProject project) {
		this.project = project;
	}


	/**
	 * @return project
	 */
	public RedmineProject getProject() {
		return project;
	}


	/**
	 * @param connection_id セットする connection_id
	 */
	public void setConnectionId(Integer connection_id) {
		this.connection_id = connection_id;
	}


	/**
	 * @return connection_id
	 */
	public Integer getConnectionId() {
		return connection_id;
	}


	/**
	 * @param issue_id セットする issue_id
	 */
	public void setIssueId(Integer issue_id) {
		this.issue_id = issue_id;
	}


	/**
	 * @return issue_id
	 */
	public Integer getIssueId() {
		return issue_id;
	}


	/**
	 * @param tracker セットする tracker
	 */
	public void setTracker(RedmineTracker tracker) {
		this.tracker = tracker;
	}


	/**
	 * @return tracker
	 */
	public RedmineTracker getTracker() {
		return tracker;
	}


	/**
	 * @param status セットする status
	 */
	public void setStatus(RedmineStatus status) {
		this.status = status;
	}


	/**
	 * @return status
	 */
	public RedmineStatus getStatus() {
		return status;
	}


	/**
	 * @param priority セットする priority
	 */
	public void setPriority(RedminePriority priority) {
		this.priority = priority;
	}


	/**
	 * @return priority
	 */
	public RedminePriority getPriority() {
		return priority;
	}


	/**
	 * @param author セットする author
	 */
	public void setAuthor(RedmineUser author) {
		this.author = author;
	}


	/**
	 * @return author
	 */
	public RedmineUser getAuthor() {
		return author;
	}


	/**
	 * @param assigned セットする assigned
	 */
	public void setAssigned(RedmineUser assigned) {
		this.assigned = assigned;
	}


	/**
	 * @return assigned
	 */
	public RedmineUser getAssigned() {
		return assigned;
	}


	/**
	 * @param category セットする category
	 */
	public void setCategory(RedmineProjectCategory category) {
		this.category = category;
	}


	/**
	 * @return category
	 */
	public RedmineProjectCategory getCategory() {
		return category;
	}


	/**
	 * @param subject セットする subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}


	/**
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}


	/**
	 * @param start_date セットする start_date
	 */
	public void setDateStart(Date start_date) {
		this.start_date = start_date;
	}


	/**
	 * @return start_date
	 */
	public Date getDateStart() {
		return start_date;
	}


	/**
	 * @param due_date セットする due_date
	 */
	public void setDateDue(Date due_date) {
		this.due_date = due_date;
	}


	/**
	 * @return due_date
	 */
	public Date getDateDue() {
		return due_date;
	}


	/**
	 * @param progress_rate セットする progress_rate
	 */
	public void setProgressRate(short progress_rate) {
		this.progress_rate = progress_rate;
	}


	/**
	 * @return progress_rate
	 */
	public short getProgressRate() {
		return progress_rate;
	}


	/**
	 * @param done_rate セットする done_rate
	 */
	public void setDoneRate(short done_rate) {
		this.done_rate = done_rate;
	}


	/**
	 * @return done_rate
	 */
	public short getDoneRate() {
		return done_rate;
	}


	/**
	 * @param estimated_hours セットする estimated_hours
	 */
	public void setEstimatedHours(double estimated_hours) {
		this.estimated_hours = estimated_hours;
	}


	/**
	 * @return estimated_hours
	 */
	public double getEstimatedHours() {
		return estimated_hours;
	}


	/**
	 * @param is_private セットする is_private
	 */
	public void setIsPrivate(boolean is_private) {
		this.is_private = is_private;
	}


	/**
	 * @return is_private
	 */
	public boolean isIsPrivate() {
		return is_private;
	}


	public void setRedmineConnection(RedmineConnection info) {
		// TODO 自動生成されたメソッド・スタブ
		setConnectionId(info.getId());
	}


	/**
	 * @param version セットする version
	 */
	public void setVersion(RedmineProjectVersion version) {
		this.version = version;
	}


	/**
	 * @return version
	 */
	public RedmineProjectVersion getVersion() {
		return version;
	}


	/**
	 * @param parent_id セットする parent_id
	 */
	public void setParentId(int parent_id) {
		this.parent_id = parent_id;
	}


	/**
	 * @return parent_id
	 */
	public int getParentId() {
		return parent_id;
	}


}
