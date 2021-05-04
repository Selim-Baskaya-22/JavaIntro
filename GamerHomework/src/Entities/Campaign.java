package Entities;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private int campaignRate;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, int campaignRate) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}

}
